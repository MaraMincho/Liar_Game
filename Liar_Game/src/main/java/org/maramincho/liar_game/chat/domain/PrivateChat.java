package org.maramincho.liar_game.chat.domain;

import lombok.NonNull;

import java.time.LocalDateTime;

public class PrivateChat extends BasicChat {
    private final Long receiveUserId;
    public PrivateChat(
            @NonNull Long senderId,
            @NonNull String content,
            @NonNull LocalDateTime dateTime,
            @NonNull String nickName,
            @NonNull Long receiveUserId
    ) {
        super(senderId, content, dateTime, nickName);
        this.receiveUserId = receiveUserId;
    }
}
