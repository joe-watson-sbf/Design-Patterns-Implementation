package Strategy.demoApp;

import Strategy.context.Context;
import Strategy.operaciones.Division;
import Strategy.operaciones.Multiplicacion;
import Strategy.operaciones.Resta;
import Strategy.operaciones.Suma;

public class Demo {
    
    public static void main(String[] args) {

        Context context;

        // Adición 
        context = new Context(new Suma());
        System.out.println("45 + 7 = " + context.executeStrategy(45, 7));

        // Resta
        context = new Context(new Resta());
        System.out.println("45 - 7 = " + context.executeStrategy(45, 7));

        // Multi
        context = new Context(new Multiplicacion());
        System.out.println("45 * 7 = " + context.executeStrategy(45, 7));

        // Division
        context = new Context(new Division());
        System.out.println("45 / 7 = " + context.executeStrategy(45, 7));
    }
}
