package com.zukemon.refactor.fight;

import com.zukemon.refactor.ArenaDisplay;
import com.zukemon.refactor.ZukemonFactory;
import com.zukemon.refactor.history.HistoryWriter;
import com.zukemon.refactor.zukemons.Zukemon;

public abstract class FightingGame {

    private final ArenaDisplay arenaDisplay = new ArenaDisplay();
    private final HistoryWriter historyWriter = new HistoryWriter();
    private int highScore = 0;
    protected ZukemonFactory zukemonFactory;

    public FightingGame(ZukemonFactory zukemonFactory){
        this.zukemonFactory = zukemonFactory;
    }

    abstract void initialize();

    abstract Zukemon startPlay();

    abstract void endPlay();

    public final Zukemon play() {
        initialize();

        Zukemon zukemon = startPlay();

        endPlay();

        return zukemon;
    }

    public void writeHistory(Zukemon zukemon, String historyRecord) {
        historyWriter.write(zukemon, historyRecord);
    }

    public void updateArenaDisplay(Zukemon zukemon, int damage) {
        arenaDisplay.update(zukemon, damage);
    }

    public void fight(Zukemon attacker, Zukemon defender, int damage) {
        defender.reduceLifePointsBy(damage);
        updateArenaDisplay(attacker, damage);
        if (damage > highScore) {
            highScore = damage;
            System.out.println("New highscore from " + attacker.getClass().getSimpleName() + ": " + highScore);
        }

        String historyRecord = "Zukemon '" + attacker.getClass().getSimpleName() + "' made " + damage + " damage at '" + defender.getClass().getSimpleName() + "'\r\n";
        writeHistory(defender, historyRecord);
    }
}
