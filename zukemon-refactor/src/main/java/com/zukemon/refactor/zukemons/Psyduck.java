package com.zukemon.refactor.zukemons;

import com.zukemon.refactor.CriticalHit;

public class Psyduck extends Zukemon {

    private static final int damage = 127;

    CriticalHit criticalHit = new CriticalHit();

    public Psyduck() {
        super(200);
    }

    @Override
    public int hit() {
        if(criticalHit.isCriticalHit(20)) {
            return 2* damage;
        }
        return damage;
    }

    @Override
    public int getNumber() {
        return 54;
    }
}
