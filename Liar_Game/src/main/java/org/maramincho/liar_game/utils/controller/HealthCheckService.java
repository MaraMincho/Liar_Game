package org.maramincho.liar_game.utils.controller;

import lombok.RequiredArgsConstructor;
import org.maramincho.liar_game.utils.dto.response.DefaultResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1")
public class HealthCheckService {

    @GetMapping("hello")
    public ResponseEntity<DefaultResponse> get() {
        final var defaultResponseMessage = "OK";
        return ResponseEntity.ok(new DefaultResponse(defaultResponseMessage));
    }
}
