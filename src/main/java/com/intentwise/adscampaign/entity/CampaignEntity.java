package com.intentwise.adscampaign.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "campaign")
public class CampaignEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "campaign_id")
    private Long campaignId;
    @Column(name = "campaign_name")
    private String campaignName;
    @Column(name = "status")
    private String status;
    @Column(name = "budget")
    private Double budget;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "account_id")
    private AccountEntity account;

    @OneToMany(mappedBy = "campaign", cascade = CascadeType.ALL)
    private List<CampaignMetricsEntity> metrics;


    public Long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public List<CampaignMetricsEntity> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<CampaignMetricsEntity> metrics) {
        this.metrics = metrics;
    }

    public AccountEntity getAccount() {
        return account;
    }

    public void setAccount(AccountEntity account) {
        this.account = account;
    }

}
