package org.maramincho.liar_game.domain.user.repository;

import org.maramincho.liar_game.domain.user.entity.BasicUserRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasicUserRecordRepository extends JpaRepository<BasicUserRecordEntity, Long> {

}
