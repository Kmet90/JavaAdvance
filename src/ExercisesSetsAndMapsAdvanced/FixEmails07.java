package ExercisesSetsAndMapsAdvanced;

import java.util.*;

public class FixEmails07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> peopleAndMails = new LinkedHashMap<>();
        int counter = 1;
        String key = "";
        String input;
        while (!"stop".equals(input = scan.nextLine())) {
            if (counter % 2 != 0) {
                key = input;
                peopleAndMails.putIfAbsent(key, new ArrayList<>());
            } else {
                int index = input.indexOf('.');
                String current = input.substring(index + 1);
                if (current.equalsIgnoreCase("us")
                        || current.equalsIgnoreCase("uk")
                        || current.equalsIgnoreCase("com")) {
                    peopleAndMails.remove(key);
                    counter++;
                    continue;
                }

                peopleAndMails.get(key).add(input);
            }
            counter++;
        }


//        for (Map.Entry<String, List<String>> entrySet : peopleAndMails.entrySet()) {
//            String currKey = entrySet.getKey();
//            for (String email : entrySet.getValue()) {
//                int index = email.indexOf('.');
//                String current = email.substring(index + 1);
//                if (current.equalsIgnoreCase("us")
//                        || current.equalsIgnoreCase("uk")
//                        || current.equalsIgnoreCase("com")) {
//                    peopleAndMails.remove(currKey);
//                }
//            }
//        }

        for (Map.Entry<String, List<String>> stringListEntry : peopleAndMails.entrySet()) {
            System.out.print(stringListEntry.getKey() + " -> ");
            System.out.println(String.join(" ", stringListEntry.getValue()));
        }
    }
}

