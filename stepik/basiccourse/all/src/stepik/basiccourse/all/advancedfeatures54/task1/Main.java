package stepik.basiccourse.all.advancedfeatures54.task1;

import java.io.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Animal goat = new Animal("Goat");
        Animal ram = new Animal("Ram");
        Animal donkey = new Animal("Donkey");

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] arrBinaryAnimals;
        Animal[] arrAnimals;
        try (ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream)) {
            oos.writeInt(3);
            oos.writeObject(goat);
            oos.writeObject(ram);
            oos.writeObject(donkey);
        } catch (IOException e) {
            e.printStackTrace();
        }

        arrBinaryAnimals = byteArrayOutputStream.toByteArray();
        arrAnimals = deserializeAnimalArray(arrBinaryAnimals);
        for (Animal animal : arrAnimals) {
            System.out.println(animal.getName());
        }
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        try (ObjectInputStream ois = new ObjectInputStream(byteArrayInputStream)) {
            Animal[] arrAnimals = new Animal[ois.readInt()];
            for (var i = 0; i < arrAnimals.length; i++) {
                arrAnimals[i] = (Animal) ois.readObject();
            }
            return arrAnimals;
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}

class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(this.name, ((Animal) obj).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}