package zw.ac.shexatech.student_mgt_app.organizationHelpers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.shexatech.student_mgt_app.models.Organization;
import zw.ac.shexatech.student_mgt_app.repositories.OrganizationRepository;

@Service
public class IsOrganizationNameDuplicate {

    @Autowired
    private OrganizationRepository organizationRepository;

    public boolean isOrgNameDuplicate(String orgName){
        Organization org = organizationRepository.findByOrgName(orgName);
        return org != null; // this returns false if org is null and true if org is not null
    }
}
