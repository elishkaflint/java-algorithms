public class WeightedQuickUnion implements ConnectivitySolution {

    private int[] id, sz;

    public WeightedQuickUnion(int N) {
        id = new int[N];
        sz = new int[N];
        for(int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    public boolean isConnected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {

        int i = root(p);
        int j = root(q);

        if(sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
        logIteration();
    }

    private int root(int p) {
        while (id[p] != p) {
            p = id[p];
        }
        return p;
    }

    private void logIteration() {
        System.out.println("\n------");
        System.out.println("node -> root -> # descendants incl self");
        for(int i = 0; i < id.length; i++) {
            System.out.print(i + " -> ");
            System.out.print(id[i] + " -> ");
            System.out.println(sz[i]);
        }
    }

}
