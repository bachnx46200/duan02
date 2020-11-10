package com.enao.team2.quanlynhanvien.service;

import com.enao.team2.quanlynhanvien.model.Khoi;

import java.util.Optional;

public interface IKhoiService {
    Optional<Khoi> findBytenkhoi(String tenkhoi);

    Khoi save(Khoi newkhoi);
}
