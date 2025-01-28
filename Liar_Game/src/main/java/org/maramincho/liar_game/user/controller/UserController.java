package org.maramincho.liar_game.user.controller;

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
    public ResponseEntity<CreateUser.Response> post(@RequestBody CreateUser.Request request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(basicUserService.createUser(request));
    }

}
