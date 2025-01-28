package org.maramincho.liar_game.repository;

import org.maramincho.liar_game.entity.GameUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameUserRepository extends JpaRepository<GameUser, Long> {
}
