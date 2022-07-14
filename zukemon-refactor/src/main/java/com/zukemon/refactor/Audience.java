package com.zukemon.refactor;

import com.zukemon.refactor.zukemons.Zukemon;

public class Audience {

    private static Audience audience = null;

    private Audience() {
    }

    public static Audience getInstance() {
        if(audience == null) {
          audience = new Audience();
        }
        return audience;
    }

    public void update(Zukemon zukemon, int damage) {
        // The audience need some time to realize the new damage. Do not delete this!
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Go " + zukemon.getClass().getName() + ", go!");
    }
}
