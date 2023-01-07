import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        HashSet<Integer> intersectionSet = new HashSet<>();

        for (int i : first) {
            if (second.contains(i)) {
                intersectionSet.add(i);
            }
        }

        for (int i : second) {
            if (first.contains(i)) {
                intersectionSet.add(i);
            }
        }

        return intersectionSet;
     }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        HashSet<Integer> unionSet = new HashSet<>();

        for (int i : first) {
            unionSet.add(i);
        }

        for (int i : second) {
            unionSet.add(i);
        }

        return unionSet;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        HashSet<Integer> intersectionSet = new HashSet<>();

        intersectionSet.addAll(first);
        intersectionSet.addAll(second);

        intersectionSet.retainAll(first);
        intersectionSet.retainAll(second);

        return intersectionSet;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        HashSet<Integer> unionSet = new HashSet<>();

        unionSet.addAll(first);
        unionSet.addAll(second);

        return unionSet;
    }

    public static List<Integer> toList(Set<Integer> source) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(source);

        return list;
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> set = new HashSet<>(source);

        return toList(set);
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        ArrayList<Integer> list = new ArrayList<>(source);

        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }
        }

        return list;
    }

    public static String firstRecurringCharacter(String s) {
        String[] strings = s.replaceAll("\\s", "").split("");

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (strings[i].equals(strings[j])) {
                    return strings[j];
                }
            }
        }

        return "";
    }

    public static Set<Character> allRecurringChars(String s) {
        char[] charArray = s.toCharArray();
        Set<Character> newSet = new HashSet<>();

        for (char c : charArray) {
            newSet.add(c);
        }

        return newSet;
    }

    public static Integer[] toArray(Set<Integer> source) {
        Integer[] intArray = new Integer[source.size()];
        return source.toArray(intArray);
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }
}
