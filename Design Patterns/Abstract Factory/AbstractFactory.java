public abstract class AbstractFactory {

   public abstract Hollywood  getHollywoodMovie(String gen);
    public abstract Bollywood getBollywoodMovie(String gen);
}



class HollywoodFactory extends AbstractFactory {


    @Override
    public Hollywood getHollywoodMovie(String gen) {

        if(gen == null)
        return null;

        if(gen.equals("COMEDIE"))
            return new ComedyH();

        if(gen.equals("ACTIUNE"))
            return new ActionH();

        return null;
    }

    @Override
    public Bollywood getBollywoodMovie(String gen) {

        return null;
    }
}


class BollywoodFactory extends AbstractFactory {


    @Override
    public Hollywood getHollywoodMovie(String gen) {
        return null;
    }

    @Override
    public Bollywood getBollywoodMovie(String gen) {

        if(gen == null)
            return null;

        if(gen.equals("COMEDIE"))
            return new ComedieB();

        if(gen.equals("ACTIUNE"))
            return new ActiuneB();


        return null;
    }
}
