package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMinuscules extends CommandeDocument {

    public CommandeMinuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : minuscules;debut;fin");
            return;
        }
        //ajout commentaire pour commit
        String debut = parameters[1];
        String fin = parameters[2];
        this.document.minuscules(Integer.parseInt(debut), Integer.parseInt(fin));
        super.executer();
    }
}
