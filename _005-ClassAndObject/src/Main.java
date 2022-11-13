public class Main {
    public static void main(String[] args){
        Dog amora = new Dog("Amora", "Unknown",1);
        System.out.println(amora.getName());
        System.out.println(amora.getBreed());
        System.out.println(amora.getSize());
        amora.bark();
    }
}
