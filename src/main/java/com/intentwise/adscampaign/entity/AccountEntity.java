package com.intentwise.adscampaign.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "account")
public class AccountEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Long accountId;

    @Column(name = "account_name")
    private String accountName;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "organisation_id")
    @JsonIgnore
    private OrganisationEntity organisation;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<CampaignEntity> campaigns;

    public List<CampaignEntity> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(List<CampaignEntity> campaigns) {
        this.campaigns = campaigns;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OrganisationEntity getOrganisation() {
        return organisation;
    }

    public void setOrganisation(OrganisationEntity organisation) {
        this.organisation = organisation;
    }





}
