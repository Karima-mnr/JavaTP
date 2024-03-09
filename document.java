 package EXO2;
 class document {

    private static int nbDocuments = 0; 
    private String titre;

    public document() {
        this.titre = "Document sans titre";
        nbDocuments++;
    }

    public document(String titre) {
        this.titre = titre;
        nbDocuments++;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public static int getNbDocuments() {
        return nbDocuments;
    }

    public void affiche() {
        System.out.println("Titre : " + titre);
    }

}

