package com.enao.team2.quanlynhanvien.convert;

import com.enao.team2.quanlynhanvien.DTOs.LopHocDTO;
import com.enao.team2.quanlynhanvien.DTOs.NamHocDTO;
import com.enao.team2.quanlynhanvien.model.Khoi;
import com.enao.team2.quanlynhanvien.model.LopHoc;
import com.enao.team2.quanlynhanvien.model.NamHoc;
import com.enao.team2.quanlynhanvien.service.IKhoiService;
import com.enao.team2.quanlynhanvien.service.INamhocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class LopHocConvert {
    @Autowired
    IKhoiService khoiService;

    @Autowired
    INamhocService namhocService;

    public LopHocDTO toDTO(LopHoc lopHoc) {
        LopHocDTO lopHocDTO = new LopHocDTO();
        lopHocDTO.setMalop(lopHoc.getMalop());
        lopHocDTO.setTenlop(lopHoc.getTenlop());
        lopHocDTO.setTenkhoi(lopHoc.getKhoi().getTenkhoi());
        lopHocDTO.setNienhoc(lopHoc.getNamhoc().getNienhoc());
        return lopHocDTO;
    }

    public LopHoc toEntity(LopHocDTO lopHocDTO){
        Optional<Khoi> khoi = khoiService.findBytenkhoi(lopHocDTO.getTenkhoi());
        Optional<NamHoc> namHoc = namhocService.findByNienHoc(lopHocDTO.getNienhoc());
        LopHoc lopHoc = new LopHoc();
        lopHoc.setId(UUID.randomUUID());
        lopHoc.setMalop(lopHocDTO.getMalop());
        lopHoc.setTenlop(lopHocDTO.getTenlop());
        if(khoi.isPresent()){
            lopHoc.setKhoi(khoi.get());
        }
        if(namHoc.isPresent()){
            lopHoc.setNamhoc(namHoc.get());
        }
        return lopHoc;
    }
}
