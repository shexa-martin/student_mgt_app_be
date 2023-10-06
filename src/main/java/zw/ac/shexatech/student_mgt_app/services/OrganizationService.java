package zw.ac.shexatech.student_mgt_app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import zw.ac.shexatech.student_mgt_app.exceptions.MyExceptions;
import zw.ac.shexatech.student_mgt_app.models.Organization;
import zw.ac.shexatech.student_mgt_app.organizationHelpers.IsOrganizationNameDuplicate;
import zw.ac.shexatech.student_mgt_app.repositories.OrganizationRepository;

import java.sql.Timestamp;

@Service
public class OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;
    @Autowired
    private IsOrganizationNameDuplicate isOrganizationNameDuplicate;

    public Organization regOrg(Organization organization) throws MyExceptions{
        if(isOrganizationNameDuplicate.isOrgNameDuplicate(organization.getOrgName())){
            throw new MyExceptions(organization.getOrgName()+" already in use");
        }else{
            Timestamp now = new Timestamp(System.currentTimeMillis());
            organization.setCreatedAt(now);
            return organizationRepository.save(organization);
        }
    }
}
