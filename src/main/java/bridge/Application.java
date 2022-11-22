package bridge;

public class Application {

    public static void main(String[] args) {
        try {
            BridgeGame bridgeGame = new BridgeGame();
            bridgeGame.start();
            bridgeGame.move();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
