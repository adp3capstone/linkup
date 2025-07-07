package za.ac.cput.adp3capstone.linkup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.adp3capstone.linkup.domain.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
    // Custom query methods can be defined here if needed
    // For example, find by userId or imageUrl
}
