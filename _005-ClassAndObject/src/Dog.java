public class Dog {
    private int size;
    private String breed;
    private String name;

    public Dog(String name, String breed, int size){
        this.setName(name);
        this.setBreed(breed);
        this.setSize(size);
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBreed() {
        return this.breed;
    }

    private void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void bark(){
        System.out.println("Bark");
    }
}
