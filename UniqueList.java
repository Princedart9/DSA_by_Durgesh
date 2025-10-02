import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueList {
    
    public static void main(String[] args) {
        // Original String array with duplicates
        String[] users = {"Prince", "Amit", "Neha", "Rahul", "Amit", "Zara"};
        
        // Use LinkedHashSet to remove duplicates and maintain order
        Set<String> uniqueUsers = new LinkedHashSet<>(Arrays.asList(users));
        
        // Convert back to array if needed
        String[] uniqueArray = uniqueUsers.toArray(new String[0]);
        
        // Print unique users
        System.out.println("Unique users: " + Arrays.toString(uniqueArray));
    }
}
