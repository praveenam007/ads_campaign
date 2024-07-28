package com.intentwise.adscampaign.controller;

import com.intentwise.adscampaign.entity.OrganisationEntity;
import com.intentwise.adscampaign.repository.OrganisationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/organisation")
public class OrganisationController {
    @Autowired
    OrganisationRepo organisationRepo;
    @GetMapping
    public List<OrganisationEntity> getAllOrganisations(){
        return organisationRepo.findAll();
    }
    @PostMapping("add")
    public OrganisationEntity addOrganisation(@RequestBody OrganisationEntity organisation) {
        return organisationRepo.save(organisation);

    }
    @GetMapping("/{id}")
    public OrganisationEntity getOrganisationById(@PathVariable Long id){
        return organisationRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Organisation not found"));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOrganisation(@PathVariable Long id) {
        organisationRepo.deleteById(id);
    }

}
