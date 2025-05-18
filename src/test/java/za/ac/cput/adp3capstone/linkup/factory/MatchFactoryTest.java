package za.ac.cput.adp3capstone.linkup.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.adp3capstone.linkup.Domain.Match;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MatchFactoryTest {

    @Test
    void a_createMatch() {
        Match match = MatchFactory.createMatch(1, 101, 102, LocalDateTime.now());

        assertNotNull(match);
        assertEquals(1, match.getMatchId());
        assertEquals(101, match.getUserAId());
        assertEquals(102, match.getUserBId());
    }

    @Test
    void b_createMatch_sameUserIds() {
        Match match = MatchFactory.createMatch(1, 101, 101, LocalDateTime.now());

        assertNull(match);
    }

    @Test
    void c_createMatch_negativeUseId() {
        Match match = MatchFactory.createMatch(1, -5, 102, LocalDateTime.now());

        assertNull(match);
    }

    @Test
    void d_createMatch_nullMatchId() {
        Match match = MatchFactory.createMatch(0, 101, 102, LocalDateTime.now());

        assertNull(match);
    }
}

