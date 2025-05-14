package wrapperClass;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

public class MagicNumber {


//    Create a class MagicNumber
//Instance variable list of integers.
//    create a method generateNumbers. This method should accept integer for size and it needs
//    to generate given size random numbers and store in list of integers.


    ArrayList<Integer> numbers = new ArrayList<>();

    public void generateNumbers(int size){
        numbers.clear();
        Random random = new SecureRandom();
        for (int i = 0; i < size; i++){
            numbers.add(random.nextInt(1000));
        }
    }

    public void generateEvens(int size) {

        Random random = new SecureRandom();
        numbers.clear();
        while (true) {
            int i = random.nextInt(100);
            if (i % 2 == 0) {
                numbers.add(i);
            }

            if (numbers.size() == size) {
                break;
            }
        }
    }
}
