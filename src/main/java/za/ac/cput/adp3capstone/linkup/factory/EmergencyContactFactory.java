package za.ac.cput.adp3capstone.linkup.factory;

import za.ac.cput.adp3capstone.linkup.domain.EmergencyContact;
import za.ac.cput.adp3capstone.linkup.domain.User;
import za.ac.cput.adp3capstone.linkup.util.Helper;

public class EmergencyContactFactory {
    public static EmergencyContact createEmergencyContact(Long contactId, User user, String name, String phoneNumber, String email) {
        if (!Helper.isValidLong(contactId))
            return null;
        if (Helper.isObjectNull(user))
            return null;
        if (Helper.isStringNullOrEmpty(name))
            return null;
        if (Helper.isStringNullOrEmpty(phoneNumber) || !Helper.isValidPhoneNumber(phoneNumber))
            return null;
        if (!Helper.isStringNullOrEmpty(email) && !Helper.isValidEmail(email))
            return null;

        return new EmergencyContact.Builder()
                .setContactId(contactId)
                .setUser(user)
                .setName(name)
                .setPhoneNumber(phoneNumber)
                .setEmail(email)
                .build();
    }
}