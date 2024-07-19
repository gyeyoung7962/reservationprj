package com.reservationprj.entity;


import com.reservationprj.dto.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Builder
@Getter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 30, unique = true)
    private String username; // 아이디

    @Column(length = 500)
    private String password;

    @Column(length = 10)
    private String name;

//    @Enumerated(EnumType.STRING)
//    @Column
//    private Role role;

    @Builder
    private User(Long id, String username, String password, String name){

        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
//        this.role = role;
    }



}
