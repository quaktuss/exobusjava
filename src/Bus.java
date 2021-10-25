import java.text.SimpleDateFormat;
import java.util.Date;

public class Bus {
    public double totalWeight; // Poids total.
    public int licenseBus; //Immatriculation des bus.
    public String startingDate; // Date de mise en service.
    public int onlineDate; // temps de service.


    public Bus(double totalWeight, int licenseBus, String startingDate, int onlineDate) {
        this.totalWeight = totalWeight;
        this.licenseBus = licenseBus;
        this.startingDate = startingDate;
        this.onlineDate = onlineDate;
        System.out.printf("Total Weight : %s | License : %d | Starting Date : %s | Service Year : %d\n", totalWeight, licenseBus, startingDate , onlineDate);
    }

}
