package com.reservationprj.dto;


import com.reservationprj.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    private String email;
    private String password;
    private String name;
    private Role role;

    public User toEntity(){
        User user = User.builder()
                .email(email)
                .password(password)
                .name(name)
                .role(Role.USER)
                .build();
        return user;
    }
}
