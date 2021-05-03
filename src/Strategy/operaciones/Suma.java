package Strategy.operaciones;

import Strategy.StrategyInterf.StrategyI;

public class Suma implements StrategyI {

    @Override
    public double hagaOperacion(double num1, double num2) {
        return num1 + num2;
    }
    
}
