public class SimulationManager {

    public static void startSimulation() {
        System.out.println("Simulation Started!");

        Dog max = new Dog("Max");
        Cat luna = new Cat("Luna");
        Bird sky = new Bird("Sky");

        Pet.displaySimulationStats();

        max.eat();
        luna.eat();
        sky.eat();

        max.play();
        luna.play();
        sky.play();

        max.sleep();

        String[] conditions = {"Sunny", "Rainy", "Cloudy", "Windy"};
        String newCondition = conditions[(int)(Math.random() * conditions.length)];
        Pet.updateEnvironment(newCondition);

        Pet.displaySimulationStats();
    }
}
