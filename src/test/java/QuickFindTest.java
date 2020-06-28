import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class QuickFindTest {

    @org.junit.jupiter.api.Test
    void checkConnection() {

        QuickFind quickFind = new QuickFind(10);

        quickFind.union(1,4);
        quickFind.union(4,7);

        assertTrue(quickFind.isConnected(1,7));
        assertFalse(quickFind.isConnected(1,3));
    }
}