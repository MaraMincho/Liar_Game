package org.maramincho.liar_game.user.domain;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jdk.jfr.Frequency;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.maramincho.liar_game.user.dto.CreateUser;
import org.maramincho.liar_game.user.entity.BasicUserEntity;
import org.maramincho.liar_game.user.entity.BasicUserRecordEntity;

import java.util.UUID;

@AllArgsConstructor
@Getter
public class DefaultUser {
    private String nickName;
    private String email;
    private String password;

    public BasicUserEntity toEntity() {
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

        return basicUser;
    }

    public DefaultUser(CreateUser.request request) {
        this.password = request.password();
        this.email = request.email();
        this.nickName = request.nickName();

        if (this.nickName == null) {
            setRandomNickName();
        }
    }

    private void setRandomNickName() {
        this.nickName = UUID.randomUUID().toString();
    }
}
