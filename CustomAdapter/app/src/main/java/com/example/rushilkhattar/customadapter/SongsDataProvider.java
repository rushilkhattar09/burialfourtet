package com.example.rushilkhattar.customadapter;

/**
 * Created by rushilkhattar on 28/06/17.
 */

public class SongsDataProvider {

private int song_img_resource;
private String song_names;
private String song_ranks;

    public SongsDataProvider(int song_img_resource,String song_names,String song_ranks)
    {
        this.setSong_img_resource(song_img_resource);
        this.setSong_names(song_names);
        this.setSong_ranks(song_ranks);
    }


    public int getSong_img_resource() {
        return song_img_resource;
    }

    public void setSong_img_resource(int song_img_resource) {
        this.song_img_resource = song_img_resource;
    }

    public String getSong_names() {
        return song_names;
    }

    public void setSong_names(String song_names) {
        this.song_names = song_names;
    }

    public String getSong_ranks() {
        return song_ranks;
    }

    public void setSong_ranks(String song_ranks) {
        this.song_ranks = song_ranks;
    }
}
