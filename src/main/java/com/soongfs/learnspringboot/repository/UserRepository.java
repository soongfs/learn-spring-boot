package com.soongfs.learnspringboot.repository;

import com.soongfs.learnspringboot.pojo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository    // spring bean
public interface UserRepository extends CrudRepository<User, Integer> {
}
