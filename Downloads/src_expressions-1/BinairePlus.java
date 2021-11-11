public class BinairePlus extends ExpBinaire {
    String addvalueString;

    public BinairePlus (ExpAbstraite a, ExpAbstraite b) {
        addvalueString =  "( " + a.toStringInfixe() + " + " + b.toStringInfixe() + " )";
    }

    @Override
    public String toStringInfixe() {
        return this.addvalueString;
    }

}