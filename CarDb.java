import java.time.LocalDate;
import java.util.*;
public interface CarDb{
    public int insertSale(int carId, int personId);
    public int getInventory(int carId);
    public void makeCarInactive(int carId);
    public int getMostRecentSaleId();
    public LocalDate getSaleDate();
    public List<String> getDealershipCities();
}