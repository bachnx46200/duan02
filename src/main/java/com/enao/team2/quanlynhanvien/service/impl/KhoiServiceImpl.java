package com.enao.team2.quanlynhanvien.service.impl;

import com.enao.team2.quanlynhanvien.model.Khoi;
import com.enao.team2.quanlynhanvien.repository.IKhoiRepository;
import com.enao.team2.quanlynhanvien.service.IKhoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class KhoiServiceImpl implements IKhoiService {
    @Autowired
    IKhoiRepository khoiRepository;

    @Override
    public Optional<Khoi> findBytenkhoi(String tenkhoi) {
        return khoiRepository.findByTenkhoi(tenkhoi);
    }

    @Override
    public Khoi save(Khoi newkhoi) {
        return khoiRepository.save(newkhoi);
    }
}
