import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Sorted {

    public static void main(String[] args) {
        int num = 4;
        String[] users = { "Prince", "Amit", "Neha", "Rahul", "Amit", "Zara" };
        String[] sortedUsers = null;

        switch (num) {
            case 1:
                sortedUsers = Sorted.getSortedUserList1(users);
                printResult(users, sortedUsers);
                break;
            case 2:
                sortedUsers = Sorted.getSortedUserList2(users);
                printResult(users, sortedUsers);
                break;
            case 3:
                sortedUsers = Sorted.getSortedUserList3(users);
                printResult(users, sortedUsers);
                break;
            case 4:
                sortedUsers = Sorted.getSortedUserList4(users);
                printResult(users, sortedUsers);
                break;
            case 5:
                sortedUsers = Sorted.getSortedUserList5(users);
                printResult(users, sortedUsers);
                break;

            default:
                break;
        }

    }

    public static void printResult(String[] users, String[] sortedUsers) {
        System.out.println(String.join(", ", users));
        System.out.println(String.join(", ", sortedUsers));
    }

    public static String[] getSortedUserList1(String[] users) {
        Arrays.sort(users);
        return users;
    }

    public static String[] getSortedUserList2(String[] users) {
        // Convert array to list
        List<String> list = Arrays.asList(users);

        // Sort the list
        Collections.sort(list);

        // Convert back to array
        return list.toArray(new String[0]);
    }

    public static String[] getSortedUserList4(String[] users) {
        return Arrays.stream(users)
                .sorted() // natural order (alphabetical)
                .toArray(String[]::new);
    }

    public static String[] getSortedUserList5(String[] users) {
        List<String> list = Arrays.asList(users);

        // Sort ignoring case in reverse order
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER.reversed());

        return list.toArray(new String[0]);
    }

    public static String[] getSortedUserList3(String[] users) {
        Set<String> set = new TreeSet<>(); // TreeSet sorts automatically (natural order)
        for (String user : users) {
            set.add(user);
        }
        return set.toArray(new String[0]);
    }

}