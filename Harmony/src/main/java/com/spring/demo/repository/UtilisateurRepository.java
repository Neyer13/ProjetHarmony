package com.spring.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.demo.model.Utilisateur;

public interface UtilisateurRepository extends MongoRepository<Utilisateur, Integer> {

}
