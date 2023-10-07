// PlayerStatus Enum to represent player status
enum PlayerStatus {
    ONLINE,
    OFFLINE
}

// Base class for player accounts
public class PlayerAccount {
    private String playerName;
    private PlayerStatus playerStatus;

    public PlayerAccount(String playerName) {
        this.playerName = playerName;
        this.playerStatus = PlayerStatus.ONLINE; // Assume the player is online by default
    }

    public String getPlayerName() {
        return playerName;
    }

    public PlayerStatus getPlayerStatus() {
        return playerStatus;
    }

    public void setPlayerStatus(PlayerStatus playerStatus) {
        this.playerStatus = playerStatus;
    }

    public void updatePlayerStatus() {
        System.out.println("Player " + playerName + " is now " + playerStatus);
    }
}
