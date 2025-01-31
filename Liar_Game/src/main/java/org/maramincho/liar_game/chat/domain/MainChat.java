package org.maramincho.liar_game.chat.domain;

import lombok.NonNull;

import java.time.LocalDateTime;

public class MainChat extends BasicChat {
    public MainChat(
            @NonNull Long id,
            @NonNull String content,
            @NonNull LocalDateTime dateTime,
            @NonNull String nickName
    ) {
        super(id, content, dateTime, nickName);
    }
}
