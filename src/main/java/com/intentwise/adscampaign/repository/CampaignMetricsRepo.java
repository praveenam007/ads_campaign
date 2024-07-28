package com.intentwise.adscampaign.repository;

import com.intentwise.adscampaign.entity.CampaignMetricsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignMetricsRepo extends JpaRepository<CampaignMetricsEntity, Long> {
}