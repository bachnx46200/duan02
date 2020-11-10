package com.enao.team2.quanlynhanvien.convert;

import com.enao.team2.quanlynhanvien.DTOs.HocSinhDTO;
import com.enao.team2.quanlynhanvien.model.Hocsinh;
import com.enao.team2.quanlynhanvien.model.LopHoc;
import com.enao.team2.quanlynhanvien.service.ILopHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class HocSinhConvert {
    @Autowired
    ILopHocService lopHocService;
    public HocSinhDTO toDTO(Hocsinh hocsinh) {
        HocSinhDTO hocSinhDTO = new HocSinhDTO();
        hocSinhDTO.setMahocsinh(hocsinh.getMahocsinh());
        hocSinhDTO.setHoten(hocsinh.getHoten());
        hocSinhDTO.setGioitinh(hocsinh.getGioitinh());
        hocSinhDTO.setNgaysinh(hocsinh.getNgaysinh());
        hocSinhDTO.setDiachi(hocsinh.getDiachi());
        hocSinhDTO.setDienthoai(hocsinh.getDienthoai());
        hocSinhDTO.setEmail(hocsinh.getEmail());
        hocSinhDTO.setMalop(hocsinh.getLop().getMalop());
        return hocSinhDTO;
    }

    public Hocsinh toEntity(HocSinhDTO hocSinhDTO){
        Optional<LopHoc> lopHoc = lopHocService.findBymalop(hocSinhDTO.getMalop());
        Hocsinh hocsinh = new Hocsinh();
        hocsinh.setId(UUID.randomUUID());
        hocsinh.setMahocsinh(hocSinhDTO.getMahocsinh());
        hocsinh.setHoten(hocSinhDTO.getHoten());
        hocsinh.setGioitinh(hocSinhDTO.getGioitinh());
        hocsinh.setNgaysinh(hocSinhDTO.getNgaysinh());
        hocsinh.setDiachi(hocSinhDTO.getDiachi());
        hocsinh.setDienthoai(hocSinhDTO.getDienthoai());
        hocsinh.setEmail(hocSinhDTO.getEmail());
        if(lopHoc.isPresent()){
            hocsinh.setLop(lopHoc.get());
        }
        return hocsinh;
    }
}
