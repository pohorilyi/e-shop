package com.bobbbaich.repository;

import com.bobbbaich.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Bohdan Pohotilyi on 16.01.2016.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
