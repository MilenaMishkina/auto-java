package practice_3;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    public GameSettings(String gameNameValue, int currentPlayersValue) {
        gameName = gameNameValue;
        currentPlayers = currentPlayersValue;
    }

    public static void setMaxPlayers(int newMax){
        maxPlayers = newMax;
    }

    public void addPlayer() {
       if (currentPlayers < maxPlayers) {
            currentPlayers++;
       } else {
           System.out.println("Превышено максимальное количетсво игроков");
       }
    }

    public void printGameStatus() {
        System.out.println("Game name: " + gameName + ". " + "Current players amount: " + currentPlayers + ". " + "Max players: " + maxPlayers);
    }

    public static void main(String[] args) {
        GameSettings game1 = new GameSettings("First", 7);
        GameSettings game2 = new GameSettings("Second", 3);

        GameSettings.maxPlayers = 7;

        game1.addPlayer();
        game1.printGameStatus();

        game2.addPlayer();
        game2.printGameStatus();

    }
}
