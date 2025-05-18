package za.ac.cput.adp3capstone.linkup.factory;
/*Like.java
Author: LM Makhanya(222788291)
Date : 11May 2025
 */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.adp3capstone.linkup.Domain.Like;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LikeFactoryTest {

    @Test
    void a_createLike_successful() {
        Like like = LikeFactory.createLike(1, 100, 200, LocalDateTime.now());
        assertNotNull(like);
        assertEquals(1, like.getLikeId());
        assertEquals(100, like.getFromUserId());
        assertEquals(200, like.getToUserId());

    }

    @Test
    void b_createLike_futureDate() {
        Like like = LikeFactory.createLike(1, 100, 200, LocalDateTime.now().plusDays(1));
        assertNull(like);
    }

    @Test
    void c_createLike_negativeId() {
        Like like = LikeFactory.createLike(-1, 100, 200, LocalDateTime.now());
        assertNull(like);
    }

    @Test
    void d_createLike_nullDate() {
        Like like = LikeFactory.createLike(1, 100, 200, null);
        assertNull(like);
    }
}