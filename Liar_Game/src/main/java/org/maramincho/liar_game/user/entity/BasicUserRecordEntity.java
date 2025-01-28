package org.maramincho.liar_game.user.entity;

import jakarta.persistence.*;
import lombok.*;

/*유저 전적*/
@Entity
@Table(name = "user_record")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public final class BasicUserRecordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @OneToOne
    @Setter
    @JoinColumn(name = "user_id", nullable = false)
    private BasicUserEntity user;

    /* 승리 횟수 */
    @Column(name = "win_count", nullable = false)
    private Long winCount = 0L;

    /* 패배 횟수 */
    @Column(name = "defeat_count", nullable = false)
    private Long defeatCount = 0L;

    //MARK: - Method
    public void winGame() {
        winCount += 1;
    }

    public void loseGame() {
        winCount -= 1;
    }
}
