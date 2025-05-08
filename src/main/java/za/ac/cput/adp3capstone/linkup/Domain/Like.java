package za.ac.cput.adp3capstone.linkup.Domain;

import java.time.LocalDateTime;

public class Like {
    private int likeId;
    private int fromUserId;
    private int toUserId;
    private LocalDateTime timestamp;

    protected Like(){

    }

    private Like(Builder builder){
        this.likeId = builder.likeId;
        this.fromUserId = builder.fromUserId;
        this.toUserId = builder.toUserId;
        this.timestamp = builder.timestamp;

    }

    public int getLikeId() {
        return likeId;
    }

    public int getFromUserId() {
        return fromUserId;
    }

    public int getToUserId() {
        return toUserId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Like{" +
                "likeId=" + likeId +
                ", fromUserId=" + fromUserId +
                ", toUserId=" + toUserId +
                ", timestamp=" + timestamp +
                '}';
    }

    public static class Builder{
        private int likeId;
        private int fromUserId;
        private int toUserId;
        private LocalDateTime timestamp;

        public Builder setToUserId(int toUserId) {
            this.toUserId = toUserId;
            return this;
        }

        public Builder setLikeId(int likeId) {
            this.likeId = likeId;
            return this;
        }

        public Builder setFromUserId(int fromUserId) {
            this.fromUserId = fromUserId;
            return this;
        }

        public Builder setTimestamp(LocalDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder copy(Like like){
            this.likeId = like.getLikeId();
            this.fromUserId = like.getFromUserId();
            this.toUserId = like.getToUserId();
            this.timestamp = like.getTimestamp();
            return this;
        }

        public Like build(){
            return new Like(this);
        }
    }
}
