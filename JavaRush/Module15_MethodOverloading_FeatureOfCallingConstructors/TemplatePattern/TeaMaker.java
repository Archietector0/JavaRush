class TeaMaker extends DrinkMaker {

    @Override
    public void getRightCup() {
        System.out.println("Looking for the cup for Tea ...");
    }

    @Override
    public void putIngredient() {
        System.out.println("Pour the tea");
    }

    @Override
    public void pour() {
        System.out.println("Fill with water");
    }
}