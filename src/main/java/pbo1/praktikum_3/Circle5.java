package pbo1.praktikum_3;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Circle5 {
    private final int RADIUS;
    private final String COLOR;
    private final int XPOSITION;
    private final int YPOSITION;
    
    private int radius;
    private String color;
    private int xPosition;
    private int yPosition;
    
    public Circle5(){
        RADIUS = 20;
        XPOSITION = 100;
        YPOSITION = 100;
        COLOR = "black";
        
        radius = RADIUS;
        xPosition = XPOSITION;
        yPosition = YPOSITION;
        color = COLOR;
    }
    public Circle5(int xPosition, int yPosition, int radius, String color){
        RADIUS = radius;
        XPOSITION = xPosition;
        YPOSITION = yPosition;
        COLOR = color;
        
        this.radius = RADIUS;
        this.xPosition = XPOSITION;
        this.yPosition = YPOSITION;
        this.color = COLOR;
    }
      public void setRadius( int rad ){
        radius = rad;
    }
    public double getRadius (){
        return radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    
    public void setXPosition(int xPosition){
        this.xPosition = xPosition;
    }
    
    public double getxPosisiton(){
       return xPosition;
    }
    
    public void setyPosition(int yPosition){
        this.yPosition = yPosition;
    }
    
    public double getyPosisiton(){
       return yPosition;
    }
    
    public void moveHorisontal(double distance){
        xPosition+=distance;
    }
    public void moveVertical(double distance){
        yPosition+=distance;
    }
    public double getCircumference(){
        double circumference = Math.PI*(2*radius);
        return circumference;
    }
    
    public double getArea(){
        double area = Math.PI*(radius*radius);
        return area;
    }
    
    public void draw(Graphics g){
        switch (color){
            case "white":
                g.setColor(Color.WHITE);
                break;
            case "black":
                g.setColor(Color.BLACK);
                break;
            case "red":
                g.setColor(Color.RED);
                break;                
            case "pink":
                g.setColor(Color.PINK);
                break;
            case "orange":
                g.setColor(Color.ORANGE);
                break;
            case "yellow":
                g.setColor(Color.YELLOW);
                break;
            case "green":
                g.setColor(Color.GREEN);
                break;
            case "blue":
                g.setColor(Color.BLUE);
                break;
            default :
                g.setColor(Color.BLACK);
        }
        g.fillArc(xPosition, yPosition,2*radius,2*radius,0,360);
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
