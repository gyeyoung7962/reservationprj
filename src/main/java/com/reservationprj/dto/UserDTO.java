package com.reservationprj.dto;


import com.reservationprj.entity.User;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    @NotBlank(message = "이메일을 입력하세요")
    @Email(message = "올바른 이메일 형식이 아닙니다")
    private String username; // 아이디


    @NotBlank(message = "비밀번호를 입력하세요")
    @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@$%^&*])[a-zA-Z0-9!@$%^&*]{10,20}$",
            message = "영문, 숫자, 특수문자를 포함한 10~20자리로 입력해주세요")
    private String password;

    @NotBlank(message = "올바른 이름을 입력하세요")
    @Pattern(regexp = "^[ㄱ-힣a-zA-Z]{1,10}$", message = "올바른 이름을 입력하세요")
    private String name;

//    private Role role;
}
