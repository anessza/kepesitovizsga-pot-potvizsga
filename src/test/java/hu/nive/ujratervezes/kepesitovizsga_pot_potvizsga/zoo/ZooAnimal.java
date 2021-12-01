package hu.nive.ujratervezes.kepesitovizsga_pot_potvizsga.zoo;

public abstract class ZooAnimal {
    private String name;
    public int size;
    public int weight;

    public ZooAnimal(String name, int size, int weight) {
        this.name = name;
        this.size = size;
        this.weight = weight;
    }

    public ZooAnimal(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public ZooAnimal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public ZooAnimal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ZooAnimal{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", weight=" + weight +
                '}';
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
