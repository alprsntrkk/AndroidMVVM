package com.alprsntrkk.AndroidMVVM.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.widget.TextView;

import com.alprsntrkk.AndroidMVVM.MyApp;
import com.alprsntrkk.AndroidMVVM.R;
import com.alprsntrkk.AndroidMVVM.viewmodel.PostViewModel;
import com.alprsntrkk.AndroidMVVM.entity.DtPost;

public class MainActivity extends AppCompatActivity {

    PostViewModel postViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        postViewModel = ((MyApp) getApplication()).postContainer.postViewModel;
        postViewModel.getPost().observe(this, new Observer<DtPost>() {
            @Override
            public void onChanged(DtPost dtPost) {
                ((TextView)findViewById(R.id.test)).setText(dtPost.title);
            }
        });
    }
}