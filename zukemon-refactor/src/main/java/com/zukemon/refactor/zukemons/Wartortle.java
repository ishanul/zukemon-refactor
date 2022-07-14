package com.zukemon.refactor.zukemons;

public class Wartortle extends Zukemon {

    public Wartortle() {
        super(200);
    }

    @Override
    public int hit() {
        return 300;
    }

    @Override
    public int getNumber() {
        return 8;
    }
}
