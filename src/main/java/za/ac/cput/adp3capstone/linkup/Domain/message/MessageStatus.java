package za.ac.cput.adp3capstone.linkup.domain.message;

/* MessageStatus.java
MessageStatus enum
Author: Brezano Liebenberg (230463886)
Date:9 May 2025
*/

public enum MessageStatus {
    SENT("Sent"),
    DELIVERED("delivered"),
    FAILED("failed"),
    PENDING("Pending");

    private final String displayName;

    MessageStatus(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return displayName;
    }
}