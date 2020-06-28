import javafx.util.Pair;

import java.util.List;

public class QuickUnion implements ConnectivitySolution {

    private int[] id;

    public QuickUnion(int N) {
        id = new int[N];
        for(int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean isConnected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        id[root(p)] = root(q);
        logIteration();
    }

    private int root(int p) {
        while (id[p] != p) { p = id[p]; }
        return p;
    }

    private void logIteration() {
        System.out.println("\n------");
        for(int i = 0; i < id.length; i++) {
            System.out.print(i + " -> ");
            System.out.println(id[i]);
        }
    }

}
