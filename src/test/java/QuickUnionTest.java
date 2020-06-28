import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class QuickUnionTest {

    @org.junit.jupiter.api.Test
    void checkConnection() {

        QuickUnion quickUnion = new QuickUnion(10);

        quickUnion.union(1,4);
        quickUnion.union(4,7);

        assertTrue(quickUnion.isConnected(1,7));
        assertFalse(quickUnion.isConnected(1,3));
    }
}