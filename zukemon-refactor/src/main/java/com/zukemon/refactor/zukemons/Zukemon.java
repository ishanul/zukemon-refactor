package com.zukemon.refactor.zukemons;

public abstract class Zukemon {
    private int lifePoints = 0;

    protected Zukemon(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public abstract int hit();

    public abstract int getNumber();

    public void reduceLifePoints(int lifePointsToReduce) {
        this.lifePoints = Math.max(0, lifePoints - lifePointsToReduce);
    }

    public boolean isDead() {
        return lifePoints == 0;
    }
}
