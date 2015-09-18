package com.nbsp.translator;

import com.nbsp.translator.api.Languages;
import com.nbsp.translator.models.Language;
import com.nbsp.translator.models.TranslationDirection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nickolay on 13.09.15.
 */

public class App {
    private static App ourInstance = new App();
    private TranslationDirection mTranslationDirection;

    public static App getInstance() {
        return ourInstance;
    }

    private App() {
        List<Language> languages = Languages.getInstance().getLanguages();
        mTranslationDirection = new TranslationDirection(
                languages.get(0),
                languages.get(1)
        );
    }

    public TranslationDirection getTranslationDirection() {
        return mTranslationDirection;
    }
}