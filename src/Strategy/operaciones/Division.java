package Strategy.operaciones;

import Strategy.StrategyInterf.StrategyI;

public class Division implements StrategyI{

    @Override
    public double hagaOperacion(double num1, double num2) {
        
        return num2!=0 ? (num1 / num2) : 0;
    }
    
}
