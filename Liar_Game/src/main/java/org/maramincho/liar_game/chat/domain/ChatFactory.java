package org.maramincho.liar_game.chat.domain;

import org.maramincho.liar_game.chat.dto.CreateMainChat;

public class ChatFactory {
    public static MainChat makeMainChat(CreateMainChat.Request request) {
        return new MainChat(request.senderId(), request.content(), request.nickName());
    }
}
