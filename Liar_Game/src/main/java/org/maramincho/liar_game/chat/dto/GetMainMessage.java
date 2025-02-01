package org.maramincho.liar_game.chat.dto;

import org.maramincho.liar_game.chat.domain.BasicChat;

import java.util.List;

public class GetMainMessage {
    public record Request(String lastMessageId) {}
    public record Response(List<BasicChat> chats) {}
}
