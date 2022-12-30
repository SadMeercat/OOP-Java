package Model;

public class Variables {
    private double x, y;
    private int operation;

    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }    

    public void setOper(int operation){
        this.operation = operation;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public int getOper(){
        return this.operation;
    }
}
