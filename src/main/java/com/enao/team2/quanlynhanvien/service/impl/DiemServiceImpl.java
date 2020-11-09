package com.enao.team2.quanlynhanvien.service.impl;

import com.enao.team2.quanlynhanvien.DTOs.diemCuoiNamDTO;
import com.enao.team2.quanlynhanvien.DTOs.diemDTO;
import com.enao.team2.quanlynhanvien.DTOs.lopResultDTO;
import com.enao.team2.quanlynhanvien.model.Diem;
import com.enao.team2.quanlynhanvien.repository.IDiemRepository;
import com.enao.team2.quanlynhanvien.service.IDiemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiemServiceImpl implements IDiemService {

    @Autowired
    private IDiemRepository diemRepository;

    @Override
    public List<Diem> findAll() {
        return diemRepository.findAll();
    }

    @Override
    public List<Diem> findByStudetID(String id, boolean hocki) {
        return diemRepository.findBymahocsinh(id, hocki);
    }

    @Override
    public List<Diem> findByEVE(String tenlop, String tenmon, boolean hocki) {
        return diemRepository.listByTenlopTenMonandPhancong(tenlop, tenmon, hocki);
    }

    @Override
    public List<Diem> findByStudentIDAndSubject(String mahocsinh, boolean ki, String tenmon) {
        return diemRepository.findBymahocsinhAndMon(mahocsinh, ki, tenmon);
    }

    @Override
    public List<lopResultDTO> findClass(String mahocsinh) {
        return diemRepository.findLopTungHoc(mahocsinh);
    }

    @Override
    public List<diemCuoiNamDTO> findPoint(String mahocsinh, String tenlop) {
        return diemRepository.findTongKetCuoiNam(mahocsinh,tenlop);
    }

//    @Override
//    public List<Diem> findByhocsinh_mahocsinhAndphancong_hocki(String mahocsinh, boolean ki) {
//        return diemRepository.findByhocsinh_mahocsinhAndphancong_hocki(mahocsinh,ki);
//    }
}
