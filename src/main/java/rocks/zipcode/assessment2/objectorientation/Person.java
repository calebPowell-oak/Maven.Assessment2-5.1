package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    private Long id;
    private String name;
    private Address address;
    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person() {
        this(Long.MIN_VALUE, "", new Address());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Person){
            Person t = (Person)o;
            if(id == null || t.getId() == null){
                if(id != t.getId()){
                    return false;
                } else if(id == t.getId()) return true;
            }
            if(name == null || t.getName() == null){
                if(name != t.getName()){
                    return false;
                } else if(name == t.getName()) return true;
            }
            if(address == null || t.getAddress() == null){
                if(address != t.getAddress()){
                    return false;
                } else if(address == t.getAddress()) return true;
            }
            if(id.longValue() == t.getId().longValue()){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Person{id="+ id +", name='"+ name +"', address=" + address.toString()+ "}";
    }
}