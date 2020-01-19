package arrays;

import java.util.Arrays;

public class enhanccedLoopEx {
    public static void main(String[] args) {
        String [] students = {"anna", "maria", "olga"};
//        for(String name : students){
//            System.out.println(name);
//        }
//        for (String name : students){
//            if(name.contains(a)){
//                System.out.println(name);
//            }
//        }
//        // reversed  each element and store them in anther array in the same order
        String[] newArray = new String[students.length];
        String temp = "";
        for(int i =0 ; i<students.length;i++){
            temp= "";
            for(int j = students[i].length()-1 ; j>=0;j--){

                temp+= students[i].charAt(j);

            }
            newArray[i]= temp;
        }
        System.out.println(Arrays.toString(students));
    }
}
