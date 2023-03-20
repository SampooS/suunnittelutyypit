package Teht11;

public class Test {
    public static void main(String[] args) {
                
        Player players[] = new Player[10];
        
        for (int i = 0; i<10; i++) {
            players[i] = new Player(GameMaster.joinGame());
        }

        for (Player player : players) {
            player.start();
            System.out.println("Player going!");
        }

    }
}
