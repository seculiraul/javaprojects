public class FactoryProducer {


    public static AbstractFactory getFactory(String factory) {

        if(factory == null)
            return null;

        if(factory.equals("HOLLYWOOD"))
            return new HollywoodFactory();

        if(factory.equals("BOLLYWOOD"))
            return new BollywoodFactory();


        return null;



    }
}
