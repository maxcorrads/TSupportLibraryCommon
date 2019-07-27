package it.matteocorradin.tsupportlibrarycommon.kb;

import android.graphics.Typeface;

public class FontKb {

    private static FontKb sInstance = null;
    private FontKbConfig config;

    public static FontKb getInstance() {
        if (sInstance == null) {
            sInstance = new FontKb();
        }
        return sInstance;
    }

    public void initialize(FontKbConfig config) {
        this.config = config;
    }

    public Typeface BoldFont() {
        return config.BoldFont;
    }

    public Typeface LightFont() {
        return config.LightFont;
    }

    public Typeface RegularFont() {
        return config.RegularFont;
    }

    public Typeface MediumFont() {
        return config.MediumFont;
    }

    public Typeface SemiboldFont() {
        return config.SemiboldFont;
    }

    public Typeface RegularItalicFont() {
        return config.RegularItalicFont;
    }

}
