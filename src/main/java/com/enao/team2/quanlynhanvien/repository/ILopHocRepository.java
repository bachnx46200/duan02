package com.enao.team2.quanlynhanvien.repository;

import com.enao.team2.quanlynhanvien.model.LopHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ILopHocRepository extends JpaRepository<LopHoc, UUID> {
    Optional<LopHoc> findBymalop(String malop);
}
