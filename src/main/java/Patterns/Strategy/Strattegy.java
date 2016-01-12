package Patterns.Strategy;

interface Strategy{
    int doOperation(int numA, int numB);
}

class OperAdd implements Strategy{
    public int doOperation(int numA, int numB){
        return numA+numB;
    }
}
class OperSubstract implements Strategy{
    public int doOperation(int numA, int numB){
        return numA-numB;
    }
}
class OperMultiply implements Strategy{
    public int doOperation(int numA, int numB){
        return numA*numB;
    }
}
class Context{
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy=strategy;
    }
    public int executeStrategy(int numA, int numB){
        return strategy.doOperation(numA,numB);
    }
}
public class Strattegy {
    public static void main(String[] args) {
        Context context = new Context(new OperAdd());
        System.out.println("10+5="+context.executeStrategy(10,5));

        context = new Context(new OperSubstract());
        System.out.println("10-5="+context.executeStrategy(10,5));

        context = new Context(new OperMultiply());
        System.out.println("10*5="+context.executeStrategy(10,5));

    }
}

