public class Main {
    public static void main(String[] args) {
        // Initialize with Strategy A
        Context context = new Context(new ConcreteStrategyA());
        context.executeStrategy();

        // Dynamically switch to Strategy B
        context.setStrategy(new ConcreteStrategyB());
        context.executeStrategy();
    }
}