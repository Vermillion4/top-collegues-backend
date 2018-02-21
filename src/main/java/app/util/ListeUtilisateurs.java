package app.util;

import org.springframework.beans.factory.annotation.Autowired;

import app.entite.Collegue;
import app.repository.CollegueRepository;

public class ListeUtilisateurs {
	
	public ListeUtilisateurs(final CollegueRepository COLLEGUES_SERVICE){
		
		//this.COLLEGUES_SERVICE=COLLEGUES_SERVICE;
		if(VerificationEnBase(COLLEGUES_SERVICE)){
			return;
		}
		
		Collegue lars=new Collegue();
		lars.setNom("Lars");
		lars.setImgUrl("http://www.fightersgeneration.com/nz4/char/tekken7/dragnov-tekken7-render-official.png");
		lars.setNote(100);
		COLLEGUES_SERVICE.save(lars);
		
		//Lei
		Collegue lei=new Collegue();
		lei.setNom("Lei");
		lei.setImgUrl("http://vignette3.wikia.nocookie.net/tekkenpedia/images/b/b8/Lei_Wulong_T5DR_CG_Infobox.png/revision/latest/scale-to-width-down/300?cb=20150528122824&path-prefix=fr");
		lei.setNote(120);
		COLLEGUES_SERVICE.save(lei);
		
		//Law
		Collegue law=new Collegue();
		law.setNom("Law");
		law.setImgUrl("http://www.fightersgeneration.com/nz4/char/tekken7/law-tekken7-render-official.png");
		law.setNote(83);
		COLLEGUES_SERVICE.save(law);
		
		//Nina
		Collegue nina=new Collegue();
		nina.setNom("Nina");
		nina.setImgUrl("https://cdn1.vox-cdn.com/thumbor/UPsYNbkxgL4LR8fzT8ILX_kU260=/cdn0.vox-cdn.com/uploads/chorus_asset/file/5969717/tekken_7_nina_artwork.0.jpg");
		nina.setNote(76);
		COLLEGUES_SERVICE.save(nina);
		
		//Fran
		Collegue fran=new Collegue();
		fran.setNom("Fran");
		fran.setImgUrl("http://images2.fanpop.com/images/photos/3100000/Final-Fantasy-XII-Fran-final-fantasy-12-3118598-890-1200.jpg");
		fran.setNote(40);
		COLLEGUES_SERVICE.save(fran);
		
		//Penelo
		Collegue penelo=new Collegue();
		penelo.setNom("Penelo");
		penelo.setImgUrl("penelo.jpg");
		penelo.setNote(100);
		COLLEGUES_SERVICE.save(penelo);
		
		//Cid
		Collegue cid=new Collegue();
		cid.setNom("Lars");
		cid.setImgUrl("http://orig12.deviantart.net/42f7/f/2013/341/3/8/final_fantasy_xiii_cid_raines_by_armachamcorp-d6x1qa3.jpg");
		cid.setNote(84);
		COLLEGUES_SERVICE.save(cid);

		
	}

	private boolean VerificationEnBase(CollegueRepository COLLEGUES_SERVICE) {
		return COLLEGUES_SERVICE==null?false:COLLEGUES_SERVICE.count()!=0;
	}
	
}
