package withexceptionhandling;

public class ThrowExample {
    public static void main(String[] args) {

        try{
            int a=20;
            if(a==10){
                System.out.println(" a is : "+a);
            }
            if(a==20){
                throw new RuntimeException("a is 20 and user is throwing exception");
            }
        } catch (Exception e){
            System.out.println("Exception occured : "+ e.getMessage()+"---"+ e.getClass());
        }
        // added dummy lines
    }
}
