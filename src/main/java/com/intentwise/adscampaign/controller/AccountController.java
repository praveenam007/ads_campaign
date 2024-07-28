package com.intentwise.adscampaign.controller;


import com.intentwise.adscampaign.entity.AccountEntity;
import com.intentwise.adscampaign.repository.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountRepo accountRepo;

    @GetMapping
    public List<AccountEntity> getAllAccounts() {
        return accountRepo.findAll();
    }

    @PostMapping("account/add")
    public AccountEntity addAccount(@RequestBody AccountEntity account) {
        return accountRepo.save(account);
    }


    @PutMapping("account/edit/{id}")
    public AccountEntity ediAccount(@PathVariable Long id,@RequestBody AccountEntity updatedAccount){
        AccountEntity account = accountRepo.findById(id).orElseThrow();
        account.setStatus(updatedAccount.getStatus());
        return accountRepo.save(account);

    }
    @DeleteMapping("account/delete/{id}")
    public void deleteAccount(@PathVariable Long id) {
        accountRepo.deleteById(id);
    }

}
