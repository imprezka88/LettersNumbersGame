package com.kiddodemiddo.lettersgame;

import com.kiddodemiddo.patterngame.PatternGameApplication;
import com.kiddodemiddo.patterngame.game.GameSettings;

import java.util.ArrayList;
import java.util.List;

public class LettersGameApplication extends PatternGameApplication {
    private GameSettings gameSettings;

    @Override
    public GameSettings getGameSettings() {
        if(gameSettings == null) {
            List<List<String>> gamesAvailableItems = new ArrayList<>();
            List<String> game1AvailableItems = new ArrayList<>();
            for (char c = 'a'; c <= 'z'; c++)
                game1AvailableItems.add(String.valueOf (c));

            List<String> game2AvailableItems = new ArrayList<>();

            for (int i=0;i<=9;i++)
                game2AvailableItems.add(String.valueOf (i));

            gamesAvailableItems.add(game1AvailableItems);
            gamesAvailableItems.add(game2AvailableItems);
            gameSettings = new GameSettings.Builder(gamesAvailableItems).build();
        }
        return gameSettings;
    }
}
