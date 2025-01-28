package org.maramincho.liar_game.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BasicUserRepository extends JpaRepository<BasicUserEntity, Long> {
}
