package com.enao.team2.quanlynhanvien.service.impl;

import com.enao.team2.quanlynhanvien.model.LopHoc;
import com.enao.team2.quanlynhanvien.repository.ILopHocRepository;
import com.enao.team2.quanlynhanvien.service.ILopHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LopHocServiceImpl implements ILopHocService {
    @Autowired
    ILopHocRepository lopHocRepository;

    @Override
    public Optional<LopHoc> findBymalop(String malop) {
        return lopHocRepository.findBymalop(malop);
    }

    @Override
    public LopHoc save(LopHoc newlophoc) {
        return lopHocRepository.save(newlophoc);
    }
}
