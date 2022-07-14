package com.zukemon.refactor.zukemons;

public class Blastoise extends Zukemon {

    public Blastoise() {
        super(200);
    }

    @Override
    public int hit() {
        return 258;
    }

    @Override
    public int getNumber() {
        return 9;
    }
}
