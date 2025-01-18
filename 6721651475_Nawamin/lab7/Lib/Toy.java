package Lib;

public abstract class Toy {
    private String category;
    private int minAge;
    public Toy(String category,int minAge){
        setCategory(category); // ส่งค่า category ไปที่ setCategory
        setMinAge(minAge); // ส่งค่า minAge ไปที่ setMinAge
    }

    public int getMinAge(){
        return this.minAge; 
    }
    public String getCategory(){
        return this.category;
    }
    public void setMinAge(int minAge){
         this.minAge=minAge;
    } 
    public void setCategory(String category){
        this.category=category;
    }
    public abstract void play(); // ไม่มี body ใน method play
}
