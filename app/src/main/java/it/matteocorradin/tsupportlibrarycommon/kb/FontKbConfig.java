package it.matteocorradin.tsupportlibrarycommon.kb;

import android.graphics.Typeface;

public class FontKbConfig {
    public final Typeface BoldFont;
    public final Typeface LightFont;
    public final Typeface RegularFont;
    public final Typeface MediumFont;
    public final Typeface SemiboldFont;
    public final Typeface RegularItalicFont;

    public FontKbConfig(Typeface boldFont, Typeface lightFont, Typeface regularFont, Typeface mediumFont, Typeface semiboldFont, Typeface regularItalicFont) {
        BoldFont = boldFont;
        LightFont = lightFont;
        RegularFont = regularFont;
        MediumFont = mediumFont;
        SemiboldFont = semiboldFont;
        RegularItalicFont = regularItalicFont;
    }
}
