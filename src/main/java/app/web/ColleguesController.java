package app.web;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entite.Collegue;
import app.repository.CollegueRepository;;

/**
 * Liste des collaborateurs.
 * @author ETY12
 *
 */
@RestController
@RequestMapping("/collegues/")
public class ColleguesController{
	
	@Autowired CollegueRepository collegues;
	
	@GetMapping
	protected List<Collegue> listerCollegues(){
		return collegues.findAll();
	}
	
	@PostMapping
	protected void ajouterCollegue(@RequestBody Collegue nouveauCollegue){
		if(!collegues.findByNom(nouveauCollegue.getNom()).isEmpty()) {
			return;
		}
		collegues.save(nouveauCollegue);		
	}

	@PatchMapping(value="/{pseudo}")
	protected void modifieCollegue(@RequestBody Map<String,String> applicationCollegue, @PathVariable String pseudo){
		Optional<Collegue> collegueModif=collegues.findAll().stream().filter(collegue->collegue.getNom().equals(pseudo)).findFirst();
		if(collegueModif.isPresent()) {
			if(applicationCollegue.containsValue("aimer")) {
				collegues.aimerCollegue(pseudo);	
			}
			if(applicationCollegue.containsValue("detester")) {
				collegues.detesterCollegue(pseudo);
			}
		}
	}
	
}
