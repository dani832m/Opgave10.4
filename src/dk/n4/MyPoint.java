package dk.n4;

public class MyPoint { //Public klasse ved navn "MyPoint"

	private double x, y; //Deklarerer variablerne "x" og "y"

	//Getters
	public double getXCoordinate() { //Metode der returnerer en double
		return x; //Returnerer "x"
	}

        public double getYCoordinate() { //Metode der returnerer en double
		return y; //Returnerer "y"
	}

        //Setters
	public void setXCoordinate(double x) { //Angiv x-koordinaten, returnerer ikke noget
		this.x = x; //Parametret "x" er lig instansvariablen "x"
	}

	public void setYCoordinate(double y) { //Angiv y-koordinaten, returnerer ikke noget
		this.y = y; //Parametret "y" er lig instansvariablen "y"
	}

	//Methods (De fleste af metoderne herunder måtte jeg finde hjælp til på nettet)
	public double distance(double x, double y) { //Metode tager to argumenter ind. Returnerer double
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y)); //Returnerer x * x + y * y
	}

	public double distance(MyPoint point) { //Metode tager argument ind fra "MyPoint" med navnet "point"
		return distance(point.x, point.y); //Returnerer "distance"
	}

        public MyPoint getCenterPoint(MyPoint p) { //Metode der tager argument ind fra "MyPoint" med navnet "p"
            return new MyPoint((p.x + this.x) / 2, (p.y + this.y) / 2);
        }

        public static MyPoint getCenterPoint(double x1, double y1, double x2, double y2) {
            return new MyPoint((x1 + x2) / 2, (y1 + y2) / 2);
        }

        /** Return true if this point is on the left side of the directed line from p0 to p1 */
        public boolean leftOfTheLine(MyPoint p0, MyPoint p1) {
            return leftOfTheLine(p0.x, p0.y, p1.x, p1.y, x, y);
        }

        /** Return true if this point is on the same line from p0 to p1 */
        public boolean onTheSameLine(MyPoint p0, MyPoint p1) {
            return onTheSameLine(p0.x, p0.y, p1.x, p1.y, x, y);
        }

        /** Return true if this point is on the right side of the directed line from p0 to p1 */
        public boolean rightOfTheLine(MyPoint p0, MyPoint p1) {
            return rightOfTheLine(p0.x, p0.y, p1.x, p1.y, x, y);
        }

        /** Return true if this point is on the line segment from p0 to p1 */
        public boolean onTheLineSegment(MyPoint p0, MyPoint p1) {
            return onTheLineSegment(p0.x, p0.y, p1.x, p1.y, x, y);
        }

        /** Return true if point (x2, y2) is on the left side of the directed line from (x0, y0) to (x1, y1) */
        public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2){
            return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0;
        }

        /** Return true if point (x2, y2) is on the same line from (x0, y0) to (x1, y1) */
        public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
            return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0;
        }

        /** Return true if point (x2, y2) is on the line segment from (x0, y0) to (x1, y1) */
        public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
            double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
            return position <= 0.0000000001 && ((x0 <= x2 && x2 <= x1) || (x0 >= x2 && x2 >= x1));
        }

        /** Return true if point (x2, y2) is on the right side of the directed line from (x0, y0) to (x1, y1) */
        public static boolean rightOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2){
            return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) < 0;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }

        // Constructors
        MyPoint() { //Default constructor der sætter koordinatsættet til (0.0, 0.0)
            this(0,0);
        }

        MyPoint(double x, double y) { //Constructor der tager to argumenter ind, en x- og en y-koordinat
	        this.x = x;
	        this.y = y;
        }

}
