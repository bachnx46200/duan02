package com.enao.team2.quanlynhanvien.service.impl;

import com.enao.team2.quanlynhanvien.model.GiaoVien;
import com.enao.team2.quanlynhanvien.repository.IGiaoVienRespository;
import com.enao.team2.quanlynhanvien.service.IGiaoVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GiaoVienServiceImpl implements IGiaoVienService {
    @Autowired
    IGiaoVienRespository giaoVienRespository;

    @Override
    public List<GiaoVien> findAll() {
        return giaoVienRespository.findAll();
    }

    @Override
    public Optional<GiaoVien> findByMaGiaoVien(String magiaovien) {
        return giaoVienRespository.findByMagiaovien(magiaovien);
    }

    @Override
    public GiaoVien save(GiaoVien newgiaovien) {
        return giaoVienRespository.save(newgiaovien);
    }
}
