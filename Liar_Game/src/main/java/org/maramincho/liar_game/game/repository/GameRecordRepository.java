package org.maramincho.liar_game.game.repository;

import org.maramincho.liar_game.game.entity.GameRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRecordRepository extends JpaRepository<GameRecordEntity, Long> {
}
