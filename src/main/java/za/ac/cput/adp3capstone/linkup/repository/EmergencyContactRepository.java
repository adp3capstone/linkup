package za.ac.cput.adp3capstone.linkup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.adp3capstone.linkup.domain.EmergencyContact;

public interface EmergencyContactRepository extends JpaRepository<EmergencyContact, Long> {
}
