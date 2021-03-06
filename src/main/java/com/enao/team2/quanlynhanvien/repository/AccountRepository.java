package com.enao.team2.quanlynhanvien.repository;

import com.enao.team2.quanlynhanvien.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID> {

    @Query(value="SELECT * FROM account u WHERE  u.email=?1",nativeQuery = true)
     Account findByUsername(String username);


}
