import java.io.FileInputStream;

public class TryCatch {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("d:/String");
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("file not found");
        }
        System.out.println("programme ran successfully");
    }
}
