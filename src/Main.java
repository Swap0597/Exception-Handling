public class Main {
    public static void main(String[] args) {

        System.out.println(10);
        System.out.println(11);
        System.out.println(12);
        System.out.println(13);
        //here we have ArithmeticException
        System.out.println(10/0);

        // to resolve it
        try{
            System.out.println(10/0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(15);
        System.out.println(16);
        System.out.println(17);
        System.out.println(18);

    }
}