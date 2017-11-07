package dk.n4;

public class TestMyPoint { //Public klasse ved navn "TestMyPoint"

    public static void main(String[] args) { //Main-metoden eksekveres

        //Objekter deklareres og initialiseres
        MyPoint point1 = new MyPoint(); //Opretter nyt objekt (punkt) ud fra klassen "MyPoint" uden argumenter
        MyPoint point2 = new MyPoint(2.5,3.1); //Opretter nyt objekt (punkt) ud fra klassen "MyPoint" med argumenter

        System.out.println("(" + point1.getXCoordinate() + ", " + point1.getYCoordinate() + ")"); //Printer koordinatsættet fra "point1"
        System.out.println("(" + point2.getXCoordinate() + ", " + point2.getYCoordinate() + ")"); //Printer koordinatsættet fra "point2"

        System.out.println("\nDistancen mellem de to punkter: " + point1.distance(point2)); //Printer distancen mellem "point1" og "point2"
        System.out.println("Distancen mellem de to punkter: " + point1.distance(2, 0)); //Printer distancen mellem "point1" og indtastning

    }

}
