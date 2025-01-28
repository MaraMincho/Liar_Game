package org.maramincho.liar_game.user.controller;

import lombok.RequiredArgsConstructor;
import org.maramincho.liar_game.user.dto.CreateUser;
import org.maramincho.liar_game.user.service.BasicUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/user")
public class UserController {
    private final BasicUserService basicUserService;

    @PostMapping
    public ResponseEntity<CreateUser.response> post(@RequestBody CreateUser.request request) {
        throw new RuntimeException();
    }

}
