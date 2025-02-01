package org.maramincho.liar_game.chat.domain;

import lombok.NonNull;
import org.maramincho.liar_game.chat.entity.MainChatEntity;

public class MainChat extends BasicChat {
    public MainChat(
            @NonNull Long senderId,
            @NonNull String content,
            @NonNull String nickName
    ) {
        super(senderId, content, nickName);
    }

    public MainChatEntity toEntity() {
        return MainChatEntity.NormalChatEntityByBasicChat(this);
    }
}
