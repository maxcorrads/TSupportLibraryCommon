package it.matteocorradin.tsupportlibrarycommon.adapter.holder;

import android.view.View;
import android.widget.TextView;

import it.matteocorradin.tsupportlibrary.adapter.HomeAdapter;
import it.matteocorradin.tsupportlibrary.adapter.holder.ViewHolder;
import it.matteocorradin.tsupportlibrary.adapter.model.AdapterDataGenericElement;
import it.matteocorradin.tsupportlibrarycommon.R;
import it.matteocorradin.tsupportlibrarycommon.adapter.model.AdapterDataText;
import it.matteocorradin.tsupportlibrarycommon.adapter.model.text.TextValue;

/**
 * Created by matteocorradin on 01/06/19.
 */

public class ViewHolderText extends ViewHolder {

    protected final TextView textView;

    public ViewHolderText(View view) {
        super(view);
        textView = view.findViewById(R.id.row_text);
    }

    @Override
    public void bind(AdapterDataGenericElement generic, HomeAdapter homeAdapter) {
        super.bind(generic, homeAdapter);
        if (generic instanceof AdapterDataText) {
            AdapterDataText item = (AdapterDataText) generic;
            TextValue textValue = item.getValue();
            textView.setPadding(textValue.getPaddingLeft(), textValue.getPaddingTop(), textValue.getPaddingRight(), textValue.getPaddingBottom());
            textView.setText(textValue.getText());
            textView.setTextColor(textValue.getTextColor());
            if (textValue.isClickWrap()) {
                textView.setOnClickListener(textValue.getOnClickListener());
            } else {
                itemView.setOnClickListener(textValue.getOnClickListener());
            }
            textView.setTypeface(textValue.getTypeface());
            textView.setGravity(textValue.getGravity());
            textView.setTextSize(textValue.getSizeUnit(), textValue.getSize());
        }
    }

}