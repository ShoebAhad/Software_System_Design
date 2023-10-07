
public class CloudAccount extends PlayerAccount {
    public CloudAccount(String playerName) {
        super(playerName);
    }


    public void saveGameProgress() {
        System.out.println("Game progress saved for player " + getPlayerName());
        System.out.println("-----------------------------------------");

    }

    public void loadGameProgress() {
        System.out.println("Game progress loaded for player " + getPlayerName());
        System.out.println("-----------------------------------------");

    }
}
