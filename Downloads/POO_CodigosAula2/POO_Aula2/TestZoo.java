

class TestZoo {

    public static void main(String[] args) {


        Zoo ensimag = new Zoo("ensimag");


        ensimag.ajouteAnimal(new Lion("Catherine",20,"Purple"));
        ensimag.ajouteAnimal(new Tigre("Julie",15,80));
        ensimag.ajouteAnimal(new Animal("Sahar Benoit",1));
        ensimag.ajouteAnimal(new Animal("Nicolas",1));
        ensimag.ajouteAnimal(new Animal("Sebastien",1));
        ensimag.ajouteAnimal(new Animal("Sylvain",1));
      
        ensimag.crier();
        
    
    }

}