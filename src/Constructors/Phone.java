package Constructors;

public class Phone {

//
//    Create a class Phone.
//    Instance variables: touchscreen, model, memory, color, phoneNumber.
//    Create a constructor that accepts two parameters(model, color) and set to corresponding
//    instance variables. Overload the constructor that accepts 4 parameters(
//            model, color, memory, touchscreen). Set values and check memory.
//    If given memory is negative value then print “invalid memory” and don’t set memory value.
//    Otherwise set the memory value.

    boolean touchscreen;
    String model;
    int memory;
    String color;
    long phoneNumber;

    public Phone(String model, String color) {
        this.color = color;
        this.model = model;

    }

    public Phone(String model, String color, int memory, boolean touchscreen) {
        this.model = model;
        this.color = color;
        this.touchscreen = touchscreen;
        if (memory < 0) {
            System.err.println("invald memory");
        } else {
            this.memory = memory;

        }
    }

    public void info() {
        System.out.println("\nPhone number: " + this.phoneNumber);
        System.out.println("Model: " + model);
        System.out.println("Memory: " + this.memory);
        System.out.println("Color: " + this.color);
        System.out.println("TouchScreen: " + this.touchscreen);
    }


    public boolean textNumber(long number, String text) {

//     Create a method text that accepts long(phone number) and String(text) and returns boolean.
//     Check given number length and text body.
//     Print: “%textBody sent to %givenPhoneNumber” if length is 10 and text body is not empty then return true; Print:
//     “Invalid phone number or text body” and return false if otherwise.
//             Create a method call that accepts long (phone number). Print “Calling to %phoneNumber”
//     if phone number length is 10. Print “Invalid phone number” if otherwise.


        String pstring = number + ""; // convert to string

        if (pstring.length() == 10 && !text.isEmpty()) {
            System.out.println(text + " sent to " + number);
            return true;
        } else {
            System.out.println(" Invalid phone number ");
            return false;
        }

    }
        public void call ( long phoneNumber){
            String pString = phoneNumber + "";
            if (pString.length() == 10) {
                System.out.println("Calling to " + phoneNumber);
            } else {
                System.out.println("Invalid Phone number.");
            }
        }
    }
