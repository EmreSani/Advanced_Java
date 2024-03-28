package enumtype;

public class Runner {
    public static void main(String[] args) {

        printPasswordStrengthConstant("LOW");
        printPasswordStrengthConstant("MEDIUM");
        printPasswordStrengthConstant("GOOD");
        printPasswordStrengthConstant("PERFECT");//CTE, RTE yok, fakat istenen işlev gerçekleşmiyor!!!!!

        //ÇÖZÜM:sabit ve sınırlı sayıda değişkeni sadece parametre olarak
        //vermek:Enum Type


    }

    //password gücü:LOW,MEDIUM,HIGH
    public static void printPasswordStrengthConstant(String strength){
        if (strength.equals(PasswordStrengthConstant.LOW)){
            System.out.println("Password gücünüz düşüktür.");
        } else if (strength.equals(PasswordStrengthConstant.MEDIUM)) {
            System.out.println("Password gücünüz orta seviyededir.");

        } else if (strength.equals(PasswordStrengthConstant.HIGH)) {
            System.out.println("Tebrikler, password gücünüz yüksek ");
        }
    }


}
