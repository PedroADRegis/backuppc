public class UnaireSin extends ExpUnaire {
    
    protected String seno;

    public UnaireSin (ExpAbstraite a)  {
        this.seno = a.toStringInfixe();
    }
    @Override
    public String toStringInfixe() {
        return seno;
    }
}