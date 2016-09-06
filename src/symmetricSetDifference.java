import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Jakob on 31-08-2016.
 */
public class symmetricSetDifference {

    public static void main (String[] args){

    Set<Integer> set1 = new HashSet<Integer>();
        set1.addAll(Arrays.asList(1, 4, 7, 9));

    Set<Integer> set2 = new HashSet<Integer>();
        set2.addAll(Arrays.asList(2, 4, 5, 6, 7));

        System.out.print(symmetricSetDifferences(set1, set2));
    }

    public static Set<Integer> symmetricSetDifferences (Set<Integer> set1, Set<Integer> set2) {

Set<Integer> symDifSet = new HashSet<Integer>();

Set<Integer> set1Copy = new HashSet<Integer>();
        set1Copy.addAll(set1);

        set1.removeAll(set2);
        set2.removeAll(set1Copy);

        Iterator itr1 =  set1.iterator();
        while (itr1.hasNext()){
            Integer temp = (Integer)itr1.next();
            symDifSet.add(temp);
        }

        Iterator itr2 =  set2.iterator();
        while (itr2.hasNext()){
            Integer temp = (Integer)itr2.next();
            symDifSet.add(temp);
        }



            return symDifSet;
    }
}
