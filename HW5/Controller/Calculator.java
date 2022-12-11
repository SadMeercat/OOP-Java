package Controller;

import Model.Operations;
import Model.Variables;

public class Calculator implements Operations, Variables {

    private double x, y;

    public Calculator(){}

    public Calculator(double x, double y){
        this.x = x;
        this.y = y;
    }

    private boolean TryDouble(String number){
        try{
            Double.parseDouble(number);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }

    @Override
    public String Result(String expression) {
        String[] myExp = expression.split(" ");
        if(myExp.length == 3){
            if(TryDouble(myExp[0]) && TryDouble(myExp[2])){
                setX(Double.parseDouble(myExp[0]));
                setY(Double.parseDouble(myExp[2]));
            }
        }
        else if(myExp.length == 2){
            if(TryDouble(myExp[1])){
                setX(Double.parseDouble(myExp[1]));
            }
        }
        else{
            return "Неправильный ввод";
        }

        String result = "Что-то не так";
        if(expression.indexOf("+") != -1){
            result = Double.toString(Sum(this.x, this.y));
        }
        else if(expression.indexOf("-") != -1){
            result = Double.toString(Sub(this.x, this.y));
        }
        else if(expression.indexOf("*") != -1){
            result = Double.toString(Mult(this.x, this.y));
        }
        else if(expression.indexOf("/") != -1){
            result = Double.toString(Div(this.x, this.y));
        }
        else if(expression.indexOf("**") != -1){
            result = Double.toString(Pow(this.x, this.y));
        }
        else if(expression.indexOf("sqrt") != -1){
            result = Double.toString(Sqrt(this.x));
        }
        return result;
    }

    @Override
    public void setX(double x) {
        this.x = x;
        
    }

    @Override
    public void setY(double y) {
        this.y = y;
        
    }

    @Override
    public double Sum(double x, double y) {
        return x + y;
    }

    @Override
    public double Sub(double x, double y) {
        return x - y;
    }

    @Override
    public double Mult(double x, double y) {
        return x * y;
    }

    @Override
    public double Div(double x, double y) {
        return x / y;
    }

    @Override
    public double Pow(double x, double y) {
        return Math.pow(x, y);
    }

    @Override
    public double Sqrt(double x) {
        return Math.sqrt(x);
    }
    
}
