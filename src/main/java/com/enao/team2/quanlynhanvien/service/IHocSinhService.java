package com.enao.team2.quanlynhanvien.service;

import com.enao.team2.quanlynhanvien.model.Hocsinh;

import java.util.Optional;

public interface IHocSinhService {
    Optional<Hocsinh> findBymahocsinh(String mahocsinh);

    Hocsinh save(Hocsinh newhocsinh);
}
