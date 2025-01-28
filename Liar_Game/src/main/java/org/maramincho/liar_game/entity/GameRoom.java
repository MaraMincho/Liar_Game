package org.maramincho.liar_game.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Optional;

@Entity
@Table(name = "game_room")
public class GameRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    Long id;

    @Column(name = "room_name", unique = false, nullable = false)
    private String roomName;

    @Column(name = "max_player_count")
    private int maxPlayerCount;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "now_playing", nullable = false)
    private Boolean nowPlaying;
}
