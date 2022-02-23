package pbo1.praktikum_3;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Circle2 {
    private final int RADIUS;
    private final String COLOR;
    private final int XPOSITION;
    private final int YPOSITION;
    
    private int radius;
    private String color;
    private int xPosition;
    private int yPosition;
    
    public Circle2(){
        RADIUS = 20;
        XPOSITION = 100;
        YPOSITION = 100;
        COLOR = "black";
        
        radius = RADIUS;
        xPosition = XPOSITION;
        yPosition = YPOSITION;
        color = COLOR;
    }
    public void setRadius( int rad ){
        radius = rad;
    }
    public double getRadius (){
        return radius;
    }
    public void setColor(String new_color){
        color = new_color;
    }
    public String getColor(){
        return color;
    }
    public void setXPosition(int x_Position){
        xPosition = x_Position;
    }
    public double getxPosisiton(){
       return xPosition;
    }
    public void setyPosition(int y_Position){
        yPosition = y_Position;
    }
    public int getyPosisiton(){
       return yPosition;
    }
    public double getCircumference(){
        double circumference = Math.PI*(2*radius);
        return circumference;
    }
    public double getArea(){
        double area = Math.PI*(radius*radius);
        return area;
    }
    
    public String toString(){
        System.out.println("-------------------------------------------");
        System.out.println("Atribut");
        return "Radius\t\t: " + radius 
                +"\nColor\t\t: " + color 
                +"\nx position\t\t: " + xPosition
                +"\ny position\t\t: " + yPosition;
    }
}
