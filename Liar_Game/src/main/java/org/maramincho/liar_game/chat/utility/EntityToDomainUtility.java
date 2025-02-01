package org.maramincho.liar_game.chat.utility;

import org.maramincho.liar_game.chat.domain.BasicChat;
import org.maramincho.liar_game.chat.entity.MainChatEntity;

public enum EntityToDomainUtility {
    ;
    public static BasicChat convertBaseChatFromMainChatEntity(MainChatEntity entity) {
        return new BasicChat(entity.getSenderId(), entity.getNickName(), entity.getContent())
                .setId(entity.getId())
                .setLocalDateTime(entity.getCreatedAt());
    }
}
