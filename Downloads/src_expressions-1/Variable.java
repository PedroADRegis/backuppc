public class Variable extends ExpAbstraite {
    
    protected String name;

    public Variable (String name) {
        this.name = name;
    }

    @Override
    public String toStringInfixe () {
        return this.name;

    }
}