import ch.tbz.m450.repository.Address;
import ch.tbz.m450.util.AddressComparator;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class AddressComparatorTest {

    @Test
    public void compareTest() {
        Address a1 = new Address(1, "John", "Doe", "1234567890", new Date());
        Address a2 = new Address(2, "Jane", "Doe", "0987654321", new Date());

        AddressComparator comparator = new AddressComparator();
        int result = comparator.compare(a1, a2);
        assertTrue(result < 0 || result > 0); // Abhängig von Ihrer Implementierung
    }
}
