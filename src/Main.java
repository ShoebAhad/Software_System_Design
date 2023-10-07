// Main class (unchanged)
public class Main {
    public static void main(String[] args) {
        // Create instances of the necessary classes
        Scoring scoring = new Scoring();
        UXDesign uxDesign = new UXDesign();
        CloudAccount cloudAccount = new CloudAccount("Shoeb"); // Pass the player's name

        // Simulate a gaming scenario
        System.out.println("------------------------------------------------------");

        System.out.println("Welcome to Our Game!");
        System.out.println("------------------------------------------------------");


        // User interactions using UXDesign
        uxDesign.login();
        uxDesign.showScoreInterface();

        // Game selection
        Game actionGame = new ActionGame();
        System.out.println("------------------------------------------------------");


        Game racingGame = new RacingGame();
        System.out.println("------------------------------------------------------");

        Game strategyGame = new StrategyGame();
        System.out.println("------------------------------------------------------");


        // Simulate playing different game types
        actionGame.play();
        System.out.println("------------------------------------------------------");

        int actionGameScore = scoring.calculateSinglePlayerScore();
        System.out.println("Action Game Score: " + actionGameScore);
        System.out.println("------------------------------------------------------");



        if (actionGame instanceof ActionGame) {
            ActionGame actionGameInstance = (ActionGame) actionGame;
            actionGameInstance.takeDamage(30); // Simulate player taking damage
            actionGameInstance.collectPowerUp(); // Simulate collecting a power-up
        }

        racingGame.play();
        int racingGameScore = scoring.calculateSinglePlayerScore();
        System.out.println("Racing Game Score: " + racingGameScore);

        // Additional RacingGame functions
        if (racingGame instanceof RacingGame) {
            RacingGame racingGameInstance = (RacingGame) racingGame;
            racingGameInstance.completeLap(); // Simulate completing a lap
            racingGameInstance.useNitroBoost(); // Simulate using nitro boost
        }

        strategyGame.play();
        int strategyGameScore = scoring.calculateTeamScore();
        System.out.println("Strategy Game Score (Team-based): " + strategyGameScore);

        // Additional StrategyGame functions
        if (strategyGame instanceof StrategyGame) {
            StrategyGame strategyGameInstance = (StrategyGame) strategyGame;
            strategyGameInstance.gatherResources(); // Simulate gathering resources
            strategyGameInstance.buildStructure(); // Simulate building a structure
        }

        // Update player status in a cloud account
        cloudAccount.updatePlayerStatus();

        // Apply cheat codes
        CheatCodes cheatCodes = new CheatCodes();
        cheatCodes.applyCheatCode("GODMODE");
        System.out.println("------------------------------------------------------");

        cheatCodes.applyCheatCode("MOREPOINTS");
        System.out.println("------------------------------------------------------");

        cheatCodes.applyCheatCode("LEVELUP");
        System.out.println("------------------------------------------------------");

        cheatCodes.applyCheatCode("FIXBUG");
        System.out.println("------------------------------------------------------");


        // Save and load game progress
        cloudAccount.saveGameProgress();
        cloudAccount.loadGameProgress();

        // User logout
        uxDesign.logout();
        System.out.println("------------------------------------------------------");
        System.out.println("Thank you for playing!");
        System.out.println("------------------------------------------------------");

    }
}