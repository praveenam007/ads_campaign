package com.intentwise.adscampaign.controller;

import com.intentwise.adscampaign.entity.CampaignEntity;
import com.intentwise.adscampaign.repository.CampaignRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/campaign")
public class CampaignController {

    @Autowired
    CampaignRepo campaignRepo;

    @GetMapping
    public List<CampaignEntity> getAllCampaigns() {
        return campaignRepo.findAll();
    }

    @PostMapping("campaign/add")
    public CampaignEntity addCampaign(@RequestBody CampaignEntity campaign) {
        return campaignRepo.save(campaign);
    }

    @PutMapping("campaign/edit/{id}")
    public CampaignEntity editCampaign(@PathVariable Long id, @RequestBody CampaignEntity updatedCampaign) {
        CampaignEntity campaign = campaignRepo.findById(id).orElseThrow();
        campaign.setCampaignName(updatedCampaign.getCampaignName());
        campaign.setStatus(updatedCampaign.getStatus());
        return campaignRepo.save(campaign);
    }

    @DeleteMapping("campaign/delete/{id}")
    public void deleteCampaign(@PathVariable Long id) {
        campaignRepo.deleteById(id);
    }
}
