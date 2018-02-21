package app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entite.Collegue;

public interface CollegueRepository extends JpaRepository<Collegue, Integer> {
		
		public List<Collegue> findByNom(String pseudo);
		public default void aimerCollegue(String pseudo) {
			Optional<Collegue> collegue=findAll().stream().filter(collegueModifie->collegueModifie.getNom().equals(pseudo)).findFirst();
			if(collegue.isPresent()) {
				collegue.get().setNote(collegue.get().getNote()+10);
			}
		}

		public default void detesterCollegue(String pseudo) {
			Optional<Collegue> collegue=findAll().stream().filter(collegueModifie->collegueModifie.getNom().equals(pseudo)).findFirst();
			if(collegue.isPresent()) {
				collegue.get().setNote(collegue.get().getNote()-5);
			}
		}
}
