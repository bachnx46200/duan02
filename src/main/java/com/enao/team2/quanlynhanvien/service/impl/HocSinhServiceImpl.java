package com.enao.team2.quanlynhanvien.service.impl;

import com.enao.team2.quanlynhanvien.model.Hocsinh;
import com.enao.team2.quanlynhanvien.repository.HocSinhRepository;
import com.enao.team2.quanlynhanvien.service.IHocSinhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HocSinhServiceImpl implements IHocSinhService {
    @Autowired
    HocSinhRepository hocSinhRepository;

    @Override
    public Optional<Hocsinh> findBymahocsinh(String mahocsinh) {
        return hocSinhRepository.findBymahocsinh(mahocsinh);
    }

    @Override
    public Hocsinh save(Hocsinh newhocsinh) {
        return hocSinhRepository.save(newhocsinh);
    }
}
