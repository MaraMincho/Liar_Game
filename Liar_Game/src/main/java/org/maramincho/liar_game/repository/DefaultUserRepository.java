package org.maramincho.liar_game.repository;

import org.maramincho.liar_game.entity.DefaultUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DefaultUserRepository extends JpaRepository<DefaultUserEntity, Long> {
}
