package org.maramincho.liar_game.user.controller;

import ch.qos.logback.classic.encoder.JsonEncoder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.maramincho.liar_game.user.dto.CreateUser;
import org.maramincho.liar_game.user.service.BasicUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/user")
public class UserController {
    private final BasicUserService basicUserService;

    //TODO: Error 처리 로직에 대해서 생각하기
    @PostMapping
    public ResponseEntity<CreateUser.response> post(@RequestBody CreateUser.request request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(basicUserService.createUser(request));
    }

}
