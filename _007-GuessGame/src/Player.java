public class Player {

    private int number = 0;

    public int guess (int playerNumber) {
        number = (int) (Math.random() * 10);
        System.out.println("Player " + playerNumber + " guessed " + number);

        return number;
    }
}
