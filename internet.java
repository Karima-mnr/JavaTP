package EXO2;

    
 class internet extends document {

    private String url;

    public internet(String titre, String url) {
        super(titre);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    
    public void affiche() {
        super.affiche();
        System.out.println("URL : " + url);
    }

}

