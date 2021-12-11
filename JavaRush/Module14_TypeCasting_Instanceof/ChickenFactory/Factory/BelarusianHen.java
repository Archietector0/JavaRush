package ChickenFactory.Factory;

public class BelarusianHen extends Hen {
    private String  country = "Belarus";

    public int      getCountOfEggsPerMonth () {
        return 14;
    }

    public String   getDescription () {
        return (super.getDescription() + " My country is " + this.country + ". I create " +
                this.getCountOfEggsPerMonth() + " every month.");
    }
}
