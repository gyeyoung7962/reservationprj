package com.reservationprj.service;


import com.reservationprj.dto.UserDTO;
import com.reservationprj.entity.TimeEntity;
import com.reservationprj.entity.User;
import com.reservationprj.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(rollbackFor = Exception.class)
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User signUp(UserDTO userDTO){
//        Optional<User> findUser = userRepository.findByUsername(userDTO.getUsername());

        if(userDTO.getUsername() == null || userDTO.getUsername().isEmpty()){
            throw new IllegalArgumentException("Username cannot be null or empty");
        }


        User user = User.builder()
                .username(userDTO.getUsername())
                .password(userDTO.getPassword())
                .name(userDTO.getName())
//                .role(userDTO.getRole())
                .build();

        return userRepository.save(user);
    }
}
