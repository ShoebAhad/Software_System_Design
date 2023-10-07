public class CheatCodes {
    public void applyCheatCode(String code) {
        switch (code) {
            case "GODMODE":
                enableGodMode();
                break;
            case "MOREPOINTS":
                getMorePoints();
                break;
            case "LEVELUP":
                levelUpInstantly();
                break;
            case "FIXBUG":
                fixBug();
                break;
            default:
                System.out.println("Invalid cheat code.");
        }
    }

    private void enableGodMode() {
        // Simulated logic for enabling God Mode
        System.out.println("God Mode enabled - You are invincible!");
        System.out.println("-----------------------------------------");

    }

    private void getMorePoints() {

        int additionalPoints = 100;
        System.out.println("You've gained " + additionalPoints + " points!");
        System.out.println("-----------------------------------------");

    }

    private void levelUpInstantly() {

        int currentLevel = 5;
        int newLevel = currentLevel + 1;
        System.out.println("You've leveled up to level " + newLevel + "!");
        System.out.println("-----------------------------------------");

    }

    private void fixBug() {
        // Simulated logic for fixing a bug
        System.out.println("A bug has been fixed.");
        System.out.println("-----------------------------------------");

    }
}
