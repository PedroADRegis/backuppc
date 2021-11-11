

class TestZoo {

    public static void main(String[] args) {


        Zoo ensimag = new Zoo("ensimag");

        String[] nomes = new String[]{"Catherine","Julie","Sahar Benoit","Nicolas","Sebastien","Sylvain"};
        Animal[] animais = new Animal[nomes.length];

        for (int i = 0; i < nomes.length; i++) {
            ensimag.ajouteAnimal(new Animal(nomes[i],20));
        }
        
        ensimag.crier();
        
    
    }

}