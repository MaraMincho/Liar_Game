package org.maramincho.liar_game.domain.user.entity;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "basic_user")
@RequiredArgsConstructor
public final class BasicUserEntity {
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
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private BasicUserRecordEntity userRecord;

    @Builder
    public BasicUserEntity(String nickName) {
        this.nickName = nickName;
    }
}
