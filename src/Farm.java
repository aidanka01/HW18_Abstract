import java.util.Arrays;

public class Farm {

    private Cow [] cows;
    private Sheep [] sheeps;
    private Horse [] horses;
    private String ownerName;

    public Farm() {
    }

    public Farm(Cow[] cows, Sheep[] sheeps, Horse[] horses, String ownerName) {
        this.cows = cows;
        this.sheeps = sheeps;
        this.horses = horses;
        this.ownerName = ownerName;
    }


    @Override
    public String toString() {
        return "Farm{" +
                "cows=" + Arrays.toString(cows) +
                ", sheeps=" + Arrays.toString(sheeps) +
                ", horses=" + Arrays.toString(horses) +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}