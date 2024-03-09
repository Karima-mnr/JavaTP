package EXO2;

 class livre extends document {

    private String editeur;
    private String auteur;

    public livre(String titre, String editeur, String auteur) {
        super(titre);
        this.editeur = editeur;
        this.auteur = auteur;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void affiche() {
        super.affiche();
        System.out.println("Editeur : " + editeur);
        System.out.println("Auteur : " + auteur);
    }

}
