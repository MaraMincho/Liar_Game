package org.maramincho.liar_game.user.entity;


import jakarta.persistence.*;
import lombok.*;
import org.maramincho.liar_game.utils.entity.Timestamped;

@Entity
@Table(name = "basic_user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
public final class BasicUserEntity extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    /* 닉네임 */
    @Column(name = "nick_name", length = 15, nullable = false)
    private String nickName;

    /* 이메일 */
    @Column(name = "email", nullable = true)
    private String email;

    /* 패스워드 */
    @Column(name = "password", nullable = true)
    private String password;

    /* 유저 전적 */
    @Setter
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private BasicUserRecordEntity userRecord;
}
