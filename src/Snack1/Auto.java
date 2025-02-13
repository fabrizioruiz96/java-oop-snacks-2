package Snack1;

public class Auto {
    
    private final int numeroTelaio;

    private final String modello;
    
    private static int contatoreAuto;

    public Auto(String modello){
        this.numeroTelaio = contatoreAuto * 2;
        this.modello = modello;
        contatoreAuto++; 
    }

    public int getNumeroTelaio(){
        return numeroTelaio;
    }

    public String getModello(){
        return modello;
    }

    public static int getNumeroTotaleAuto(){
        System.out.println("Il garage ha un totale di " + contatoreAuto + " auto");
        return contatoreAuto;
    }

    @Override
    public String toString() {
        return "Nuova auto creata - modello: " + getModello() + ", numero telaio: " + getNumeroTelaio();
    }
}
