package org.maramincho.liar_game.user.service;

import lombok.RequiredArgsConstructor;
import org.maramincho.liar_game.user.domain.DefaultUser;
import org.maramincho.liar_game.user.dto.CreateUser;
import org.maramincho.liar_game.user.repository.BasicUserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BasicUserService {
    private final BasicUserRepository basicUserRepository;

    public CreateUser.response createUser(CreateUser.request request) {
        final var defaultUser = new DefaultUser(request);
        final var defaultUserEntity = defaultUser.toEntity();

        basicUserRepository.save(defaultUserEntity);

        return new CreateUser.response(defaultUserEntity.getNickName(), defaultUserEntity.getId());
    }
}
