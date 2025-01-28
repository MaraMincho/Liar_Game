package org.maramincho.liar_game.user.service;

import lombok.RequiredArgsConstructor;
import org.maramincho.liar_game.user.domain.BasicUser;
import org.maramincho.liar_game.user.dto.CreateUser;
import org.maramincho.liar_game.user.entity.BasicUserEntity;
import org.maramincho.liar_game.user.repository.BasicUserRecordRepository;
import org.maramincho.liar_game.user.repository.BasicUserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BasicUserService {
    private final BasicUserRepository basicUserRepository;
    private final BasicUserRecordRepository basicUserRecordRepository;

    public CreateUser.Response createUser(CreateUser.Request request) {
        final var defaultUser = new BasicUser(request);
        final BasicUserEntity basicUserEntity = defaultUser
                .toEntity((basicUser, basicUserRecord) -> {
                    basicUserRepository.save(basicUser);
                    basicUserRecordRepository.save(basicUserRecord);
                    return basicUser;
                });

        return new CreateUser.Response(basicUserEntity.getNickName(), basicUserEntity.getId());
    }
}
