package generics.classes;

public class RunnerNonGeneric {
    public static void main(String[] args) {

        //2 farklı nesne:book, laptop

        NonGenericProduct book=new NonGenericProduct();
        book.setCode("advjava");//code fieldını String data tipi ile set ettik

        NonGenericProduct laptop=new NonGenericProduct();
        laptop.setCode(123456);//code fieldını Integer data tipi ile set ettik


        //--------------------------







    }
}