package za.ac.cput.adp3capstone.linkup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.adp3capstone.linkup.Domain.Like;

import java.util.List;
import java.util.Optional;

public interface LikeRepository extends JpaRepository<Like, Long> {

    Optional<Like> findByFromUserIdAndToUserId(Integer fromUserId, Integer toUserId);

    // Find all likes sent by a user
    List<Like> findByFromUserId(Integer fromUserId);

    // Find all likes received by a user
    List<Like> findByToUserId(Integer toUserId);

    // Optional: Find mutual like (both directions exist)
    boolean existsByFromUserIdAndToUserId(Integer fromUserId, Integer toUserId);

    boolean existsByFromUserIdAndToUserIdAndTimestampIsNotNull(Integer fromUserId, Integer toUserId);
}
