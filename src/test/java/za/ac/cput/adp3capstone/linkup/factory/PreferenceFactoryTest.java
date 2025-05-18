package za.ac.cput.adp3capstone.linkup.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.adp3capstone.linkup.Domain.Preference;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class PreferenceFactoryTest {

    private static Preference preference1 = PreferenceFactory.createPreference(12, 18, 25, "Female",
            List.of("IT"), 10, false, true, "Friendship",
            List.of("Gaming")
    );

    private static Preference preference = PreferenceFactory.createBasicPreference(
            1,
            20,
            30,
            "FEMALE"
    );
    @Test
    void createPreference() {
        assertNotNull(preference1);
        System.out.println(preference1.toString());
    }

    @Test
    void createBasicPreference() {
        assertNotNull(preference);
        System.out.println(preference.toString());
    }
}