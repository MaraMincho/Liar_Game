package org.maramincho.liar_game.domain.game.repository;

import org.maramincho.liar_game.domain.game.entity.GameUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameUserRepository extends JpaRepository<GameUserEntity, Long> {
}
