/**
 * Created by Администратор on 16.09.2017.
 */
public class Calculator {
    private double result;

    public double Add(double ... param){
        for (double par: param) {
            result += par;
        }
    }
    public double Del(double ... param) throws {
        result = param[0];
        if (param.length < 2){
            throw new Exception("Введите второй параметр");
        }


    }
}
