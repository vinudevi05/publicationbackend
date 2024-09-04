package com.vinu.publication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinu.publication.model.Useee;

public interface UserRepository extends JpaRepository<Useee, Long> {

}
