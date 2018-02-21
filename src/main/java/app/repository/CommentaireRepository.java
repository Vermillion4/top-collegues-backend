package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entite.Commentaire;

public interface CommentaireRepository extends JpaRepository<Commentaire, Integer> {
		
}
