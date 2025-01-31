package org.maramincho.liar_game.chat.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.maramincho.liar_game.chat.dto.CreateMainChat;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;

@Service
@RequiredArgsConstructor
public class MainChatService {

    public CreateMainChat.Response createChat(CreateMainChat.Request request) {
        return new CreateMainChat.Response("asdf", "s", LocalDateTime.now());
    }
}
