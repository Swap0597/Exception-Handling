public class DiffMethodToPrintException {

    public static void main(String[] args) {

        int a = 100, b = 0, c = 0;
        try{
            c = a / b;
        }
        catch(ArithmeticException e){
//            e.printStackTrace();
//            java.lang.ArithmeticException: / by zero
//	          at DiffMethodToPrintException.main(DiffMethodToPrintException.java:7)

//            System.out.println(e);
//            java.lang.ArithmeticException: / by zero

//            System.out.print
        }
        System.out.println("last line of code");
    }
}
