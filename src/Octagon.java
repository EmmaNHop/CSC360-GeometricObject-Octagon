//Emma Hopkins : this program creates an Octagon, calculates the perimeter and area, and creates a clone
public class Octagon extends GeometricObject{

    double area;
    double perimeter;
    double side;
    String name;
    boolean clone;

    Octagon(){

    }

    Octagon(double side, String name, Boolean clone){
        this.side = side;
        this.name = name;
        this.clone = clone;
    }
    public String getName(){
        return name;
    }

    public double getSide(){
        return side;
    }

    @Override
    public double getArea() {
        area = (2 + 4 / Math.sqrt(2)) * side * side;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = side * 8;
        return perimeter;
    }

    public Octagon createClone(){
        Octagon Oct2 = new Octagon(this.side, "Oct2", true);
        return Oct2;
    }

    public boolean isClone(){
        return clone;
    }

    public int compareTo(Octagon A){
        if(this.getSide() == A.getSide()){
            return 0;
        }
        else{
            return 1;
        }
    }

    @Override
    public String toString() {
        return name + ": Octagon with side = " + side + ", perimeter = " + this.getPerimeter() + ", area = " + this.getArea() + ", isClone = " + clone;
    }
}
