package com.example.rushilkhattar.customadapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rushilkhattar on 28/06/17.
 */

public class SongsAdapter extends ArrayAdapter {

    List list = new ArrayList();

    public SongsAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);

    }

    static class DataHandler {
        ImageView image;
        TextView song;
        TextView ranking;
    }

    @Override
    public void add(@Nullable Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return this.list.size();
    }


    @Override

    public Object getItem(int position) {

        return this.list.get(position);


    }



    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        row = convertView;
        DataHandler handler;

        if (convertView == null) {

            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.row_layout,parent,false);
            handler = new DataHandler();
            handler.image =  row.findViewById(R.id.img);
            handler.song= row.findViewById(R.id.song_name);
            handler.ranking=row.findViewById(R.id.song_rank);
            row.setTag(handler);

        }
        else
        {
            handler = (DataHandler) row.getTag();
         }

         SongsDataProvider dataProvider;
        dataProvider = (SongsDataProvider) this.getItem(position);
        handler.image.setImageResource(dataProvider.getSong_img_resource());
        handler.song.setText(dataProvider.getSong_names());
        handler.ranking.setText(dataProvider.getSong_ranks());



        return row;
    }
}
