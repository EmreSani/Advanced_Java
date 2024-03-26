package generics.classes;

public class RunnerNonGeneric {
    public static void main(String[] args) {

        //2 farklı nesne:book, laptop

        NonGenericProduct book=new NonGenericProduct();
        book.setCode("advjava");//code fieldını String data tipi ile set ettik

        NonGenericProduct laptop=new NonGenericProduct();
        laptop.setCode(123456);//code fieldını Integer data tipi ile set ettik
       // laptop.setCode("laptop");


        //1-CAST problemi!!!
        String str= (String) book.getCode();
        //2-ClassCastException Problemi !!!
        String str2= (String) laptop.getCode();

        System.out.println(str);
        System.out.println(str2);

    }
}
