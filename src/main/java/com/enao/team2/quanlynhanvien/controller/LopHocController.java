package com.enao.team2.quanlynhanvien.controller;

import com.enao.team2.quanlynhanvien.DTOs.LopHocDTO;
import com.enao.team2.quanlynhanvien.convert.LopHocConvert;
import com.enao.team2.quanlynhanvien.model.LopHoc;
import com.enao.team2.quanlynhanvien.service.ILopHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/fpt/final")
public class LopHocController {
    @Autowired
    ILopHocService lopHocService;

    @Autowired
    LopHocConvert lopHocConvert;

    @PostMapping("/lophoc")
    public ResponseEntity<?> add(@RequestBody LopHocDTO lopHocDTO){
        LopHoc lopHocModel;
        Optional<LopHoc> namHoc = lopHocService.findBymalop(lopHocDTO.getMalop());
        if (namHoc.isPresent()) {
            return new ResponseEntity<>("lop hoc da ton tai", HttpStatus.BAD_REQUEST);
        }
        LopHoc newlophoc = lopHocConvert.toEntity(lopHocDTO);
        lopHocModel = lopHocService.save(newlophoc);
        return new ResponseEntity(lopHocConvert.toDTO(lopHocModel), HttpStatus.CREATED);
    }
}
