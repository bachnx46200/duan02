package com.enao.team2.quanlynhanvien.service.impl;

import com.enao.team2.quanlynhanvien.model.NamHoc;
import com.enao.team2.quanlynhanvien.repository.INamHocRepository;
import com.enao.team2.quanlynhanvien.service.INamhocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NamhocServiceImpl implements INamhocService {
    @Autowired
    INamHocRepository namHocRepository;

    @Override
    public Optional<NamHoc> findByNienHoc(String nienhoc) {
        return namHocRepository.findByNienhoc(nienhoc);
    }

    @Override
    public NamHoc save(NamHoc newNamHoc) {
        return namHocRepository.save(newNamHoc);
    }
}
