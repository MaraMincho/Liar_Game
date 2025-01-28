package org.maramincho.liar_game.user.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.maramincho.liar_game.user.entity.BasicUserEntity;
import org.maramincho.liar_game.user.entity.BasicUserRecordEntity;

@AllArgsConstructor
@Getter
public class DefaultUser {
    private Long id;
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

}
