package br.com.smartoak.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.smartoak.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
	
}
