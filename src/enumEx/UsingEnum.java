package enumEx;

public class UsingEnum {
    public static void main(String[] args) {
        base.LetterGrade  grade;
        grade = base.LetterGrade.A;
        switch (grade){
            case A:
                System.out.println("you got an A");
                break ;
            case B:
                System.out.println("not bad");
                break ;
            case C:
                System.out.println("not so good");
                break ;
            case F:
                System.out.println("you failed");


        }
    }
}
