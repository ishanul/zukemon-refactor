package com.zukemon.refactor;

import com.zukemon.refactor.zukemons.Zukemon;

public class ArenaDisplay {

    private int damage;

    public void update(Zukemon zukemon, int damage) {
        this.damage = damage;
        System.out.println(zukemon.getClass().getName() + "made " + damage + " damage");
    }
}
