package userdefinedcustomeexception;

public class DemoClass {
    public static void main(String[] args) {
        try{
            String user = null;
            if(user==null){
                throw new UserNotFoundException("User not found!!!");
            }
            //some lines added
        } catch (UserNotFoundException e){
            System.out.println("Exception occurred : "+e.getMessage()+"---"+e.getClass());
        }

    }
}
