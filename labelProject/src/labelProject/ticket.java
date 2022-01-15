package labelProject;

import java.util.UUID;

public class ticket {

	private String vorname;
	private String nachname;
	private static Integer  ID=0;
	private String beschreibung;
	
	public ticket(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.beschreibung = beschreibung;
		this.ID = ID++;
	}

	public String getVorname() {
		return vorname.toString();
	}

	public String getNachname() {
		return nachname.toString();
	}

	public String getID() {
		
		return ID.toString();
	}
	
	
}
