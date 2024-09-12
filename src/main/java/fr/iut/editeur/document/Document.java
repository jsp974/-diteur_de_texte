package fr.iut.editeur.document;

public class Document {

    private String contentDocument;

    public Document() {
        this.contentDocument = "";
    }
	
    public String getContentDocument() {
        return contentDocument;
    }

    public void setContentDocument(String contentDocument) {
        this.contentDocument = contentDocument;
    }


    public void ajouter(String texte) {
        this.contentDocument += texte;
    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = contentDocument.substring(0, debut);
        String partieDroite = contentDocument.substring(fin + 1);
        contentDocument = partieGauche + remplacement + partieDroite;
    }

    public void majuscules(int debut, int fin) {
        String debutTexte = contentDocument.substring(0, debut);
        String finTexte = contentDocument.substring(fin);
        contentDocument = debutTexte + contentDocument.substring(debut, fin).toUpperCase() + finTexte;
    }

    public void effacer(int debut, int fin) {
        remplacer(debut, fin, "");
    }

    public void clear() {
        setContentDocument("");
    }

    public void inserer (int position, String  inserer){
        String premierPartie = contentDocument.substring(0, position);
        String deuxiemePartie = contentDocument.substring(position, contentDocument.length());
        contentDocument = premierPartie + inserer+ deuxiemePartie;

    }
        public void minuscules(int debut, int fin) {
        String debutTexte = contentDocument.substring(0, debut);
        String finTexte = contentDocument.substring(fin);
        contentDocument = debutTexte + contentDocument.substring(debut, fin).toLowerCase() + finTexte;
    }

    @Override
    public String toString() {
        return this.contentDocument;
    }
}
