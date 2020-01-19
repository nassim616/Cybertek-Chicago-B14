package enumEx;

public class DayMethods {
    public static void main(String[] args) {

    }
    public static void checkDay(WeekDays day){
        switch (day){
            case Monday:
                System.out.println("Monday are bad");
                break;
            case Friday:
                System.out.println("Fridays are better");
                break;
            case Sunday:
            case Staturday:
                System.out.println("Weekends are the best");
                break;
            default:
                System.out.println(" regular day ");
        }
    }
}
