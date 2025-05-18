package za.ac.cput.adp3capstone.linkup.factory;
/**
 * PreferenceFactoryTest.java
 * Author: Hope Kgomokaboya(222152672)
 * Date: 17/05/2025
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.adp3capstone.linkup.Domain.Preference;
import za.ac.cput.adp3capstone.linkup.factory.PreferenceFactory;

import static org.junit.jupiter.api.Assertions.*;

class PreferenceFactoryTest {
    private static Preference preference = PreferenceFactory.createBasicPreference(
            1,
            20,
            30,
            "FEMALE"
    );

    @Test
    void createBasicPreference() {
        assertNotNull(preference.getPreferenceId());
        System.out.println(preference);
    }
}