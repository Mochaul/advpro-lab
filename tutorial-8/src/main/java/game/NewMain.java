package game;

public class NewMain {

    public static void main(String[] args) {
        Thread thread = new Thread(new QuestGenerator(new ScoreCounter()));
        thread.start();
    }
}
