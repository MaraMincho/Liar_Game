package org.maramincho.liar_game.user.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

public final class CreateUser {
    @AllArgsConstructor
    @RequiredArgsConstructor
    @NoArgsConstructor
    public static final class request {
        String email;
        String password;
    }

    public record response(String nickName, Long id) {

    }
}
