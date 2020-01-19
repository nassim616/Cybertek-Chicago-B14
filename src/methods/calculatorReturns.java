package methods;

public class calculatorReturns {
    public static void main(String[] args) {

//        Create a calculator method that will take three arguments: an operator ( +, -, *, \, %)  and two numbers.
//                Perform that operation between the two numbers and return the result

//        System.out.println(calculator("%", 3, 2));
//    }
//
//    public static double calculator(String op, double one, double two) {
//        switch (op) {
//            case "+":
//                return one + two;
//            case "-":
//                return one - two;
//            case "*":
//                return one * two;
//            case "/":
//                return one % two;
//            default:
//                System.out.println("invalid");
//                return 0;
//
//        }
//
//    }
//
//}

        System.out.println(calculator('*', 2, 5.5));
    }
    public static double calculator(char operator, double num1, double num2) {
        double result = 0;
        if (operator == '+') {
            result= num1 + num2;
        }else if (operator == '-') {
            result = num1 - num2;
        }else if (operator == '*') {
            result = num1 * num2;
        }else if (operator == '/') {
            result = num1 / num2;
        }else if (operator == '%') {
            result = num1 % num2;
        }else{
            System.out.println("Invalid operator");
        }
        return result;
    }
}
