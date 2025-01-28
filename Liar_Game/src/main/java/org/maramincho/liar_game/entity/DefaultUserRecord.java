package org.maramincho.liar_game.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/*유저 전적*/
@Entity
@Table(name = "user_record")
@NoArgsConstructor
public final class DefaultUserRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private DefaultUser user;

    /* 승리 횟수 */
    @Column(name = "win_count", nullable = false)
    private Long winCount = 0L;

    /* 패배 횟수 */
    @Column(name = "defeat_count", nullable = false)
    private Long defeatCount = 0L;

    @Builder
    public DefaultUserRecord(DefaultUser user) {
        this.user = user;
    }

    //MARK: - Method
    public void winGame() {
        winCount += 1;
    }

    public void loseGame() {
        winCount -= 1;
    }
}
