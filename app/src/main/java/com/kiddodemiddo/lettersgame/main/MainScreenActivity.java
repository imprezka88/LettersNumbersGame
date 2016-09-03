package com.kiddodemiddo.lettersgame.main;

import android.os.Bundle;
import com.kiddodemiddo.lettersgame.R;
import com.kiddodemiddo.patterngame.main.PatternGameMainScreenActivity;
import org.jetbrains.annotations.NotNull;

public class MainScreenActivity extends PatternGameMainScreenActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected String getLearningName() {
        return getResources().getString(R.string.learning);
    }

    @NotNull
    @Override
    public String getGameOneName() {
        return getResources().getString(R.string.game1);
    }

    @Override
    protected String getGameTwoName() {
        return getResources().getString(R.string.game2);
    }
}
