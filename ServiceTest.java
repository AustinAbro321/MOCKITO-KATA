import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;
import java.util.*;
class ServiceTest {    
    
    CarDb carDb;
    DateHelper dateHelper;
    PersonDb personDb;
    
    Service service;
    
    @BeforeEach
    public void setup(){
        carDb = mock(CarDb.class);
        dateHelper = mock(DateHelper.class);
        personDb = mock(PersonDb.class);
        service = new Service(carDb,dateHelper,personDb);
    }
    
    @Test
    void testGetMostRecentSalePlus10() {        
        //Has to be before the call to function we are testing
        when(carDb.getMostRecentSaleId()).thenReturn(1);
        int saleId = service.getMostRecentSaleIdPlus10();
        assertEquals(11,saleId);
    }
    
    @Test
    void verifyInsertSaleCalled() {        
        service.insertSale(1,1);
        verify(carDb).insertSale(1,1);
    }
}
