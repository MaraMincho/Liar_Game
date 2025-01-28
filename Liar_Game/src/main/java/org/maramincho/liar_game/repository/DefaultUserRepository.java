package org.maramincho.liar_game.repository;

import org.maramincho.liar_game.entity.DefaultUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DefaultUserRepository extends JpaRepository<DefaultUser, Long> {
}
