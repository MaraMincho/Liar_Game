package org.maramincho.liar_game.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "game_user")
public final class GameUserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "game_record_id", nullable = false)
    private GameRecordEntity gameRecord;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private DefaultUserEntity user;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "is_winner", nullable = false)
    private Boolean isWinner;
}
