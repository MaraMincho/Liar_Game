package org.maramincho.liar_game.entity;

import jakarta.persistence.*;
import lombok.Builder;

/*유저 전적*/
@Entity
@Table(name = "user_record")
public class UserRecord {
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
    public UserRecord() {

    }
}
