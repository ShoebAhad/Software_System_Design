public class StrategyGame extends Game {
    private int resources;

    public StrategyGame() {
        this.resources = 100; // Initialize resources
    }

    @Override
    public void play() {
        // Simulated logic for playing a strategy-based game
        System.out.println("Playing Strategy Game...");
        System.out.println("Available resources: " + resources);
        System.out.println("-----------------------------------------");

        // Additional game-specific logic can be implemented here
    }

    // Additional functions specific to StrategyGame
    public void gatherResources() {
        resources += 20;
        System.out.println("Resources gathered. Total resources: " + resources);
        System.out.println("-----------------------------------------");

    }

    public void buildStructure() {
        if (resources >= 50) {
            resources -= 50;
            System.out.println("Structure built. Remaining resources: " + resources);
            System.out.println("-----------------------------------------");

        } else {
            System.out.println("Not enough resources to build a structure.");
            System.out.println("-----------------------------------------");

        }
    }
}
