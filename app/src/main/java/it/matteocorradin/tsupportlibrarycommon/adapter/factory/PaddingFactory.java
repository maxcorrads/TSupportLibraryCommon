package it.matteocorradin.tsupportlibrarycommon.adapter.factory;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import it.matteocorradin.tsupportlibrary.adapter.AdapterDataViewHolderAbstractFactory;
import it.matteocorradin.tsupportlibrary.adapter.holder.ViewHolder;
import it.matteocorradin.tsupportlibrarycommon.R;
import it.matteocorradin.tsupportlibrarycommon.adapter.holder.ViewHolderPadding;

public class PaddingFactory extends AdapterDataViewHolderAbstractFactory {
    @NonNull
    @Override
    public ViewHolder getViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_padding, parent, false);
        return new ViewHolderPadding(view);
    }
}
