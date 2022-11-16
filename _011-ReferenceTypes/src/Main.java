public class Main {

    public static void main (String [] args){

        int [] anArray = new int[10];

        for(int index = 0; index < anArray.length; index++){
            anArray[index] = index;
        }

        for (int index: anArray) {
            System.out.print(index + " ");
        }

        System.out.println();

        Dog[] myDogs = new Dog[10];

        for(int index = 0; index < myDogs.length; index++){
            System.out.print(myDogs[index] + " ");
        }

        for(int index = 0; index < myDogs.length; index++){
            myDogs[index] = new Dog("Amora", "Unkown", 10);
        }

        System.out.println();

        for(int index = 0; index < myDogs.length; index++){
            System.out.print(myDogs[index] + " ");
        }
    }
}
