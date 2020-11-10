package com.enao.team2.quanlynhanvien.convert;

import com.enao.team2.quanlynhanvien.DTOs.KhoiDTO;
import com.enao.team2.quanlynhanvien.DTOs.NamHocDTO;
import com.enao.team2.quanlynhanvien.model.Khoi;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class KhoiConvert {
    public KhoiDTO toDTO(Khoi khoi){
        KhoiDTO khoiDTO = new KhoiDTO();
        khoiDTO.setTenkhoi(khoi.getTenkhoi());
        return khoiDTO;
    }

    public Khoi toEntity(KhoiDTO khoiDTO){
        Khoi khoi = new Khoi();
        khoi.setMakhoi(UUID.randomUUID());
        khoi.setTenkhoi(khoiDTO.getTenkhoi());
        return khoi;
    }
}
