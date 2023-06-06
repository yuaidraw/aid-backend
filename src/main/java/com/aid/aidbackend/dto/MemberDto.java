package com.aid.aidbackend.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record MemberDto(
        @Email @NotNull String email,
        @NotNull String nickname,
        @NotNull String password
) {

}