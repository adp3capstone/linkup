package za.ac.cput.adp3capstone.linkup.factory;

import za.ac.cput.adp3capstone.linkup.Domain.Like;
import za.ac.cput.adp3capstone.linkup.util.Helper;

import java.time.LocalDateTime;

public class LikeFatory {
    public static Like createLike(int likeId, int fromUserId, int toUserId, LocalDateTime timestamp){
        if (Helper.isIntNull(likeId) || Helper.isIntNegative(likeId) ||
                Helper.isIntNull(fromUserId) || Helper.isIntNegative(fromUserId) ||
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
