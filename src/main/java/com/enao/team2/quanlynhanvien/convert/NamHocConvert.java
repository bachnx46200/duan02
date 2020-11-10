package com.enao.team2.quanlynhanvien.convert;

import com.enao.team2.quanlynhanvien.DTOs.NamHocDTO;
import com.enao.team2.quanlynhanvien.model.NamHoc;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class NamHocConvert {
    public NamHocDTO toDTO(NamHoc namHoc) {
        NamHocDTO namHocDTO = new NamHocDTO();
        namHocDTO.setNienhoc(namHoc.getNienhoc());
        namHocDTO.setNgaybatdau(namHoc.getNgaybatdau());
        namHocDTO.setNgayketthuc(namHoc.getNgayketthuc());
        namHocDTO.setTrangthai(namHoc.isTrangthai());
        return namHocDTO;
    }

    public NamHoc toEntity(NamHocDTO namHocDTO){
        NamHoc namHoc = new NamHoc();
        namHoc.setManamhoc(UUID.randomUUID());
        namHoc.setNienhoc(namHocDTO.getNienhoc());
        namHoc.setNgaybatdau(namHocDTO.getNgaybatdau());
        namHoc.setNgayketthuc(namHocDTO.getNgayketthuc());
        namHoc.setTrangthai(namHoc.isTrangthai());
        return namHoc;
    }
}
