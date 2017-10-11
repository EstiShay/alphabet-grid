package com.epicodus.alphabet;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class AlphabetAdapter extends BaseAdapter {
    private Context mContext;
    private String[] mLetters;

    public AlphabetAdapter (Context context, String[] letters){
        this.mContext = context;
        this.mLetters = letters;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
