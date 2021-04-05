package com.marcusscalet.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcusscalet.hrworker.model.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
