package Day22_1.CollectionImp.Hasting;

public class DateHashCode {
    private int year;
    private int month;
    private int day;

    public int hashCode() {
        int result = 17;
        result = 31 * result + year;
        result = 31 * result + month;
        result = 31 * result + day;
        return result;
    }
}
