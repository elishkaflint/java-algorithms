import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WeightedQuickUnionTest {

    @org.junit.jupiter.api.Test
    void checkConnection() {

        WeightedQuickUnion weightedQuickUnion = new WeightedQuickUnion(10);

        weightedQuickUnion.union(1,4);
        weightedQuickUnion.union(2,3);
        weightedQuickUnion.union(3,5);
        weightedQuickUnion.union(1,5);
        weightedQuickUnion.union(6,7);
        weightedQuickUnion.union(7,8);
        weightedQuickUnion.union(1,7);

        assertTrue(weightedQuickUnion.isConnected(4,5));
        assertFalse(weightedQuickUnion.isConnected(0,3));
    }
}