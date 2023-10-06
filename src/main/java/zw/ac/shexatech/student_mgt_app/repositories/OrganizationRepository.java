package zw.ac.shexatech.student_mgt_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.ac.shexatech.student_mgt_app.models.Organization;

import java.io.Serializable;
@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    Organization findByOrgName(String orgName);
}
