public class BinaireMult extends ExpBinaire {

    protected String addvalueString;
    
    public BinaireMult (ExpAbstraite a, ExpAbstraite b ) {
        this.addvalueString = "( " + a.toStringInfixe() + " * " + b.toStringInfixe() + " )";
    }

    @Override
    public String toStringInfixe () {
        return this.addvalueString;
    }

}