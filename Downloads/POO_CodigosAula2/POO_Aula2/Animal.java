class Animal {

    private String nom;
    private int poids;

    public Animal (String nom, int poids) {
        this.nom = nom;
        if (peso < 0) {
            throw new IllegalArgumentException("O peso do animal deve ser positivo");
        }
        this.poids = poids;
    }

    public String getNom () {
        return this.nom;
    }

    public int getPoid () {
        return this.poids;
    }

    public void crier() {
        System.out.println(this.nom + " crier...");
    }

    @Override
    public String toString() {
        return "O animal" + this.nom + "tem" + this.poids + "kilos";
    }

}