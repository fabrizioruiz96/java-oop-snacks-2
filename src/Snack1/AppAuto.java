package Snack1;

public class AppAuto {
    
    public static void main(String[] args) {
        
        Auto fiat = new Auto("Panda");
        System.out.println(fiat.toString());
        Auto.getNumeroTotaleAuto();
        
        Auto audi = new Auto("RS3");
        System.out.println(audi.toString());
        Auto.getNumeroTotaleAuto();
        
        Auto mercedes = new Auto("CLA45S");
        System.out.println(mercedes.toString());
        Auto.getNumeroTotaleAuto();
        
        Auto bmw = new Auto("X6");
        System.out.println(bmw.toString());
        Auto.getNumeroTotaleAuto();
        
        Auto toyota = new Auto("CH-R");
        System.out.println(toyota.toString());
        Auto.getNumeroTotaleAuto();
        
        Auto hyunday = new Auto("i10");
        System.out.println(hyunday.toString());
        Auto.getNumeroTotaleAuto();
    }
}
