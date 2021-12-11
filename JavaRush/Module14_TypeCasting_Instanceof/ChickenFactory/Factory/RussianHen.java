package ChickenFactory.Factory;

public class RussianHen extends Hen {
    private String  country = "Russian";

    public int      getCountOfEggsPerMonth () {
        return 30;
    }

    public String   getDescription () {
        return (super.getDescription() + " My country is " + this.country + ". I create " +
                this.getCountOfEggsPerMonth() + " every month.");
    }
}
