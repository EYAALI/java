public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages = 25;

    public void addAnimal(Animal animal) {
        if (!isZooFull()) {
            animals.add(animal);
            System.out.println(animal.name + " Tzed");
        } else {
            System.out.println("Matzedch");
        }
    }
}

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        if (age < 0) {
            System.out.println("posctif");
        } else {
            this.name = name;
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("posctif");
        } else {
            this.age = age;
        }
    }
}

    private class Zoo {
        String name;
        int capacity;
        Animal[] animals;

        public Zoo(String name, int capacity) {

            this.name = name;
            this.capacity = capacity;
            this.animals = new Animal[nbrCages];

        }
    }


