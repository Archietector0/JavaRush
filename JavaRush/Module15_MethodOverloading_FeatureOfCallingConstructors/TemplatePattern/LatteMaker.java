class LatteMaker extends DrinkMaker {

    @Override
    public void getRightCup() {
        System.out.println("Looking for the cup for Latte ...");
    }

    @Override
    public void putIngredient() {
        System.out.println("Mix milk with foam");
    }

    @Override
    public void pour() {
        System.out.println("Make Latte ...");
    }
}