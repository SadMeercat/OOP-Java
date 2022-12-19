package Controller;

import Model.Variables;

public class Calculator {

    private Variables myVar;

    private void setVar(String exp){
        this.myVar = ParseString.parseExp(exp);
        
    }

   public String takeResult(String exp){
    setVar(exp);
    Operations oper = new Operations();
    switch (myVar.getOper()) {
        case 0://sum
            return "Результат: " + Double.toString(oper.sum(myVar.getX(),myVar.getY()));
        case 1://sub
            return "Результат: " + Double.toString(oper.sub(myVar.getX(),myVar.getY()));
        case 2://mult
            return "Результат: " + Double.toString(oper.sum(myVar.getX(),myVar.getY()));
        case 3://div
            return "Результат: " + Double.toString(oper.sum(myVar.getX(),myVar.getY()));
        case 4://pow
            return "Результат: " + Double.toString(oper.sum(myVar.getX(),myVar.getY()));
        case 5://sqrt
            return "Результат: " + Double.toString(oper.sum(myVar.getX(),myVar.getY()));
        default:
            return "Что-то пошло не так";
    }
   }
    
}
