package org.maramincho.liar_game.user.dto;

public class UpdateUser {
    public record Request(Long id, String nickName, String email, String password) { }
    public record Response(Long id, String nickName) { }
}
