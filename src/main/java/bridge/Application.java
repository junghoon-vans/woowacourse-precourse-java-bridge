package bridge;

public class Application {

    public static void main(String[] args) {
        try {
            BridgeGame bridgeGame = new BridgeGame();
            bridgeGame.start();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
