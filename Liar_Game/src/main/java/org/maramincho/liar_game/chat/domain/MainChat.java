package org.maramincho.liar_game.chat.domain;

import lombok.NonNull;
import org.maramincho.liar_game.chat.dto.CreateMainChat;
import org.maramincho.liar_game.chat.entity.MainChatEntity;

import java.time.LocalDateTime;

public class MainChat extends BasicChat {
    public MainChat(
            @NonNull Long senderId,
            @NonNull String content,
            @NonNull LocalDateTime dateTime,
            @NonNull String nickName
    ) {
        super(senderId, content, dateTime, nickName);
    }

    public static MainChat mainChatFromCreateMainChatRequest(CreateMainChat.Request request) {
        return new MainChat(request.senderId(), request.content(), request.dateTime(), request.nickName());
    }
    public MainChatEntity toEntity() {
        return MainChatEntity.NormalChatEntityByBasicChat(this);
    }
}
