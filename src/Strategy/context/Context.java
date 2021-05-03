package Strategy.context;

import Strategy.StrategyInterf.StrategyI;

public class Context {

    private StrategyI strategyI;

    public Context(StrategyI strategyI) {
        this.strategyI = strategyI;
    }

    public double executeStrategy(double num1, double num2) {
        return strategyI.hagaOperacion(num1, num2);
    }
    
}
