package com.spring.demo.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Document(collection="Utilisateur")
public class Utilisateur {

	private int id;
	private String nom;
	private String prenom;
	private int age;
	private Adresse adresse;
	private String mail;
	private String motDePasse;
	private List<Musique> playlist;
	private List<Anecdote> anecdotes;
	private List<Commentaire> commentaires;
	

}
