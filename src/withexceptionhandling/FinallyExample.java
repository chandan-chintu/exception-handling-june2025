package withexceptionhandling;

public class FinallyExample {
    public static void main(String[] args) {
        int a=10;
        int b=10; int res=0;
        try {
            System.out.println("inside try block before exception occurs");
            res = a / b;
            System.out.println("inside try block after exception occurs");
        } catch (Exception e) {
            System.out.println("Exception occurred : "+e.getMessage()+"---"+e.getClass());
        }
        //added dummy lines
        finally {
            System.out.println("a is : "+a);
            System.out.println("b is : "+b);
            System.out.println("res is : "+res);
            System.out.println("Finally always executes");
        }
    }
}
