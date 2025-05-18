package za.ac.cput.adp3capstone.linkup.factory;
/* ChatFactoryTest.java
ChatFactoryTest class
Author: Anita Lottering (222141395)
Date:18th May 2025
 */
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
class ChatFactoryTest {

    public static za.ac.cput.adp3capstone.linkup.domain.Chat dummyChat = ChatFactory.createChat(
            1,               // chatId
            100,                   // fromUserAId
            200,                   // toUserBId
            300,                   // userMatchId
            LocalDateTime.now(),   // createdAt
            LocalDateTime.now(),   // updatedAt
            400,                   // lastMessageId
            " Hello :) When can we get together ?" // lastMessageContent
    );

    @Test
    public void createChat() {
        assertNotNull(dummyChat);
        System.out.println(dummyChat.toString());
    }
  
}