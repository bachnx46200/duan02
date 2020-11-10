package com.enao.team2.quanlynhanvien.repository;

import com.enao.team2.quanlynhanvien.model.NamHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface INamHocRepository extends JpaRepository<NamHoc, UUID> {
    Optional<NamHoc> findByNienhoc(String nienhoc);
}
