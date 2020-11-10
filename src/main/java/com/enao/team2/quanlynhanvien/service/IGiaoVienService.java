package com.enao.team2.quanlynhanvien.service;

import com.enao.team2.quanlynhanvien.model.GiaoVien;

import java.util.List;
import java.util.Optional;

public interface IGiaoVienService {
    List<GiaoVien> findAll();

    Optional<GiaoVien> findByMaGiaoVien(String magiaovien);

    GiaoVien save(GiaoVien newgiaovien);
}
