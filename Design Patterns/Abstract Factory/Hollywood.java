public interface Hollywood {

    void gen();
}



class ComedyH implements Hollywood{

    @Override
    public void gen() {

        System.out.println("GENUL COMEDIE DE LA HOLLYWOOD");
    }
}

class ActionH implements Hollywood {


    @Override
    public void gen() {
        System.out.println("GENUL ACTIUNE DE LA HOLLYWOOD");
    }
}
