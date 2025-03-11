package q2;
class Game {
    private IGameStrategy gameStrategy;

    public Game(IGameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public void play() {
        gameStrategy.initializeGame();
        gameStrategy.playingGame();
        gameStrategy.showResult();
    }
}
