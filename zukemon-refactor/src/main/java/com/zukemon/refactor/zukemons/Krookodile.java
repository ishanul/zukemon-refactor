package com.zukemon.refactor.zukemons;


import java.util.List;

public class Krookodile extends Zukemon {

    List<Zukemon> teamMembers = List.of(new Blastoise(), new Mew(), new Wartortle(), new Mudkip(), new Pikachu(), new Psyduck());

    public Krookodile() {
        super(400);
    }

    @Override
    public int hit() {
        int damage = 0;
        for (Zukemon zukemon: teamMembers) {
            damage += zukemon.hit();
        }
        return damage;
    }

    @Override
    public int getNumber() {
        return 553;
    }
}
