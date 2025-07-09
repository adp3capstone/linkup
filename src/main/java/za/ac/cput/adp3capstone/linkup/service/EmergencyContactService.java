package za.ac.cput.adp3capstone.linkup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.adp3capstone.linkup.domain.EmergencyContact;
import za.ac.cput.adp3capstone.linkup.repository.EmergencyContactRepository;

import java.util.Optional;

@Service
public class EmergencyContactService implements IService<EmergencyContact, Long> {

    private final EmergencyContactRepository repository;

    @Autowired
    public EmergencyContactService(EmergencyContactRepository repository) {
        this.repository = repository;
    }

    @Override
    public EmergencyContact create(EmergencyContact emergencyContact) {
        if (emergencyContact == null)
            return null;
        return repository.save(emergencyContact);
    }

    @Override
    public EmergencyContact read(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public EmergencyContact update(EmergencyContact emergencyContact) {
        if (emergencyContact == null || !repository.existsById(emergencyContact.getContactId()))
            return null;
        return repository.save(emergencyContact);
    }

    @Override
    public boolean delete(Long id) {
        if (!repository.existsById(id))
            return false;
        repository.deleteById(id);
        return true;
    }
}