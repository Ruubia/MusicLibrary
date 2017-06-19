package com.example.bea.musiclibrary;

import android.view.View;
import android.widget.Toast;

public class MusicClickListener implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(),
                "Open the list of music", Toast.LENGTH_SHORT).show();
    }
}
