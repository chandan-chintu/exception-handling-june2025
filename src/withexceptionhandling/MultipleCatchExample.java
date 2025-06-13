package withexceptionhandling;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try{
            int a =10, b=10, res=0;
            res=a/b;
            System.out.println("res is : "+res);

            String msg1 = "Hi hello";
            String msg2 = null;
            System.out.println("length of msg1 : "+msg1.length());
            System.out.println("length of msg2 : "+msg2.length());
        } catch (ArithmeticException e1){
            System.out.println("Exception occured : "+ e1.getMessage()+"---"+ e1.getClass());
        } catch (NullPointerException e2){
            System.out.println("Exception occured : "+ e2.getMessage()+"---"+ e2.getClass());
        }
    }
}
