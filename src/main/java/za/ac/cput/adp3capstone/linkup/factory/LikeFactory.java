package za.ac.cput.adp3capstone.linkup.factory;
/*Like.java
Author: LM Makhanya(222788291)
Date : 11May 2025
 */

import za.ac.cput.adp3capstone.linkup.Domain.Like;
import za.ac.cput.adp3capstone.linkup.util.Helper;

import java.time.LocalDateTime;

public class LikeFactory {
    public static Like createLike(long likeId, int fromUserId, int toUserId, LocalDateTime timestamp){
        if (Helper.isValidLong(likeId) || Helper.isIntNull(fromUserId) || Helper.isIntNegative(fromUserId) ||
                Helper.isIntNull(toUserId) || Helper.isIntNegative(toUserId) ||
                fromUserId == toUserId ||
                Helper.isDateNull(timestamp) || Helper.isDateInFuture(timestamp)) {
            return null;
        }

        return new Like.Builder()
                .setLikeId(likeId)
                .setFromUserId(fromUserId)
                .setToUserId(toUserId)
                .setTimestamp(timestamp)
                .build();

    }
}
