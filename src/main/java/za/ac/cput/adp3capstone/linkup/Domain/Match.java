package za.ac.cput.adp3capstone.linkup.Domain;
import java.time.LocalDateTime;

public class Match {
    private int matchId;
    private int userAId;
    private int userBId;
    private LocalDateTime matchedAt;

    protected Match(){

    }

    private Match(Builder builder){
        this.matchId = builder.matchId;
        this.userAId = builder.userAId;
        this.userBId = builder.userBId;
        this.matchedAt = builder.matchedAt;

    }

    public int getMatchId() {
        return matchId;
    }

    public int getUserAId() {
        return userAId;
    }

    public int getUserBId() {
        return userBId;
    }

    public LocalDateTime getMatchedAt() {
        return matchedAt;
    }

    @Override
    public String toString() {
        return "Match{" +
                "matchId=" + matchId +
                ", userAId=" + userAId +
                ", userBId=" + userBId +
                ", matchedAt=" + matchedAt +
                '}';
    }

    public static class Builder{
        private int matchId;
        private int userAId;
        private int userBId;
        private LocalDateTime matchedAt;

        public Builder setMatchId(int matchId) {
            this.matchId = matchId;
            return this;
        }

        public Builder setUserAId(int userAId) {
            this.userAId = userAId;
            return this;
        }

        public Builder setUserBId(int userBId) {
            this.userBId = userBId;
            return this;
        }

        public Builder setMatchedAt(LocalDateTime matchedAt) {
            this.matchedAt = matchedAt;
            return this;
        }

       public Builder copy(Match match){
            this.matchId = match.getMatchId();
            this.userAId = match.getUserAId();
            this.userBId = match.getUserBId();
            this.matchedAt = match.getMatchedAt();
            return this;
       }

       public Match build(){
            return new Match(this);
       }
    }
}
