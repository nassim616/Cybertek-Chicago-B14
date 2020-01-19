package inhertance;

public class School {
    String name;
    String address;
    String type;

    public void giveHw() {
        System.out.println(this.name + " is giving home work ");
    }


    public void hosteEvent(String date) {

        System.out.println("hosting an event on " + date);

    }
}