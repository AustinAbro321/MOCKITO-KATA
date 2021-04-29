import java.time.LocalDate;
public interface PersonDb{
    public String getPersonName(int id);
    public String getPersonCity(int id);
    public LocalDate getPersonBday(int id);
}