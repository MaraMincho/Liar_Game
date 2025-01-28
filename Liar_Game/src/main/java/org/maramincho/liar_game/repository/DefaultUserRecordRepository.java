package org.maramincho.liar_game.repository;

import org.maramincho.liar_game.entity.DefaultUserRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DefaultUserRecordRepository extends JpaRepository<DefaultUserRecordEntity, Long> {

}
