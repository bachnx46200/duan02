package com.enao.team2.quanlynhanvien.repository;

import com.enao.team2.quanlynhanvien.model.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TokenRepository extends JpaRepository<Token, UUID> {
    Token findByToken(String token);
}
