package org.maramincho.liar_game.user.dto;

import io.micrometer.common.lang.Nullable;

public final class CreateUser {

    public record Request(
            String email,
            String password,
            String nickName) {
    }

    public record Response(String nickName, Long id) {

    }
}
