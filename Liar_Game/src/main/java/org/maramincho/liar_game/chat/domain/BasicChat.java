package org.maramincho.liar_game.chat.domain;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter
public class BasicChat {
    @NonNull private final Long id;
    @NonNull private final String content;
    @NonNull private final LocalDateTime dateTime;
    @NonNull private final String nickName;
}
