package com.zukemon.refactor.zukemons;

public class Pikachu extends Zukemon {

    public Pikachu() {
        super(200);
    }

    @Override
    public int hit() {
        return 135;
    }

    @Override
    public int getNumber() {
        return 25;
    }
}
