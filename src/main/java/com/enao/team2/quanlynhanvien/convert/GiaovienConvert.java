package com.enao.team2.quanlynhanvien.convert;

import com.enao.team2.quanlynhanvien.DTOs.GiaovienDTO;
import com.enao.team2.quanlynhanvien.model.GiaoVien;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class GiaovienConvert {
    public GiaovienDTO toDTO(GiaoVien giaoVien){
        GiaovienDTO giaovienDTO = new GiaovienDTO();
        giaovienDTO.setMagiaovien(giaoVien.getMagiaovien());
        giaovienDTO.setHoten(giaoVien.getHoten());
        giaovienDTO.setNgaysinh(giaoVien.getNgaysinh());
        giaovienDTO.setGioitinh(giaoVien.isGioitinh());
        giaovienDTO.setCmnd(giaoVien.getCmnd());
        giaovienDTO.setDiachi(giaoVien.getDiachi());
        giaovienDTO.setDienthoai(giaoVien.getDienthoai());
        return giaovienDTO;
    }

    public GiaoVien toEntity(GiaovienDTO giaovienDTO){
        GiaoVien giaoVien = new GiaoVien();
        giaoVien.setId(UUID.randomUUID());
        giaoVien.setMagiaovien(giaovienDTO.getMagiaovien());
        giaoVien.setHoten(giaovienDTO.getHoten());
        giaoVien.setNgaysinh(giaovienDTO.getNgaysinh());
        giaoVien.setGioitinh(giaovienDTO.isGioitinh());
        giaoVien.setCmnd(giaovienDTO.getCmnd());
        giaoVien.setDiachi(giaovienDTO.getDiachi());
        giaoVien.setDienthoai(giaovienDTO.getDienthoai());
        return giaoVien;
    }
}
