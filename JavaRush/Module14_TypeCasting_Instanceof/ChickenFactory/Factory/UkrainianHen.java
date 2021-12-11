package ChickenFactory.Factory;

public class UkrainianHen extends Hen {
    private String  country = "Ukraine";

    public int      getCountOfEggsPerMonth () {
        return 23;
    }

    public String   getDescription () {
        return (super.getDescription() + " My country is " + this.country + ". I create " +
                this.getCountOfEggsPerMonth() + " every month.");
    }
}
