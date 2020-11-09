package com.enao.team2.quanlynhanvien.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "account")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long stt;
    @Column
    private String email;
    @Column
    private String pass;
    @Column
    private String roles;

    @ManyToOne(fetch = FetchType.LAZY)
    private Hocsinh hocsinh;

    @ManyToOne(fetch = FetchType.LAZY)
    private GiaoVien giaovien;

}