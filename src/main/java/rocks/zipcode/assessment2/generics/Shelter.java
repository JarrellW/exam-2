package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.ArrayList;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<_ extends Ageable> {
    ArrayList<Ageable> farmHouse;

    public Shelter() {
        throw new NullPointerException();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return farmHouse.size();
    }

    public void add(_ object) {
        farmHouse.add(object);
    }

    public Boolean contains(_ object) {
        return farmHouse.contains(object);
    }

    public void remove(_ object) {
        farmHouse.remove(object);
    }

    public Object get(Integer index) {
        return farmHouse.get(index);
    }

    public Integer getIndexOf(_ ageable) {

        return farmHouse.indexOf(ageable);
    }
}