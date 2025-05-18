package za.ac.cput.adp3capstone.linkup.factory;
/* ChatFactory.java
ChatFactory class
Author: Anita Lottering (222141395)
Date:18th May 2025
 */
import za.ac.cput.adp3capstone.linkup.domain.Chat;

import java.time.LocalDateTime;

public class ChatFactory {

    public static Chat createChat(
            int chatId,
            int fromUserAId,
            int toUserBId,
            int userMatchId,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            int lastMessageId,
            String lastMessageContent) {

        if (createdAt == null || updatedAt == null || lastMessageContent == null || lastMessageContent.isEmpty()) {
            return null;
        }

        return new Chat.Builder()
                .setChatId(chatId)
                .setUserAId(fromUserAId)
                .setToUserBId(toUserBId)
                .setUserMatchId(userMatchId)
                .setCreatedAt(createdAt)
                .setUpdatedAt(updatedAt)
                .setLastMessageId(lastMessageId)
                .setLastMessageContent(lastMessageContent)
                .build();
    }
}
