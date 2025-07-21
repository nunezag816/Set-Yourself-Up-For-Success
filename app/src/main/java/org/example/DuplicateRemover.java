package example.org;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateRemover {

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        Set<T> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }
}
