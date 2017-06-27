import java.util.*;

/**
 * This example uses a Java Function-based method reference to sort a
 * list of threads by their names.  It also demonstrates the use of
 * the Comparator.comparing() factory method.
 */
public class ex3 {
    static public void main(String[] argv) {
        List<Thread> threads =
                Arrays.asList(new Thread("Larry"),
                              new Thread("Curly"),
                              new Thread("Moe"));
        System.out.println(threads);

        // Sort the threads by their names.
        threads.sort(Comparator.comparing(Thread::getName));

        System.out.println(threads);
    }
}

