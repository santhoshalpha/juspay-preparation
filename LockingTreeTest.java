import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class LockingTreeTest {
    private LockingTree createTree() {
        return new LockingTree(3, 2, List.of("A", "B", "C"));
    }

    @Test
    public void lockInvalidNodeReturnsFalse() {
        LockingTree tree = createTree();
        assertFalse(tree.lock("X", 1));
    }

    @Test
    public void unlockInvalidNodeReturnsFalse() {
        LockingTree tree = createTree();
        assertFalse(tree.unlock("X", 1));
    }

    @Test
    public void upgradeInvalidNodeReturnsFalse() {
        LockingTree tree = createTree();
        assertFalse(tree.upgrade("X", 1));
    }
}
