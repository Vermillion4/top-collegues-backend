package app.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Avis {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column
	private AvisGlobal avis;
	
	@Column
	private String suggestions;
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the collegue
	 */
	public AvisGlobal getAvisGlobal() {
		return avis;
	}

	/**
	 * @param collegue the collegue to set
	 */
	public void setAvisGlobal(AvisGlobal avis) {
		this.avis = avis;
	}

	/**
	 * @return les suggestions
	 */
	public String getSuggestions() {
		return suggestions;
	}

	/**
	 * @param suggestion
	 */
	public void setSuggestion(String suggestions) {
		this.suggestions = suggestions;
	}

	enum AvisGlobal{
		Mauvais,Bon,Excellent
	}
	
	public Avis() {
		
	}
	
}
