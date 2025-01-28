package org.maramincho.liar_game.user.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.maramincho.liar_game.user.dto.CreateUser;
import org.maramincho.liar_game.user.entity.BasicUserEntity;
import org.maramincho.liar_game.user.entity.BasicUserRecordEntity;
import org.maramincho.liar_game.utils.common.Tuple;

import java.util.UUID;
import java.util.function.Function;

@AllArgsConstructor
@Getter
public class BasicUser {
    private String nickName;
    private String email;
    private String password;

    @FunctionalInterface
    public interface BasicUserEntityResultHandler<T> {
        T execute(BasicUserEntity basicUser, BasicUserRecordEntity basicUserRecord);
    }

    public <T> T toEntity(
            BasicUserEntityResultHandler<T> handler
    ) {
        BasicUserEntity basicUser = BasicUserEntity.builder()
                .nickName(nickName)
                .email(email)
                .password(password)
                .build();

        BasicUserRecordEntity recordEntity = BasicUserRecordEntity.builder()
                .user(basicUser)
                .build();

        basicUser.setUserRecord(recordEntity);
        recordEntity.setUser(basicUser);

        return handler.execute(basicUser, recordEntity);
    }

    public BasicUser(CreateUser.request request) {
        this.password = request.password();
        this.email = request.email();
        this.nickName = request.nickName();

        if (this.nickName == null) {
            setRandomNickName();
        }
    }

    private void setRandomNickName() {
        this.nickName = UUID.randomUUID().toString().substring(0, 15);
    }
}
