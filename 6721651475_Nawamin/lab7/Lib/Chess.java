package Lib;

public class Chess extends Toy implements MyRectangle {
    private double height;
    private double width;
    public Chess(){
        // super คือการเรียกใช้ constructor ของ class แม่
        super("bord game",7); // send value to super class
        setHeight(100);// send value to setHight
        setWidth(80); // send value to setWidth
    }
    
    public double calculateArea() { // from MyShape
        return height * width;
    }
    
    public double calculateCircumference() { // from MyShape
       return  2 * (height + width);
    }
    
    public double getHeight() { // from MyRectangle
        return this.height;
    }
   
    public double getWidth() {  // from MyRectangle
        return this.width;
    }
    
    public void setHeight(double height) { // from MyRectangle
        this.height = height;
    }
    
    public void setWidth(double width) { // from MyRectangle
        this.width = width;
    }
   
    public void play() { // from Toy
        System.out.println("Game Start!!!");
    }
 }
    

