import java.io.FileInputStream;

public class CompileTimeException {
    public static void main(String[] args) {
//        FileInputStream fis = new FileInputStream("e:/String");
//        java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown
//        AT COMPILE TIME compiler time gives warning and ask to handle it
//        all the exception that can be checked by compiler is called compile time exception

        try{
            FileInputStream fis = new FileInputStream("d:/String");

        } catch (Exception e){
            System.out.println(e +"\n Exception printed");
        }
    }
}
