package org.maramincho.liar_game.chat.service;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.maramincho.liar_game.chat.domain.ChatFactory;
import org.maramincho.liar_game.chat.dto.CreateMainChat;
import org.maramincho.liar_game.chat.dto.GetMainMessage;
import org.maramincho.liar_game.chat.entity.MainChatEntity;
import org.maramincho.liar_game.chat.repository.MainChatRepository;
import org.maramincho.liar_game.chat.utility.EntityToDomainUtility;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MainChatService {
    private final MainChatRepository mainChatRepository;

    public CreateMainChat.Response createChat(CreateMainChat.Request request) {
        final MainChatEntity currentMainChat = ChatFactory.makeMainChat(request)
                .toEntity();
        final var savedMainChatEntity = mainChatRepository.save(currentMainChat);

        return new CreateMainChat.Response(
                savedMainChatEntity.getId(),
                savedMainChatEntity.getSenderId(),
                savedMainChatEntity.getNickName(),
                savedMainChatEntity.getContent(),
                savedMainChatEntity.getCreatedAt()
        );
    }

//    public GetMainMessage.Response getMessage(
//            @NonNull GetChatMessageType type,
//            Integer limitCount,
//            Integer specificIndex
//    ) {
//        List<MainChatEntity> currentChats = mainChatRepository.getLatestLimit(limitCount);
//
//        return new GetMainMessage.Response(currentChats
//                                                   .stream()
//                                                   .map(EntityToDomainUtility::convertBaseChatFromMainChatEntity)
//                                                   .toList());
//    }

    public enum GetChatMessageType {
        LATEST, SPECIFIC

    }
}
