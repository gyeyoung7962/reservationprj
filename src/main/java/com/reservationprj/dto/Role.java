package com.reservationprj.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    USER("ROLE_USER"), ADMIN("ROLE_USER");

    private final String value;
}
