package Snack1;

public class AppAuto {
    
    public static void main(String[] args) {
        
        Auto fiat = new Auto("Panda");
        System.out.println(fiat.toString());

        Auto audi = new Auto("RS3");
        System.out.println(audi.toString());
        
        Auto mercedes = new Auto("CLA45S");
        System.out.println(mercedes.toString());
        
        Auto bmw = new Auto("X6");
        System.out.println(bmw.toString());
        
        Auto toyota = new Auto("CH-R");
        System.out.println(toyota.toString());
        
        Auto hyunday = new Auto("i10");
        System.out.println(hyunday.toString());
    }
}
