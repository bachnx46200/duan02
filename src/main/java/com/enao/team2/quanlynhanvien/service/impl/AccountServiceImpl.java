package com.enao.team2.quanlynhanvien.service.impl;

import com.enao.team2.quanlynhanvien.model.Account;
import com.enao.team2.quanlynhanvien.repository.AccountRepository;
import com.enao.team2.quanlynhanvien.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    AccountRepository accountRepository;

    @Override
    public Optional<Account> findByEmail(String email) {
        return accountRepository.findByEmail(email);
    }

    @Override
    public Account save(Account newaccount) {
        return accountRepository.save(newaccount);
    }
}
