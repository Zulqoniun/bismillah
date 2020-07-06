package com.imamfarisi.myalquran;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class Adapter extends ArrayAdapter<Item> {

    private Context context;
    private List<Item> listData;

    public Adapter(@NonNull Context context, int resource, List<Item> listData) {
        super(context, resource, listData);
        this.context = context;
        this.listData = listData;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View views = convertView;
        if (views == null)
            views = LayoutInflater.from(context).inflate(R.layout.item, parent, false);

        Item data = listData.get(position);

        TextView text = views.findViewById(R.id.text);
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "LPMQ IsepMisbah.ttf");

        text.setTypeface(typeface);
        text.setText(data.getAyatText());

        return views;
    }
}
