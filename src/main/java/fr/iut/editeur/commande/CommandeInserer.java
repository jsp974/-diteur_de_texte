package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument {


    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : inserer;position;texte");
            return;
        }
        String position = parameters[1];
        String texte = parameters[2];
        this.document.inserer(Integer.parseInt(position), texte);
        super.executer();
    }

    public String  getDescriptionCommande() {
        return "Ajoute un texte à l'endroit indiqué";
    }

}