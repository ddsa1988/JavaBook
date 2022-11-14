public class GuessGame {

    public void startGame(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I1m thinking of a number between 0 adn 9...");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);
            guessP1 = p1.guess(1);
            guessP2 = p2.guess(2);
            guessP3 = p3.guess(3);

            p1IsRight = guessP1 == targetNumber ? true : false;
            p2IsRight = guessP2 == targetNumber ? true : false;
            p3IsRight = guessP3 == targetNumber ? true : false;

            if (p1IsRight || p2IsRight || p3IsRight) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1IsRight);
                System.out.println("Player two got it right? " + p2IsRight);
                System.out.println("Player three got it right? " + p3IsRight);
                System.out.println("Game is over!");
                break;
            } else System.out.println("Players will have to try again!");
        }
    }
}
