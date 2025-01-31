package org.maramincho.liar_game.chat.repository;

import org.maramincho.liar_game.chat.entity.MainChatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainChatRepository extends JpaRepository<MainChatEntity, Long> {
}
