public class Client {


    public static void main(String[] args) {


        AbstractFactory factory = FactoryProducer.getFactory("HOLLYWOOD");

        Hollywood monvie1 = factory.getHollywoodMovie("COMEDIE");
        monvie1.gen();

        Hollywood movie2 = factory.getHollywoodMovie("ACTIUNE");
        movie2.gen();


        factory = FactoryProducer.getFactory("BOLLYWOOD");

        Bollywood movie3 = factory.getBollywoodMovie("COMEDIE");
        movie3.gen();

        Bollywood movie4 = factory.getBollywoodMovie("ACTIUNE");
        movie4.gen();
    }
}
