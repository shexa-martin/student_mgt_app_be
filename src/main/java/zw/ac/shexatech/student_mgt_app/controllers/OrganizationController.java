package zw.ac.shexatech.student_mgt_app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import zw.ac.shexatech.student_mgt_app.exceptions.MyExceptions;
import zw.ac.shexatech.student_mgt_app.models.Organization;
import zw.ac.shexatech.student_mgt_app.services.OrganizationService;

import java.util.List;

@Controller
@RequestMapping("/org")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    @PostMapping("/reg")
    public ResponseEntity<Organization> reg(@RequestBody Organization organization) throws MyExceptions{
        return new ResponseEntity<>(organizationService.regOrg(organization), HttpStatus.CREATED);
    }
    
}
