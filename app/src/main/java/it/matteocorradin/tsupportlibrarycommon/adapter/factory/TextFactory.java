package it.matteocorradin.tsupportlibrarycommon.adapter.factory;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import it.matteocorradin.tsupportlibrary.adapter.AdapterDataViewHolderAbstractFactory;
import it.matteocorradin.tsupportlibrary.adapter.holder.ViewHolder;
import it.matteocorradin.tsupportlibrarycommon.R;
import it.matteocorradin.tsupportlibrarycommon.adapter.holder.ViewHolderText;

public class TextFactory extends AdapterDataViewHolderAbstractFactory {
    @NonNull
    @Override
    public ViewHolder getViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_text, parent, false);
        return new ViewHolderText(view);
    }
}
