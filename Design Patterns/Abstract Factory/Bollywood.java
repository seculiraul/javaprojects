public interface Bollywood {

    void gen();
}


class ComedieB implements Bollywood {


    @Override
    public void gen() {
        System.out.println("COMEDIE DE LA BOLLYWOOD");
    }
}


class ActiuneB implements Bollywood {


    @Override
    public void gen() {
        System.out.println("ACTIUNE DE LA BOLLYWOOD");
    }
}

