public class Main {
    public static void main(String[] args){

        Amoeba newAmoeba = new Amoeba();
        newAmoeba.rotate();
        newAmoeba.playSound();

        System.out.println();

        Circle newCircle = new Circle();
        newCircle.rotate();
        newCircle.playSound();
    }
}
