package com.zukemon.refactor;

import com.zukemon.refactor.zukemons.*;

public class ZukemonFactory {

    public Zukemon createZukemon(int type) {
        switch (type) {
            case 151:
                return new Mew();
            case 8:
                return new Wartortle();
            case 9:
                return new Blastoise();
            case 258:
                return new Mudkip();
            case 25:
                return new Pikachu();
            case 54:
                return new Psyduck();
            case 553:
                return new Krookodile();
        }
        throw new IllegalArgumentException("No Zukemon for type " + type);
    }

}
