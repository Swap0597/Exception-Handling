public class TryCatch2 {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;
        int c = 0;

        try{
            c = a/b;
        }
        catch (ArithmeticException e){
            System.out.println("You cannot divide by 0");
        }
        System.out.println("last line of code");
    }
}
