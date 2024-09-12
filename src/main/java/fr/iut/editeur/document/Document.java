package fr.iut.editeur.document;

public class Document {

    private String contentDocument;

    public Document() {
        this.contentDocument = "";
    }

    /**
     * Description de la méthode
     * @return truc
     */
    public String getContentDocument() {
        return contentDocument;
    }

    /**
     * Description de la méthode
     * @param contentDocument description du premier paramètre
     * @return truc
     */
    public void setContentDocument(String contentDocument) {
        this.contentDocument = contentDocument;
    }

    /**
     * Description de la méthode
     * @param texte description du premier paramètre
     * @return truc
     */
    public void ajouter(String texte) {
        this.contentDocument += texte;
    }

    /**
     * Description de la méthode
     * @param debut description du premier paramètre
     * @param fin description du premier paramètre
     * @param remplacement description du premier paramètre
     * @return truc
     */
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = contentDocument.substring(0, debut);
        String partieDroite = contentDocument.substring(fin + 1);
        contentDocument = partieGauche + remplacement + partieDroite;
    }

    /**
     * Description de la méthode
     * @param debut description du premier paramètre
     * @param fin description du premier paramètre
     * @return truc
     */
    public void majuscules(int debut, int fin) {
        String debutTexte = contentDocument.substring(0, debut);
        String finTexte = contentDocument.substring(fin);
        contentDocument = debutTexte + contentDocument.substring(debut, fin).toUpperCase() + finTexte;
    }

    /**
     * Description de la méthode
     * @param debut description du premier paramètre
     * @param fin description du premier paramètre
     * @return truc
     */
    public void effacer(int debut, int fin) {
        remplacer(debut, fin, "");
    }

    /**
     * Description de la méthode
     * @return truc
     */
    public void clear() {
        setContentDocument("");
    }

    /**
     * Description de la méthode
     * @param position description du premier paramètre
     * @param inserer description du premier paramètre
     * @return truc
     */
    public void inserer (int position, String  inserer){
        String premierPartie = contentDocument.substring(0, position);
        String deuxiemePartie = contentDocument.substring(position, contentDocument.length());
        contentDocument = premierPartie + inserer+ deuxiemePartie;

    }

    /**
     * Description de la méthode
     * @param debut description du premier paramètre
     * @param fin description du premier paramètre
     * @return truc
     */
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
