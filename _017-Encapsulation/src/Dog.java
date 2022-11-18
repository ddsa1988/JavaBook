public class Dog {
    private String name;
    private int size;

    public Dog(String name, int size){
        this.setName(name);
        this.setSize(size);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setSize(int size){
        this.size = size > 0 && size < 10 ? size : 1;
    }

    public int getSize(){
        return this.size;
    }

}
