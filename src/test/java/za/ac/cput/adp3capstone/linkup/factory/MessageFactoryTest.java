package za.ac.cput.adp3capstone.linkup.factory;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import za.ac.cput.adp3capstone.linkup.domain.message.Message;
import za.ac.cput.adp3capstone.linkup.Domain.message.MessageStatus;
import za.ac.cput.adp3capstone.linkup.Domain.message.MessageType;

class MessageFactoryTest {
    private static Message message1 = MessageFactory.createMessage(
            1002345678901L, 2003456789012L,2003456789013L
            ,3004567890123L,1002345678899L,"Hi, are we still on for the meeting tomorrow?"
            ,true,false, MessageStatus.DELIVERED
            ,"https://event.com/uploads/image98765.png", MessageType.IMAGE);

    @Test
    @Order(1)
    public void testCreateMessage() {
        assertNotNull(message1);
        System.out.println(message1.toString());
    }

    @Order(2)
    @Test
    public void testCreateMessageToFail() {
        fail();

        assertNotNull(message1);
        System.out.println(message1.toString());
    }

}