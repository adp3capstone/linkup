package za.ac.cput.adp3capstone.linkup.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.adp3capstone.linkup.domain.EmergencyContact;
import za.ac.cput.adp3capstone.linkup.domain.User;
import za.ac.cput.adp3capstone.linkup.factory.EmergencyContactFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmergencyContactServiceTest {

    public final EmergencyContactService ems;

    public User user = new User.Builder()
            .setUserId("123456789L")
            .setFirstName("John")
            .setLastName("Doe")
            .setEmail("")
            .build();

    public EmergencyContact emergencyContact = EmergencyContactFactory.createEmergencyContact(123456789L,
            user, "Anita Maxwine","","" );

    @Autowired
    public EmergencyContactServiceTest(EmergencyContactService ems) {
        this.ems = ems;
    }

    @Test
    void create() {
        EmergencyContact contact = ems.create(emergencyContact);
        assertNotNull(contact);
        System.out.println("Created: " + contact);
    }

    @Test
    void read() {
        EmergencyContact contact = ems.read(emergencyContact.getContactId());
        assertNotNull(contact);
        System.out.println("Read: " + contact);
    }

    @Test
    void update() {
        EmergencyContact updatedContact = new EmergencyContact.Builder()
                .setContactId(emergencyContact.getContactId())
                .setUser(user)
                .setPhoneNumber("1234567890")
                .build();

        EmergencyContact contact = ems.update(updatedContact);
        assertNotNull(contact);
        System.out.println("Updated: " + contact);
    }

    @Test
    void delete() {
        boolean deleted = ems.delete(emergencyContact.getContactId());
        assertTrue(deleted);
        System.out.println("Deleted: " + deleted);
    }
}