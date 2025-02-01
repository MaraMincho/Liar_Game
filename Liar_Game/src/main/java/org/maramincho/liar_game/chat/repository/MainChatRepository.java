package org.maramincho.liar_game.chat.repository;

import org.maramincho.liar_game.chat.entity.MainChatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MainChatRepository extends JpaRepository<MainChatEntity, Long> {

//    @Query(value = "SELECT * FROM main_chat ORDER BY id DESC LIMIT :limit_count", nativeQuery = true)
//    List<MainChatEntity> getLatestLimit(@Param("limit_count") int limit_count);
}