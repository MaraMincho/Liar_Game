package org.maramincho.liar_game.chat.controller;

import lombok.RequiredArgsConstructor;
import org.maramincho.liar_game.chat.dto.CreateMainChat;
import org.maramincho.liar_game.chat.service.MainChatService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("api/v1/chat/main")
public class MainChatController {
    private final MainChatService mainChatService;

    @PostMapping()
    public ResponseEntity<CreateMainChat.Response> createChat(@RequestBody CreateMainChat.Request request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(mainChatService.createChat(request));
    }

}
