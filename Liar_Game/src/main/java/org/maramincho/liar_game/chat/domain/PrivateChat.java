package org.maramincho.liar_game.chat.domain;

import lombok.NonNull;

public class PrivateChat extends BasicChat {
    private final Long receiveUserId;

    public PrivateChat(
            @NonNull Long senderId,
            @NonNull String content,
            @NonNull String nickName,
            @NonNull Long receiveUserId
    ) {
        super(senderId, content, nickName);
        this.receiveUserId = receiveUserId;
    }
}
