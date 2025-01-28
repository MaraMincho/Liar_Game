package org.maramincho.liar_game.repository;

import org.maramincho.liar_game.entity.GameUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameUserRepository extends JpaRepository<GameUserEntity, Long> {
}
