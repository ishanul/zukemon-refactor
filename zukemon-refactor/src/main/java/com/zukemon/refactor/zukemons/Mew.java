package com.zukemon.refactor.zukemons;

import com.zukemon.refactor.CriticalHit;

public class Mew extends Zukemon {
    private static final int damage = 150;

    CriticalHit criticalHit = new CriticalHit();

    public Mew() {
        super(200);
    }

    @Override
    public int hit() {
        if(criticalHit.isCriticalHit(10)) {
            return 2* damage;
        }
        return damage;
    }

    @Override
    public int getNumber() {
        return 151;
    }
}
