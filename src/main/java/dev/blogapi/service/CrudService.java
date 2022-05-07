package dev.blogapi.service;

import java.util.Optional;

public interface CrudService<T,ID> {
    Optional<T> findById(ID id);
}
