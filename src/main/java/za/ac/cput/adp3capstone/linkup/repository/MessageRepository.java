package za.ac.cput.adp3capstone.linkup.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.adp3capstone.linkup.domain.message.Message;

import java.util.Optional;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    //Optional<Message> findByMessage(String message);
}
