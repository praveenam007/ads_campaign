package com.intentwise.adscampaign.repository;

import com.intentwise.adscampaign.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<AccountEntity, Long> {
}