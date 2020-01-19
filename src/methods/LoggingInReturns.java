package methods;

public class LoggingInReturns {
    public static void main(String[] args) {



//    Create a method for logging in. User passes the username and password as parameters.
//    If the passed values are the same as the given username and password return true,
//    but if either the username or password is invalid return false
//    Username: james123
//    Password: password


        if(loggingIn("james123","password")) {
            System.out.println("logged in");
        } else {
            System.out.println("invalid credentials");
        }
    }


    public static boolean loggingIn(String username, String password) {

        String validusername = "james123";
        String validpassword = "password";

        if (validpassword.equals(username) && validpassword.equals(password)) {
            return true;

        }
        return false;
    }
}