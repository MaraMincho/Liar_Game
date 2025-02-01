package org.maramincho.liar_game.chat.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class BasicChat {
    private final Long senderId;
    private final String content;
    private final String nickName;

    private final LocalDateTime localDateTime;
    private final Long id;

    public BasicChat(Long senderId, String content, String nickName) {
        this.senderId = senderId;
        this.content = content;
        this.nickName = nickName;
        localDateTime = null;
        id = null;
    }

    public BasicChat setLocalDateTime(LocalDateTime localDateTime) {
        return new BasicChat(senderId, content, nickName, localDateTime, id);
    }

    public BasicChat setId(Long id) {
        return new BasicChat(senderId, content, nickName, localDateTime, id);
    }
}
