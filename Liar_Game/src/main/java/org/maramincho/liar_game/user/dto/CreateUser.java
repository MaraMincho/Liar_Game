package org.maramincho.liar_game.user.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

public final class CreateUser {

    public record request(String email, String password) {

    }

    public record response(String nickName, Long id) {

    }
}
