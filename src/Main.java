
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat formatter= new SimpleDateFormat("MM-dd-yyyy");
        String date = formatter.format(new Date());

         new BusOperator("Olivier", 28  , "man", 456);
         new Students("Lea", 12, "girl");
         new Bus(6000.00, 456, date, 12);
    }
}