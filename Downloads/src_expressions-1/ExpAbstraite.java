public abstract class ExpAbstraite {
    protected abstract String toStringInfixe();

    @Override
    public String toString () {
        return this.toStringInfixe();
    }
}