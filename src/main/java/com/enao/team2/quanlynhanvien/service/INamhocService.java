package com.enao.team2.quanlynhanvien.service;

import com.enao.team2.quanlynhanvien.model.NamHoc;

import java.util.Optional;

public interface INamhocService {
    Optional<NamHoc> findByNienHoc(String nienhoc);

    NamHoc save(NamHoc newNamHoc);
}
