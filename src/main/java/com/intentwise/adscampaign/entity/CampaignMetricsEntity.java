package com.intentwise.adscampaign.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "campaign_metrics")
public class CampaignMetricsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "metrics_id")
    private Long metricsId;
    @Column(name = "spend")
    private Double spend;
    @Column(name = "revenue")
    private Double revenue;
    @Column(name = "impressions")
    private Integer impressions;
    @Column(name = "clicks")
    private Integer clicks;
    @Column(name = "date")
    private Date date;
    @ManyToOne
    @JoinColumn(name = "campaign_id")
    @JsonIgnore
    private CampaignEntity campaign;


    public Long getMetricsId() {
        return metricsId;
    }

    public void setMetricsId(Long metricsId) {
        this.metricsId = metricsId;
    }

    public Double getSpend() {
        return spend;
    }

    public void setSpend(Double spend) {
        this.spend = spend;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Integer getImpressions() {
        return impressions;
    }

    public void setImpressions(Integer impressions) {
        this.impressions = impressions;
    }

    public Integer getClicks() {
        return clicks;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public CampaignEntity getCampaign() {
        return campaign;
    }

    public void setCampaign(CampaignEntity campaign) {
        this.campaign = campaign;
    }


}
