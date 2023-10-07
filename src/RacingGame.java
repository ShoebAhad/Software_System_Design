// RacingGame class
public class RacingGame extends Game {
    private int lapsCompleted;

    public RacingGame() {
        this.lapsCompleted = 0; // Initialize laps completed
    }

    @Override
    public void play() {
        // Simulated logic for playing a racing game
        System.out.println("Playing Racing Game...");
        System.out.println("Laps completed: " + lapsCompleted);
        System.out.println("-----------------------------------------");

        // Additional game-specific logic can be implemented here
    }

    // Additional functions specific to RacingGame
    public void completeLap() {
        lapsCompleted++;
        System.out.println("Lap completed. Total laps: " + lapsCompleted);
        System.out.println("-----------------------------------------");

    }

    public void useNitroBoost() {
        System.out.println("Player used a nitro boost!");
        System.out.println("-----------------------------------------");

        // Additional logic for boosting speed can be implemented here
    }
}
