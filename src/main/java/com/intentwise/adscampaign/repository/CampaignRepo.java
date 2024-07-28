package com.intentwise.adscampaign.repository;

import com.intentwise.adscampaign.entity.CampaignEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepo extends JpaRepository<CampaignEntity, Long> {
}