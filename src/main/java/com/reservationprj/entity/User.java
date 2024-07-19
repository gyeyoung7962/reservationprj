package com.reservationprj.entity;


import com.reservationprj.dto.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Entity
public class User extends TimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, unique = true)
    private String email;

    @Column(length = 500)
    private String password;

    @Column(length = 10)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column
    private Role role;


}
