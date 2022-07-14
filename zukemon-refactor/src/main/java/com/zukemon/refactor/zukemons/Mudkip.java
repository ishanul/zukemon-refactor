package com.zukemon.refactor.zukemons;


public class Mudkip extends Zukemon {

    public Mudkip() {
        super(200);
    }

    @Override
    public int hit() {
        return 234;
    }

    @Override
    public int getNumber() {
        return 258;
    }
}
