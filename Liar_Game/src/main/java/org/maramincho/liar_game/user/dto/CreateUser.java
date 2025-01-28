package org.maramincho.liar_game.user.dto;

public final class CreateUser {

    public record request(String email, String password, String nickName) {

    }

    public record response(String nickName, Long id) {

    }
}
