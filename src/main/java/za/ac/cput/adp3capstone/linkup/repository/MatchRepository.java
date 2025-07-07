package za.ac.cput.adp3capstone.linkup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.adp3capstone.linkup.Domain.Match;

import java.util.List;
import java.util.Optional;

public interface MatchRepository extends JpaRepository<Match, Integer> {
    // Find all matches where a given user is involved
    List<Match> findByUserAIdOrUserBId(Integer userId1, Integer userId2);

    // Check if a match already exists between two users (in either direction)
    Optional<Match> findByUserAIdAndUserBId(Integer userAId, Integer userBId);
    Optional<Match> findByUserBIdAndUserAId(Integer userBId, Integer userAId);

    // Optional: find all matches a user initiated
    List<Match> findByUserAId(Integer userId);

    // Optional: find all matches a user received
    List<Match> findByUserBId(Integer userId);
}
