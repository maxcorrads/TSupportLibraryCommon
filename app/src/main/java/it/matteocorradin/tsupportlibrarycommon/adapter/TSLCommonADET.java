package it.matteocorradin.tsupportlibrarycommon.adapter;

import it.matteocorradin.tsupportlibrary.adapter.AdapterDataViewHolderAbstractFactory;
import it.matteocorradin.tsupportlibrary.adapter.model.IAdapterDataElementType;
import it.matteocorradin.tsupportlibrarycommon.adapter.factory.PaddingFactory;
import it.matteocorradin.tsupportlibrarycommon.adapter.factory.TextFactory;

/**
 * Created by matteocorradin on 31/05/19.
 */

public enum TSLCommonADET {
    PADDING(new IAdapterDataElementType() {
        @Override
        public String getName() {
            return "PADDING";
        }

        @Override
        public AdapterDataViewHolderAbstractFactory getFactory() {
            return new PaddingFactory();
        }
    }),

    TEXT(new IAdapterDataElementType() {
        @Override
        public String getName() {
            return "TEXT";
        }

        @Override
        public AdapterDataViewHolderAbstractFactory getFactory() {
            return new TextFactory();
        }
    });

    private IAdapterDataElementType adet;

    TSLCommonADET(IAdapterDataElementType adet) {
        this.adet = adet;
    }

    public IAdapterDataElementType getAdet() {
        return adet;
    }
}
