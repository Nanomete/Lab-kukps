package Lib;

public class Chesss extends Toy implements MyRectangle {
    private double hight;
    private double width;
    public Chesss(){
        super("bord game",7);
        setHight(100);
        setWidth(80);
    }
    
    public double calculateArea() {
        return hight*width;
    }
    
    public double calculateCircumference() {
       return  hight*2+width*2;
    }
    
    public double getHight() {
        return this.hight;
    }
   
    public double getWidth() {
        return this.width;
    }
    
    public void setHight(double hight) {
        this.hight =hight;
    }
    
    public void setWidth(double width) {
        this.width=width;
    }
   
    public void play() {
        System.out.println("game start!!!");
    }
    
    
 }
    

