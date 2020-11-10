package com.enao.team2.quanlynhanvien.repository;

import com.enao.team2.quanlynhanvien.model.Khoi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface IKhoiRepository extends JpaRepository<Khoi, UUID> {
    Optional<Khoi> findByTenkhoi(String tenkhoi);
}
