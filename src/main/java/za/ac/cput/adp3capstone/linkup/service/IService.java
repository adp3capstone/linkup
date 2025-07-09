package za.ac.cput.adp3capstone.linkup.service;

import java.util.Optional;

public interface IService<T, ID> {
    T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);
}