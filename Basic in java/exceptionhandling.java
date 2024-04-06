public class exceptionhandling {
    public static void main(String[] args) {
        //try-catch in exception handling
        int[]marks={12,13,14};
        

        try{
            System.out.println(marks[5]);

        }
        catch(Exception exception){
            //do something after catching
        }
        System.out.println("the name is prabesh");
    }
}
