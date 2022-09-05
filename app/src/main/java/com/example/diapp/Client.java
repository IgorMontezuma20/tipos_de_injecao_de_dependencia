package com.example.diapp;

public class Client {





    //Injeção por construtor

    private final Service1 mservice1;

    public Client(Service1 service1) {
        mservice1 = service1;
    }

    //---------------------X----------------------------------X----------------------------------
    //Injeção por Método

    private Service2 mservice2;

    public Service2 getMservice2() {
        return mservice2;
    }

    //---------------------X----------------------------------X----------------------------------
    //Injeção por campo

    public Service3 mservice3;


    public void doAnithing(){
        mservice1.doSomething();
        mservice2.doSomething();
        mservice3.doSomething();
    }

}
