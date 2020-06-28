import javafx.util.Pair;

import java.util.List;

public class QuickFindConnectivity {

    // M is number of union operations ie. number of pairs
    // N is number of objects ie. number of possible values
    // Algorithm executes at M N operations

    private int N;
    private int[] unions;

    public QuickFindConnectivity(int N, List<Pair<Integer, Integer>> pairs) {
        this.N = N;
        this.unions = setUpUnions(pairs);
    }

    public boolean isConnected(Pair<Integer, Integer> pair) {
        return this.unions[pair.getKey()] == unions[pair.getValue()];
    }

    private int[] setUpUnions(List<Pair<Integer, Integer>> pairs) {

        int[] unions = new int[N];

        for(int i = 0; i < N; i++) {
            unions[i] = i;
        }

        for(Pair pair : pairs) {

            int p = (Integer) pair.getKey(), q = (Integer) pair.getValue();

            int temp = unions[p];

            // create connection between the pair
            unions[p] = unions[q];

            // join with other connections
            for(int i = 0; i < N; i++) {
                if(unions[i] == temp) {
                    unions[i] = unions[q];
                }
            }

            logIteration(unions, pair);
        }

        return unions;
    }

    private void logIteration(int[] unions, Pair pair) {
        System.out.println("\n-----");
        System.out.println(pair.getKey().toString() + " " + pair.getValue().toString());
        for(int i = 0; i < N; i++) {
            System.out.print(unions[i]);
        }
    }
}
