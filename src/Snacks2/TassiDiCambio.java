package Snacks2;

public class TassiDiCambio {

    private String valuta;
    private double tasso;

    public TassiDiCambio(String valuta, double tasso) {
        this.valuta = valuta;
        this.tasso = tasso;
    }

    public String getValuta() {
        return valuta;
    }
    
    public double getTasso() {
        return tasso;
    }
    
}
