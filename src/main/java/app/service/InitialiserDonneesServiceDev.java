package app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.repository.CollegueRepository;
import app.util.ListeUtilisateurs;

@Transactional	
@Service
public class InitialiserDonneesServiceDev implements InitialiserDonneesService {

	@Autowired private CollegueRepository utilisateurs;
	@Override
	public void initialiser() {
		new ListeUtilisateurs(utilisateurs);
	}

}
