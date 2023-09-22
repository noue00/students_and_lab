import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
/**
 * Lab
 */
public class Lab {

    private String name;
    private int capacity;
    private Set<String> availableEquipment;
    private Map<Student, Set<String>> studentEquipment;

    public Lab (String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        availableEquipment = new HashSet<>();
        studentEquipment = new HashMap<>();
    }

    public void addEquipment(String equipment){
        availableEquipment.add(equipment);
    }

}