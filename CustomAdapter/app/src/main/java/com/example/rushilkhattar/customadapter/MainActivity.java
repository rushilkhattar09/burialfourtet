package com.example.rushilkhattar.customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    ListView listView;
    int []song_img_resource={R.drawable.ic_library_add_black_24dp,R.drawable.ic_library_add_black_24dp,
            R.drawable.ic_library_add_black_24dp,R.drawable.ic_library_add_black_24dp,
            R.drawable.ic_library_add_black_24dp,R.drawable.ic_library_add_black_24dp,
            R.drawable.ic_library_add_black_24dp,R.drawable.ic_library_add_black_24dp,
            R.drawable.ic_library_add_black_24dp,R.drawable.ic_library_add_black_24dp,
            R.drawable.ic_library_add_black_24dp , R.drawable.ic_library_add_black_24dp,
            R.drawable.ic_library_add_black_24dp,



    };

    String [] song_names;
    String [] song_ranks;
    SongsAdapter adapter;
    SongsDataProvider adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list_view);
        song_names = getResources().getStringArray(R.array.song_names);
        song_ranks = getResources().getStringArray(R.array.rank);
        adapter = new SongsAdapter(getApplicationContext(),R.layout.row_layout);
        listView.setAdapter(adapter);
        int i=0;
        for(String songs:song_names)
        {
            SongsDataProvider songsDataProvider = new SongsDataProvider(song_img_resource[i],songs,song_ranks[i]);
            adapter.add(songsDataProvider);
            i++;
        }

    }
}
