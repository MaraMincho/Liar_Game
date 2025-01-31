package org.maramincho.liar_game.chat.entity;

import jakarta.persistence.*;
import lombok.*;
import org.maramincho.liar_game.chat.domain.BasicChat;
import org.maramincho.liar_game.utils.entity.Timestamped;

@Entity
@Table(name = "normal_chat")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
public class MainChatEntity extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "content", length = 1024, nullable = false)
    private String content;

    @Column(name = "sender_id", nullable = false)
    private Long senderId;

    @Column(name = "nick_name", length = 15, nullable = false)
    private String nickName;

    public static MainChatEntity NormalChatEntityByBasicChat(BasicChat chat) {
        return MainChatEntity.builder()
                .content(chat.getContent())
                .senderId(chat.getSenderId())
                .nickName(chat.getNickName())
                .build();
    }

}
