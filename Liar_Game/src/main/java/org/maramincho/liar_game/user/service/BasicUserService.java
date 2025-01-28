package org.maramincho.liar_game.user.service;

import lombok.RequiredArgsConstructor;
import org.maramincho.liar_game.user.domain.BasicUser;
import org.maramincho.liar_game.user.dto.CreateUser;
import org.maramincho.liar_game.user.entity.BasicUserEntity;
import org.maramincho.liar_game.user.entity.BasicUserRecordEntity;
import org.maramincho.liar_game.user.repository.BasicUserRecordRepository;
import org.maramincho.liar_game.user.repository.BasicUserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BasicUserService {
    private final BasicUserRepository basicUserRepository;
    private final BasicUserRecordRepository basicUserRecordRepository;

    public CreateUser.response createUser(CreateUser.request request) {
        final var defaultUser = new BasicUser(request);
        final var entityTuple = defaultUser.toEntity();
        final BasicUserEntity basicUserEntity = entityTuple.x;
        final BasicUserRecordEntity recordEntity = entityTuple.y;

        basicUserRepository.save(basicUserEntity);
        basicUserRecordRepository.save(recordEntity);

        return new CreateUser.response(basicUserEntity.getNickName(), basicUserEntity.getId());
    }
}
