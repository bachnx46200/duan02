package com.enao.team2.quanlynhanvien.controller;

import com.enao.team2.quanlynhanvien.DTOs.AccountDTO;
import com.enao.team2.quanlynhanvien.DTOs.HocSinhDTO;
import com.enao.team2.quanlynhanvien.convert.AccountConvert;
import com.enao.team2.quanlynhanvien.convert.HocSinhConvert;
import com.enao.team2.quanlynhanvien.model.Account;
import com.enao.team2.quanlynhanvien.model.Hocsinh;
import com.enao.team2.quanlynhanvien.service.IAccountService;
import com.enao.team2.quanlynhanvien.service.IHocSinhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/fpt/final")
public class AccountController {
    @Autowired
    IAccountService accountService;

    @Autowired
    AccountConvert accountConvert;

    @PostMapping("/account")
    public ResponseEntity<?> add(@RequestBody AccountDTO accountDTO){
        Account accountmodel;
        Optional<Account> account = accountService.findByEmail(accountDTO.getEmail());
        if (account.isPresent()) {
            return new ResponseEntity<>("account da ton tai", HttpStatus.BAD_REQUEST);
        }
        Account newaccount = accountConvert.toEntity(accountDTO);
        accountmodel = accountService.save(newaccount);
        return new ResponseEntity(accountConvert.toDTO(accountmodel), HttpStatus.CREATED);
    }
}
