package org.maramincho.liar_game.domain.user.repository;

import org.maramincho.liar_game.domain.user.entity.BasicUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasicUserRepository extends JpaRepository<BasicUserEntity, Long> {
}
