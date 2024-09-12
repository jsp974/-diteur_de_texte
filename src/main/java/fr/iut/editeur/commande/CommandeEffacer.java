package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeEffacer extends CommandeDocument {

    public CommandeEffacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : effacer;debut;fin");
            return;
        }
        //ajout commentaire pour commit
        String debut = parameters[1];
        String fin = parameters[2];
        this.document.effacer(Integer.parseInt(debut), Integer.parseInt(fin));
        super.executer();
    }

    public String  getDescriptionCommande() {
        return "Supprime une un texte entre le debut et la fin";
    }

}

