package za.ac.cput.adp3capstone.linkup.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.adp3capstone.linkup.Domain.message.MessageStatus;
import za.ac.cput.adp3capstone.linkup.Domain.message.MessageType;
import za.ac.cput.adp3capstone.linkup.domain.message.Message;
import za.ac.cput.adp3capstone.linkup.factory.MessageFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MessageRepositoryTest {

    @Autowired
    private MessageRepository messageRepository;

    private static Message message = MessageFactory.createMessage(1002345678901L, 2003456789012L,2003456789013L
            ,3004567890123L,1002345678899L,"Hey, are we still on for the meeting tomorrow?"
            ,true,false, MessageStatus.DELIVERED
            ,"https://event.com/uploads/image98765.png", MessageType.IMAGE);

    @Test
    @Order(1)
    public void create() {
        Message createdMessage = messageRepository.save(message);
        assertNotNull(createdMessage);
        System.out.println(createdMessage);
    }

    @Test
    @Order(2)
    public void read() {
        Message read = messageRepository.findById(message.getMessageId()).orElse(null);
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    @Order(3)
    public void update() {
        Message updatedMessage = new Message.Builder().copy(message)
                .setMessage("Hey, I won't make it to the meeting tomorrow.")
                .build();
        Message created = messageRepository.save(updatedMessage);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    @Order(4)
    public void delete() {
        messageRepository.deleteById(message.getMessageId());
        System.out.println("Deleted:" + messageRepository.findById(message.getMessageId()));
    }

    @Test
    @Order(5)
    public void getAll(){
        System.out.println("All messages:");
        for(Message message : messageRepository.findAll()){
            System.out.println(message);
        }
    }

}