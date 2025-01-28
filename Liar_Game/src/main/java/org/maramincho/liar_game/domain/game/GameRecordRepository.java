package org.maramincho.liar_game.domain.game;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRecordRepository extends JpaRepository<GameRecordEntity, Long> {
}
