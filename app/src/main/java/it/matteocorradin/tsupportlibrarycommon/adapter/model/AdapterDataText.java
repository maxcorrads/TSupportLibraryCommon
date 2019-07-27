package it.matteocorradin.tsupportlibrarycommon.adapter.model;

import androidx.annotation.NonNull;

import it.matteocorradin.tsupportlibrary.adapter.model.AdapterDataElementClass;
import it.matteocorradin.tsupportlibrary.adapter.model.AdapterDataGenericElementWithValue;
import it.matteocorradin.tsupportlibrarycommon.adapter.TSLCommonADET;
import it.matteocorradin.tsupportlibrarycommon.adapter.model.text.TextValue;

/**
 * Created by matteocorradin on 09/01/18.
 */

public class AdapterDataText extends AdapterDataGenericElementWithValue<TextValue> {

    public AdapterDataText(@NonNull TextValue value) {
        super(AdapterDataElementClass.addADET(TSLCommonADET.TEXT.getAdet()), value);
    }

}