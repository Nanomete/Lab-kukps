package Lib;

public class Chess extends Toy implements MyRectangle {
    private double hight;
    private double width;
    public Chess(){
        super("bord game",7); // send value to super class
        setHight(100);// send value to setHight
        setWidth(80); // send value to setWidth
    }
    
    public double calculateArea() { // from MyShape
        return hight * width;
    }
    
    public double calculateCircumference() { // from MyShape
       return  2 * (hight + width);
    }
    
    public double getHight() { // from MyRectangle
        return this.hight;
    }
   
    public double getWidth() {  // from MyRectangle
        return this.width;
    }
    
    public void setHight(double hight) { // from MyRectangle
        this.hight = hight;
    }
    
    public void setWidth(double width) { // from MyRectangle
        this.width = width;
    }
   
    public void play() { // from Toy
        System.out.println("Game Start!!!");
    }
    
    
 }
    

