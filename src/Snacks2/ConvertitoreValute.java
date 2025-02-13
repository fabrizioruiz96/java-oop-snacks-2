package Snacks2;

import java.util.Scanner;

public class ConvertitoreValute {
    
    private final static TassiDiCambio[] arrayTassi = {
        new TassiDiCambio("EUR", 1.0),
        new TassiDiCambio("USD", 1.08),
        new TassiDiCambio("GBP", 0.85),
        new TassiDiCambio("JPY", 160.5),
        new TassiDiCambio("CHF", 0.95)
    };
    
    private static double trovaTasso(String valutaUser) {
        for (int idx = 0; idx < arrayTassi.length; idx++) {
            if (arrayTassi[idx].getValuta().equalsIgnoreCase(valutaUser)) {
                return arrayTassi[idx].getTasso();
            }
        }
        return -1;
    }
    
    public static double converti(String da, String a, double importo) {
        double tassoDa = trovaTasso(da);
        double tassoA = trovaTasso(a);
        
        if (tassoDa == -1 || tassoA == -1) {
            throw new IllegalArgumentException("Valuta non supportata!");
        }
        return (importo / tassoDa) * tassoA;
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.err.println("Inverisci valuta di partenza: EUR, USD, GBP, JPY, CHF");
        String valutaPartenza = scan.next();
        System.out.println("Inserisci valuta di arrivo: EUR, USD, GBP, JPY, CHF");
        String valutaArrivo = scan.next();
        System.err.println("Inserisci importo da convertire");
        double importo = scan.nextDouble();

        double risultato = converti(valutaPartenza, valutaArrivo, importo);
        System.out.println(importo + " " + valutaPartenza + " corrispondono a " + risultato + " " + valutaArrivo);
    }
}