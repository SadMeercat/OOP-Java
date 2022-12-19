package Controller;

import Model.Variables;

public class ParseString {
    private static boolean tryDouble(String number){
        try{
            Double.parseDouble(number);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }

    public static Variables parseExp(String expression){
        Variables myVar = new Variables();
        String[] myExp = expression.split(" ");
        if(myExp.length == 3){
            if(tryDouble(myExp[0]) && tryDouble(myExp[2])){
                myVar.setX(Double.parseDouble(myExp[0]));
                myVar.setY(Double.parseDouble(myExp[2]));
            }
        }
        else if(myExp.length == 2){
            if(tryDouble(myExp[1])){
                myVar.setX(Double.parseDouble(myExp[1]));
            }
        }
        myVar.setOper(checkOperation(expression));
        return myVar;
    }

    private static int checkOperation(String expression){
        int result;
        if(expression.indexOf("+") != -1){
            result = 0;
        }
        else if(expression.indexOf("-") != -1){
            result = 1;
        }
        else if(expression.indexOf("*") != -1){
            result = 2;
        }
        else if(expression.indexOf("/") != -1){
            result = 3;
        }
        else if(expression.indexOf("**") != -1){
            result = 4;
        }
        else if(expression.indexOf("sqrt") != -1){
            result = 5;
        }
        else{
            result = -1;
        }
        return result;
    }
}
