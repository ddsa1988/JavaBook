public class Main {
    public static void main(String[] args){
        Dog amora = new Dog("Amora", "Unknown",1);
        System.out.println(amora.getName());
        System.out.println(amora.getBreed());
        System.out.println(amora.getSize());
        amora.bark();

        System.out.println("\n");

        Dog cereja = new Dog("Cereja", "Puddle",5);
        System.out.println(cereja.getName());
        System.out.println(cereja.getBreed());
        System.out.println(cereja.getSize());
        amora.bark();
    }
}
