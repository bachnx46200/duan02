package com.enao.team2.quanlynhanvien.service;

import com.enao.team2.quanlynhanvien.model.Account;

import java.util.Optional;

public interface IAccountService {
    Optional<Account> findByEmail(String email);

    Account save(Account newaccount);
}
