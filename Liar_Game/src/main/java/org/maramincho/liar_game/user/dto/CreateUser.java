package org.maramincho.liar_game.user.dto;

import io.micrometer.common.lang.Nullable;

public final class CreateUser {

    public record request(
            @Nullable String email,
            @Nullable String password,
            @Nullable String nickName) {

    }

    public record response(String nickName, Long id) {

    }
}
