package com.zukemon.refactor.fight;

import com.zukemon.refactor.FightMode;
import com.zukemon.refactor.ZukemonFactory;

public class FightBehaviorFactory {
    public static FightGame getFightBehavior(FightMode fightMode, ZukemonFactory zukemonFactory) {
        switch (fightMode) {
            case NORMAL:
                return new NormalFight(zukemonFactory);
            case DEFEND:
                return new DefendFight(zukemonFactory);
            case ROYAL_RUMBLE:
                return new RoyalRumble(zukemonFactory);

        }
        throw new IllegalArgumentException("No Fight Behavior for type " + fightMode);
    }
}
