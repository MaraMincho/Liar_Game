package org.maramincho.liar_game.repository;

import org.maramincho.liar_game.entity.GameRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRecordRepository extends JpaRepository<GameRecord, Long> {
}
