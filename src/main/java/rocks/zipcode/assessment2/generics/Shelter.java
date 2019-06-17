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
public class Shelter<T extends Ageable> {
    private ArrayList<T> s;
    public Shelter() {
        s = new ArrayList<>(0);
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return s.size();
    }

    public void add(Object object) {
        if(object instanceof Ageable){
            s.add((T) object);
        }
    }

    public Boolean contains(Object object) {
        if(object instanceof Ageable){
            return s.contains((T) object);
        } else {
            return false;
        }
    }

    public void remove(Object object) {
        if(object instanceof Ageable){
            s.remove((T) object);
        }
    }

    public Object get(Integer index) {
        return s.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        if(ageable instanceof Ageable){
            return s.indexOf((T) ageable);
        }
        else return -1;
    }
}