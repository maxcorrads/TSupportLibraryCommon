package it.matteocorradin.tsupportlibrarycommon.adapter.model.text;

import android.graphics.Typeface;
import android.view.View;

import androidx.annotation.ColorInt;

public class TextValue {
    private final String text;
    private final Typeface typeface;
    private final int gravity;
    private final @ColorInt
    int textColor;
    private final int paddingLeft;
    private final int paddingRight;
    private final int paddingTop;
    private final int paddingBottom;
    private final View.OnClickListener onClickListener;
    private final boolean clickWrap;
    private final int size;
    private final int sizeUnit;

    public TextValue(String text, Typeface typeface, int gravity, @ColorInt int textColor, int paddingLeft, int paddingRight, int paddingTop, int paddingBottom, View.OnClickListener onClickListener, boolean clickWrap, int size, int sizeUnit) {
        this.text = text;
        this.typeface = typeface;
        this.gravity = gravity;
        this.textColor = textColor;
        this.paddingLeft = paddingLeft;
        this.paddingRight = paddingRight;
        this.paddingTop = paddingTop;
        this.paddingBottom = paddingBottom;
        this.onClickListener = onClickListener;
        this.clickWrap = clickWrap;
        this.size = size;
        this.sizeUnit = sizeUnit;
    }

    public String getText() {
        return text;
    }

    public Typeface getTypeface() {
        return typeface;
    }

    public int getGravity() {
        return gravity;
    }

    public @ColorInt
    int getTextColor() {
        return textColor;
    }

    public int getPaddingLeft() {
        return paddingLeft;
    }

    public int getPaddingRight() {
        return paddingRight;
    }

    public int getPaddingTop() {
        return paddingTop;
    }

    public int getPaddingBottom() {
        return paddingBottom;
    }

    public View.OnClickListener getOnClickListener() {
        return onClickListener;
    }

    public boolean isClickWrap() {
        return clickWrap;
    }

    public int getSizeUnit() {
        return sizeUnit;
    }

    public float getSize() {
        return size;
    }
}
