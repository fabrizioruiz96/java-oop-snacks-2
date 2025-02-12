package Snack1;

public class Auto {
    
    private static int numeroTelaio;

    private static int contatoreAuto;

    private final String modello;

    public Auto(String modello){
        numeroTelaio += 2;
        this.modello = modello; 
        contatoreAuto++;
    }

    private void setNumeroTelaio(){
        
    }
    
    public int getNumeroTelaio(){
        return numeroTelaio;
    }

    public String getModello(){
        return modello;
    }

    public static int getNumeroTotaleAuto(){
        return contatoreAuto;
    }

    @Override
    public String toString() {
        return "Auto creata n. " + getNumeroTotaleAuto() + ", modello: " + getModello() + ", numero telaio: " + getNumeroTelaio();
    }
}
