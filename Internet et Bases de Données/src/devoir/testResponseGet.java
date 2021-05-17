package devoir;

public class testResponseGet {
	// Attente de la connexion
	ReponseGet p = new ReponseGet(80);
	// Réception de la requête et envoi de la réponse
	p.RGet("devoir/");
	// fermeture de la connexion
	p.fin();
}
