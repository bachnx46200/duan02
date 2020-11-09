package com.enao.team2.quanlynhanvien.repository;

import com.enao.team2.quanlynhanvien.model.GiaoVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IGiaoVienRespository extends JpaRepository<GiaoVien, UUID> {

}
