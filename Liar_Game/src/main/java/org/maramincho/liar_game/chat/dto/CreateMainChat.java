package org.maramincho.liar_game.chat.dto;

import java.time.LocalDateTime;

public class CreateMainChat {
    public record Request(Long senderId, String nickName, String content, LocalDateTime dateTime) {  }
    public record Response(Long senderId, String nickName, String content, LocalDateTime dateTime) { }
}
