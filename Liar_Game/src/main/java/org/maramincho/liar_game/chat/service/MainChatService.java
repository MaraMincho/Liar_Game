package org.maramincho.liar_game.chat.service;

import lombok.RequiredArgsConstructor;
import org.maramincho.liar_game.chat.domain.BasicChat;
import org.maramincho.liar_game.chat.domain.MainChat;
import org.maramincho.liar_game.chat.dto.CreateMainChat;
import org.maramincho.liar_game.chat.repository.MainChatRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class MainChatService {
    private final MainChatRepository mainChatRepository;

    public CreateMainChat.Response createChat(CreateMainChat.Request request) {
        MainChat currentMainChat = MainChat.mainChatFromCreateMainChatRequest(request);
        mainChatRepository.save(currentMainChat);
        return new CreateMainChat.Response("asdf", "s", LocalDateTime.now());
    }
}
