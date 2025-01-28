package org.maramincho.liar_game.repository;

import org.maramincho.liar_game.entity.DefaultUserRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DefaultUserRecordRepository extends JpaRepository<DefaultUserRecord, Long> {

}
