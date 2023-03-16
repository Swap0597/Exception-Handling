public class FinallyBlockWhenNoException {
    public static void main(String[] args) {

        try{
            int c = 100/2;
        }catch (Exception e){
            System.out.println(e+"\n Exception printed");
        }
        finally {
            System.out.println("At last line of code");
        }
    }
}
