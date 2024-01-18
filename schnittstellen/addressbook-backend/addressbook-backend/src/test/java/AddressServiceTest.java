import ch.tbz.m450.repository.Address;
import ch.tbz.m450.repository.AddressRepository;
import ch.tbz.m450.service.AddressService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import static org.mockito.BDDMockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class AddressServiceTest {

    @Mock
    private AddressRepository addressRepository;

    @InjectMocks
    private AddressService addressService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSave() {
        Address address = new Address(1, "John", "Doe", "1234567890", new Date());
        given(addressRepository.save(address)).willReturn(address);

        Address savedAddress = addressService.save(address);
        assertNotNull(savedAddress);
        assertEquals("John", savedAddress.getFirstname());
    }

    @Test
    public void testGetAll() {
        Address address1 = new Address(1, "John", "Doe", "1234567890", new Date());
        Address address2 = new Address(2, "Jane", "Doe", "0987654321", new Date());
        given(addressRepository.findAll()).willReturn(Arrays.asList(address1, address2));

        List<Address> addresses = addressService.getAll();
        assertNotNull(addresses);
        assertEquals(2, addresses.size());
    }

    // Weitere Tests für getAddress
}
