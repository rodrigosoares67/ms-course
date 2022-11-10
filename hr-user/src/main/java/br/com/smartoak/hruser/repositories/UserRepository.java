package br.com.smartoak.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.smartoak.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
