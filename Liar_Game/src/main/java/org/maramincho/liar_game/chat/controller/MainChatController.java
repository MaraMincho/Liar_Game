package org.maramincho.liar_game.chat.controller;

import lombok.RequiredArgsConstructor;
import org.maramincho.liar_game.chat.domain.BasicChat;
import org.maramincho.liar_game.chat.dto.CreateMainChat;
import org.maramincho.liar_game.chat.dto.GetMainMessage;
import org.maramincho.liar_game.chat.service.MainChatService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/message")
    public ResponseEntity<GetMainMessage.Response> getChat(Long chatId) {
        List<BasicChat> mockChat = new ArrayList<BasicChat>();
        return ResponseEntity.status(HttpStatus.OK)
                .body(new GetMainMessage.Response(mockChat));
//        return ResponseEntity.status(HttpStatus.OK)
//                .body(mainChatService.getChat(request));
    }

    public ResponseEntity<GetMainMessage.Response> getLatestChat( int chatCount) {
        //TODO: 코드 수정하기
        List<BasicChat> mockChat = new ArrayList<BasicChat>();
        return ResponseEntity.status(HttpStatus.OK)
                .body(new GetMainMessage.Response(mockChat));
//        final var message = mainChatService.getMessage(MainChatService.GetChatMessageType.LATEST, chatCount)
//        return ResponseEntity.status(HttpStatus.OK)
//                .body(mainChatService.getMessage())
    }

}
