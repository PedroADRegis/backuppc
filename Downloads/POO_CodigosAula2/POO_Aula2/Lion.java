class Lion extends Animal {
    private String cor;
    
    public Lion (String nom, int poids, String cor) {
        super(nom,poids);
        this.cor = cor;
    }

    @Override
    public void crier() {
        System.out.println(this.getNom() + " yell this Lyon has " + this.getPoid() +"kg and the color is " + this.cor);
    }
}