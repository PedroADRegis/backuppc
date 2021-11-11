class Tigre extends Animal {
    private int teeth;
    
    public Tigre (String nom, int poids, int teeth) {
        super(nom,poids);
        this.teeth = teeth;
    }

    @Override
    public void crier() {
        System.out.println(this.getNom() + " yell this Tigre has " + this.getPoid() +"kg and has " + this.teeth + " teeth");
    }
}