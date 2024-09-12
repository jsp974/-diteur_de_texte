package fr.iut.editeur.document;

public class Document {

    private String texteDocument;

    public Document() {
        this.texteDocument = "";
    }
	
    public String getTexteDocument() {
        return texteDocument;
    }

    public void setTexteDocument(String texteDocument) {
        this.texteDocument = texteDocument;
    }

    public void ajouter(String texte) {
        this.texteDocument += texte;
    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texteDocument.substring(0, debut);
        String partieDroite = texteDocument.substring(fin + 1);
        texteDocument = partieGauche + remplacement + partieDroite;
    }

    public void majuscules(int debut, int fin) {
        String debutTexte = texteDocument.substring(0, debut);
        String finTexte = texteDocument.substring(fin);
        texteDocument = debutTexte + texteDocument.substring(debut, fin).toUpperCase() + finTexte;
    }

    public void effacer(int debut, int fin) {
        remplacer(debut, fin, "");
    }

    public void clear() {
        setTexteDocument("");
    }

    public void inserer (int position, String  inserer){
        String premierPartie = texteDocument.substring(0, position);
        String deuxiemePartie = texteDocument.substring(position, texteDocument.length());
        texteDocument = premierPartie + inserer+ deuxiemePartie;

    }
        public void minuscules(int debut, int fin) {
        String debutTexte = texteDocument.substring(0, debut);
        String finTexte = texteDocument.substring(fin);
        texteDocument = debutTexte + texteDocument.substring(debut, fin).toLowerCase() + finTexte;
    }

    @Override
    public String toString() {
        return this.texteDocument;
    }
}
