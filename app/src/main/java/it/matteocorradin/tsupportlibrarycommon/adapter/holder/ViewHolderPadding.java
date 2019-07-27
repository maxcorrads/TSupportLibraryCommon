package it.matteocorradin.tsupportlibrarycommon.adapter.holder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import it.matteocorradin.tsupportlibrary.SizeUtils;
import it.matteocorradin.tsupportlibrary.adapter.HomeAdapter;
import it.matteocorradin.tsupportlibrary.adapter.holder.ViewHolder;
import it.matteocorradin.tsupportlibrary.adapter.model.AdapterDataGenericElement;
import it.matteocorradin.tsupportlibrarycommon.R;
import it.matteocorradin.tsupportlibrarycommon.adapter.model.AdapterDataPadding;

/**
 * Created by matteocorradin on 09/01/18.
 */

public class ViewHolderPadding extends ViewHolder {

    public final LinearLayout container;

    public ViewHolderPadding(View view) {
        super(view);
        container = view.findViewById(R.id.row_padding_container);
    }

    @Override
    public void bind(AdapterDataGenericElement generic, HomeAdapter homeAdapter) {
        super.bind(generic, homeAdapter);
        if (generic instanceof AdapterDataPadding) {
            AdapterDataPadding item = (AdapterDataPadding) generic;
            LinearLayout.LayoutParams params = new
                    LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT);
            container.setBackgroundResource(item.getBackground());
            if (item.isHorizontal()) {
                params.width = item.isScaled() ? (int) SizeUtils.dipToPixels(mContext, item.getValue()) : item.getValue().intValue();
            } else {
                params.height = item.isScaled() ? (int) SizeUtils.dipToPixels(mContext, item.getValue()) : item.getValue().intValue();
            }
            container.setLayoutParams(params);
        }
    }
}