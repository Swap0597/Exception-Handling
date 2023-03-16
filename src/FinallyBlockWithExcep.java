public class FinallyBlockWithExcep {
    public static void main(String[] args) {
        try{
            int c = 100/0;
        }
        catch(Exception e){
            System.out.println(e + "\nException printed");
        }
        finally {
            System.out.println("Last line of code");
        }
    }
}
