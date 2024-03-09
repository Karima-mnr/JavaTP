package EXO2;

 class bibliotheque {

    private document[] documents;
    private int nbDocuments;

    public bibliotheque(int taille) {
        documents = new document[taille];
        nbDocuments = 0;
    }

    public void ajouter(document d) {
        if (nbDocuments < documents.length) {
            documents[nbDocuments++] = d;
        } else {
            System.out.println("Bibliothèque pleine !");
        }
    }

    public void listing() {
        for (int i = 0; i < nbDocuments; i++) {
            documents[i].affiche();
            System.out.println();
        }
    }

}