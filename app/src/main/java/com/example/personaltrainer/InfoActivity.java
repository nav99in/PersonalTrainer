package com.example.personaltrainer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity {
    private static final String EXTRA_TITLE_RES = "title_resource";

    public static void start(Context context, @StringRes int titleResource) {
        Intent intent = new Intent(context, InfoActivity.class);
        intent.putExtra(EXTRA_TITLE_RES, titleResource);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        int titleResource = getIntent().getIntExtra(EXTRA_TITLE_RES, 0);
        if (titleResource == 0) {
            throw new IllegalArgumentException("A section title is required");
        }

        setTitle(titleResource);
    }
}
