package com.zukemon.refactor.history;

import com.zukemon.refactor.zukemons.Zukemon;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class HistoryWriter {
    public void write(Zukemon zukemon, String historyRecord) {
        try {
            File historyFile = new File("history.txt");
            if (!historyFile.exists()) {
                historyFile.createNewFile();
            }
            Files.write(Paths.get("history.txt"), historyRecord.getBytes(), StandardOpenOption.APPEND);
            if (zukemon.isDead()) {
                String deadMessage = "Zukemon '" + zukemon.getClass().getSimpleName() + "' is dead looser";
                Files.write(Paths.get("history.txt"), deadMessage.getBytes(), StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
