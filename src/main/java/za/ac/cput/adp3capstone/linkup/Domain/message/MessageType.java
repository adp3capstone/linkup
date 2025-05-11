package za.ac.cput.adp3capstone.linkup.Domain.message;

/* MessageType.java
MessageType enum
Author: Brezano Liebenberg (230463886)
Date:9 May 2025
*/

public enum MessageType {

    TEXT("Text"),
    IMAGE("Image"),
    VIDEO("Video"),
    GIF("GIF"),
    VOICENOTE("Voice Note");

    private final String displayName;

    MessageType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return displayName;
    }
}
