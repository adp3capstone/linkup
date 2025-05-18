package za.ac.cput.adp3capstone.linkup.factory;

import za.ac.cput.adp3capstone.linkup.Domain.Match;
import za.ac.cput.adp3capstone.linkup.util.Helper;


import java.time.LocalDateTime;

public class MatchFactory {
    public static Match createMatch(int matchId, int userAId, int userBId, LocalDateTime matchedAt) {
        if (Helper.isIntNull(matchId) || Helper.isIntNegative(matchId) ||
                Helper.isIntNull(userAId) || Helper.isIntNegative(userAId) ||
                Helper.isIntNull(userBId) || Helper.isIntNegative(userBId) ||
                userAId == userBId ||
                Helper.isDateNull(matchedAt) || Helper.isDateInFuture(matchedAt)) {
            return null;
        }

        return new Match.Builder()
                .setMatchId(matchId)
                .setUserAId(userAId)
                .setUserBId(userBId)
                .setMatchedAt(matchedAt)
                .build();

    }
}
