import java.util.*;
import java.time.LocalDate;
public class Service {

    private CarDb carDb;
    private DateHelper dateHelper;
    private PersonDb personDb;
    
    public Service(CarDb carDb,DateHelper dateHelper,PersonDb personDb) {
        this.carDb = carDb;
        this.dateHelper = dateHelper;
        this.personDb = personDb;
    }
    
    public void insertSale(int personId,int carId){
        carDb.insertSale(personId,carId);
    }
    
    public int getMostRecentSaleIdPlus10(){
        return carDb.getMostRecentSaleId() + 10;
    }
    
}
