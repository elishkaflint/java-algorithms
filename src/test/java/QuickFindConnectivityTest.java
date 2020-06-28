import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuickFindConnectivityTest {

    @org.junit.jupiter.api.Test
    void checkConnection() {

        List<Pair<Integer, Integer>> pairs = new ArrayList<>();
        pairs.add(new Pair<>(3,4));
        pairs.add(new Pair<>(4,6));
        pairs.add(new Pair<>(8,0));

        QuickFindConnectivity alg = new QuickFindConnectivity(10, pairs);

        assertTrue(alg.isConnected(new Pair<>(3,6)));
        assertFalse(alg.isConnected(new Pair<>(3,0)));
    }
}