package com.enao.team2.quanlynhanvien.service;

import com.enao.team2.quanlynhanvien.model.LopHoc;

import java.util.Optional;

public interface ILopHocService {
    Optional<LopHoc> findBymalop(String malop);

    LopHoc save(LopHoc newlophoc);
}
