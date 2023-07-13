package io.github.caioopr.productsdisplay.repositories;

import io.github.caioopr.productsdisplay.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
