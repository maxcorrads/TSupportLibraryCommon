package it.matteocorradin.tsupportlibrarycommon.adapter.model;

import androidx.annotation.ColorRes;

import it.matteocorradin.tsupportlibrary.adapter.model.AdapterDataElementClass;
import it.matteocorradin.tsupportlibrary.adapter.model.AdapterDataGenericElementWithValue;
import it.matteocorradin.tsupportlibrarycommon.adapter.TSLCommonADET;

/**
 * Created by matteocorradin on 09/01/18.
 */

public class AdapterDataPadding extends AdapterDataGenericElementWithValue<Double> {

    private boolean scaled = true;

    private boolean horizontal;

    private @ColorRes
    int background = android.R.color.transparent;

    public AdapterDataPadding(Integer value, @ColorRes int background) {
        this(Double.valueOf(value), false);
        this.background = background;
    }

    public AdapterDataPadding(Integer value) {
        this(Double.valueOf(value), false);
    }

    public AdapterDataPadding(Double value) {
        this(value, false);
    }

    public AdapterDataPadding(boolean notScaled, Double value) {
        this(value, false);
        this.scaled = notScaled;
    }

    public AdapterDataPadding(Integer value, boolean horizontal) {
        this(Double.valueOf(value), horizontal);
    }

    public AdapterDataPadding(Double value, boolean horizontal) {
        super(AdapterDataElementClass.addADET(TSLCommonADET.PADDING.getAdet()), value);
        this.horizontal = horizontal;
    }

    public boolean isHorizontal() {
        return horizontal;
    }

    public boolean isScaled() {
        return scaled;
    }

    public int getBackground() {
        return background;
    }
}