public class Dog {
    String name;
    int size;

    public void bark(int numOfBarks){ //NumOfBarks is a parameter
        while (numOfBarks > 0){
            System.out.println("Bark!");
            numOfBarks--;
        }
    }
}
