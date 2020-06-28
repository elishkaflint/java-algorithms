import javafx.util.Pair;

import java.util.List;

public class QuickFind implements ConnectivitySolution {

    private int[] id;

    public QuickFind(int N) {
        id = new int[N];
        for(int i = 0; i < N; i++) {
            this.id[i] = i;
        }
    }

    public boolean isConnected(int p, int q) {
        return this.id[p] == id[q];
    }

    public void union(int p, int q) {
        id[p] = q;
        for(int i = 0; i < id.length; i++) {
            if(id[i] == p){
                id[i] = q;
            }
        }
        logIteration();
    }

    private void logIteration() {
        System.out.println("\n------");
        for(int i = 0; i < id.length; i++) {
            System.out.print(i + " -> ");
            System.out.println(id[i]);
        }
    }
}
