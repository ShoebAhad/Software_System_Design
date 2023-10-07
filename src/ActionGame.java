
public class ActionGame extends Game {
    private int playerHealth;

    public ActionGame() {
        this.playerHealth = 100; // Initialize player health
    }

    @Override
    public void play() {
        // Simulated logic for playing an action game

        System.out.println("Playing Action Game...");
        System.out.println("Current player health: " + playerHealth);

        // Additional game-specific logic can be implemented here
    }


    public void takeDamage(int damageAmount) {
        playerHealth -= damageAmount;
        if (playerHealth <= 0) {
            System.out.println("Player defeated!");
        }
    }

    public void collectPowerUp() {
        playerHealth += 20;
        System.out.println("Player collected a power-up. Current health: " + playerHealth);
    }
}