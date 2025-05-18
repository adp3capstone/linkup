package za.ac.cput.adp3capstone.linkup.factory;
/**
 * UserFactoryTest.java
 * Author: Hope Kgomokaboya(222152672)
 * Date: 17/05/2025
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.adp3capstone.linkup.Domain.User;

import static org.junit.jupiter.api.Assertions.*;

class UserFactoryTest {
    private static User user = UserFactory.createBasicUser(
            1001,
            "jane_doe",
            "password123",
            "jane@example.com",
            "Jane",
            "Doe",
            "25",
            "FEMALE"
    );

    @Test
    void createBasicUser() {
        assertNotNull(user.getUserId());
        System.out.println(user);
    }
}