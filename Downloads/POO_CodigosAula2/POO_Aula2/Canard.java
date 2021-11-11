class Canard extends Animal {
    private int teeth;
    
    public Canard (String nom, int poids, int teeth) {
        super(nom,poids);
        this.teeth = teeth;
    }

    @Override
    public void crier() {
        System.out.println(this.getNom() + " yell this Canard has " + this.getPoid() +"kg and has " + this.teeth + " teeth");
    }
}