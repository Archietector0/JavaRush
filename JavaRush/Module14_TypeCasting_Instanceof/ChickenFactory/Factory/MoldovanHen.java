package ChickenFactory.Factory;

public class MoldovanHen extends Hen {
    private String  country = "Moldova";

    public int      getCountOfEggsPerMonth () {
        return 36;
    }

    public String   getDescription () {
        return (super.getDescription() + " My country is " + this.country + ". I create " +
                this.getCountOfEggsPerMonth() + " every month.");
    }
}
