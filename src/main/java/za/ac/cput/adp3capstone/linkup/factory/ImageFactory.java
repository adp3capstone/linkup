package za.ac.cput.adp3capstone.linkup.factory;

import za.ac.cput.adp3capstone.linkup.domain.Image;
import za.ac.cput.adp3capstone.linkup.util.Helper;

public class ImageFactory {
    public static Image createImage(
            long imageId,
            long userId,
            String imageUrl
    ){
        if(
                !Helper.isValidLong(imageId)
                || !Helper.isValidLong(userId)
                || Helper.isStringNullOrEmpty(imageUrl)
        ){
            return null;
        }
        return new Image.Builder()
                .setImageId(imageId)
                .setUserId(userId)
                .setImageUrl(imageUrl)
                .build();
    }
}
