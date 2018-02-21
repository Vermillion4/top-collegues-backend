package app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import app.service.InitialiserDonneesService;

@Component
public class StartupListener {

	@Autowired
	private InitialiserDonneesService initService;

	
	@EventListener(ContextRefreshedEvent.class)
	public void contextRefreshedEvent() {
		// capture du démarrage de l'application
		// à un moment où le contexte Spring est complètement créé
		initService.initialiser();	
	}
	
}
