package org.maramincho.liar_game.chat.dto;

import java.time.LocalDateTime;

public class CreateMainChat {
    public record Request(String nickName, String content, LocalDateTime dateTime) {  }
    public record Response(String nickName, String content, LocalDateTime dateTime) { }
}
