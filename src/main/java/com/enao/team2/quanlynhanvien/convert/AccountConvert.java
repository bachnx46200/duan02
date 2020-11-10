package com.enao.team2.quanlynhanvien.convert;

import com.enao.team2.quanlynhanvien.DTOs.AccountDTO;
import com.enao.team2.quanlynhanvien.model.Account;
import com.enao.team2.quanlynhanvien.model.GiaoVien;
import com.enao.team2.quanlynhanvien.model.Hocsinh;
import com.enao.team2.quanlynhanvien.service.IGiaoVienService;
import com.enao.team2.quanlynhanvien.service.IHocSinhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class AccountConvert {
    @Autowired
    IGiaoVienService giaoVienService;

    @Autowired
    IHocSinhService hocSinhService;
    public AccountDTO toDTO(Account account) {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setEmail(account.getEmail());
        accountDTO.setPass(account.getPass());
        accountDTO.setRoles(account.getRoles());
        if(account.getGiaovien() != null){
            accountDTO.setMagiaovien(account.getGiaovien().getMagiaovien());
        }else{
            accountDTO.setMagiaovien(null);
        }
        if(account.getHocsinh() != null){
            accountDTO.setMahocsinh(account.getHocsinh().getMahocsinh());
        }else{
            accountDTO.setMahocsinh(null);
        }
        return accountDTO;
    }

    public Account toEntity(AccountDTO accountDTO){
        Optional<GiaoVien> giaoVien = giaoVienService.findByMaGiaoVien(accountDTO.getMagiaovien());
        Optional<Hocsinh> hocsinh = hocSinhService.findBymahocsinh(accountDTO.getMahocsinh());
        Account account = new Account();
        account.setStt(UUID.randomUUID());
        account.setEmail(accountDTO.getEmail());
        account.setPass(accountDTO.getPass());
        account.setRoles(accountDTO.getRoles());
        if(giaoVien.isPresent()){
            account.setGiaovien(giaoVien.get());
        }else{
            account.setGiaovien(null);
        }
        if(hocsinh.isPresent()){
            account.setHocsinh(hocsinh.get());
        }else{
            account.setHocsinh(null);
        }
        return account;
    }
}
