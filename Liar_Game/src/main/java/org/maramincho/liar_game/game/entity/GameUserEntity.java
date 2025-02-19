package org.maramincho.liar_game.game.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.maramincho.liar_game.user.entity.BasicUserEntity;

@Entity
@Table(name = "game_user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
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
    private BasicUserEntity user;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "is_winner", nullable = false)
    private Boolean isWinner;
}
