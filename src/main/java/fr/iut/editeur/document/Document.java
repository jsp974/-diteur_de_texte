package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    public void majuscules(int debut, int fin) {
        String debutTexte = texte.substring(0, debut);
        String finTexte = texte.substring(fin);
        texte = debutTexte + texte.substring(debut, fin).toUpperCase() + finTexte;
    }

    public void effacer(int debut, int fin) {
        remplacer(debut, fin, "");
    }

    public void clear() {
        setTexte("");
    }

    public void inserer (int position, String  inserer){
        String premierPartie = texte.substring(0, position);
        String deuxiemePartie = texte.substring(position, texte.length());
        texte = premierPartie + inserer+ deuxiemePartie;

    }

    @Override
    public String toString() {
        return this.texte;
    }
}
