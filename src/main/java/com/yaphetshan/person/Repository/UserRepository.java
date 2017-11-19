package com.yaphetshan.person.Repository;

import com.yaphetshan.person.model.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {
}

