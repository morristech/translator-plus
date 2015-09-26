package com.nbsp.translator.models.yandextranslator;

import java.io.Serializable;
import java.util.Locale;

/**
 * Created by nickolay on 13.09.15.
 */

public class Language implements Serializable {
    private Locale locale;

    public Language(String code) {
        this.locale = new Locale(code);
    }

    public String getName() {
        return locale.getDisplayName(Locale.getDefault());
    }

    public Locale getLocale() {
        return locale;
    }

    public String getLanguageCode() {
        return locale.toLanguageTag();
    }
}
