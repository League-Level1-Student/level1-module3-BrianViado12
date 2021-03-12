package _01_intro_to_static;

public class Athlete {
	static int nextBibNumber = 0;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
        nextBibNumber++;
        bibNumber = nextBibNumber;
    }

    public static void main(String[] args) {
        Athlete athlete1 = new Athlete("Josh", 5);
    	Athlete athlete2 = new Athlete("John", 7);
    	System.out.println(raceLocation);
    	System.out.println(raceStartTime);
    	System.out.println(athlete1.name);
    	System.out.println(athlete2.name);
    	System.out.println(athlete1.bibNumber);
    	System.out.println(athlete2.bibNumber);
    	System.out.println(athlete1.nextBibNumber);
    	System.out.println(athlete2.nextBibNumber);
    	System.out.println(Athlete.nextBibNumber);
    	
    	//create two athletes
        //print their names, bibNumbers, and the location of their race. 
    }
}
