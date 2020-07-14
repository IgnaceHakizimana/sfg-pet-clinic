package rw.aos.sfgpetclinic.model;

/**
 * @author : Ignace
 * @date : Mon, 7/13/2020
 **/
public class PetType {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PetType{" +
                "name='" + name + '\'' +
                '}';
    }
}
