package com.enao.team2.quanlynhanvien.service;

import com.enao.team2.quanlynhanvien.DTOs.diemCuoiNamDTO;
import com.enao.team2.quanlynhanvien.DTOs.lopResultDTO;
import com.enao.team2.quanlynhanvien.model.Diem;
import java.util.List;


public interface IDiemService {
    List<Diem> findAll();

    List<Diem> findByStudetID(String id, boolean hocki);

    List<Diem> findByEVE(String tenlop, String tenmon, boolean hocki);

    List<Diem> findByStudentIDAndSubject(String mahocsinh, boolean ki, String tenmon);

    List<lopResultDTO> findClass(String mahocsinh);

    List<diemCuoiNamDTO> findPoint(String mahocsinh, String tenlop);
}
