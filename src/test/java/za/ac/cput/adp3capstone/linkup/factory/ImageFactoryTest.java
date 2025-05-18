package za.ac.cput.adp3capstone.linkup.factory;
/* Image Factory Test.java
Author: Ethan Le Roux (222622172)
Date:18 May 2025
*/
import org.junit.jupiter.api.Test;
import za.ac.cput.adp3capstone.linkup.domain.Image;

import static org.junit.jupiter.api.Assertions.*;
import static za.ac.cput.adp3capstone.linkup.factory.ImageFactory.createImage;

class ImageFactoryTest {
    public static Image dummyImage = ImageFactory.createImage(
            199999,
            1098690,
            "https://example.com/dummy.jpg"
    );

    @Test
    public void createImage() {
        assertNotNull(dummyImage);
        System.out.println(dummyImage.toString());
    }
}