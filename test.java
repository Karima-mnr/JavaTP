package EXO2;

 class test {

    public static void main(String[] args) {

        livre livre1 = new livre(" The end of us ", "toni kroos", "lionel messi");
        internet internet1 = new internet("Harry potter", "https://www.premiersited'education.com/livre/");

        bibliotheque bibliotheque = new bibliotheque(5);
        bibliotheque.ajouter(livre1);
        bibliotheque.ajouter(internet1);
        bibliotheque.ajouter(new document("vikings"));

        bibliotheque.listing();

        System.out.println("Nombre de documents créés : " + document.getNbDocuments());

    }

}
