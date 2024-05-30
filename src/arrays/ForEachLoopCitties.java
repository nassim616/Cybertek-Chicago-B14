package arrays;

public class ForEachLoopCitties {
    public static void main(String[] args) {

//        1) Write a program and create String array called cities. Initialize the cities with cities below:
//        Chicago, New York, Madison, Miami, Washington
//        Iterate through each city and check if Chicago is inside the cities.
//                Print "Windy city found" if Chicago exists in the array. "Windy city not found" otherwise.



        String[] cities = {"Chicsgo" , "New York" , "Maddison", "Miami", "Wachington"};


        boolean check = false;
        int count = 0;
        for(String city: cities) {
            if("Chicago".equalsIgnoreCase(city)) {
                check = true;
                count++;
            }
        }
        if(check) {
            System.out.println("Windy city found " + count + " times");
        } else {
            System.out.println("Windy city not found");
        }
    }
    }






