public class Constante extends ExpAbstraite {
    protected double value;

    public Constante (double value) {
        this.value = value;
    }

    @Override
    public String toStringInfixe () {
        return String.valueOf(this.value);
    }
}