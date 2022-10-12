public class PizzaClient {

    public void run() {

        Pizza round = new Pizza(3, new Circle(4));

        Pizza rect = new Pizza(4, new Rectangle(6, 4));

        PizzaDeal pd = new PizzaDeal();

        System.out.println(round + " tot hon " + rect

                + "=" + pd.betterDeal(round, rect));

    }

    public static void main(String[] nu) {

        new PizzaClient().run();

    }

}