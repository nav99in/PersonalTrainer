package com.example.personaltrainer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class Walking_Fragment extends Fragment {
    WebView simpleWebView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_walking_, container, false);

        simpleWebView=view.findViewById(R.id.simpleWebView);
        // define static html text
        String customHtml = "<html><body><h1><font color=purple>Walking\n\n</font></h1>" +
                "<p>Walking is an ideal exercise for weight loss: It doesn't require any equipment, other than a decent pair of walking shoes, and you don't need a gym membership to do it. Depending on how much you weigh, walking at a pace of four miles per hour will burn between 5 and 8 calories every minute, or between 225 and 360 calories for a 45-minute walk.\n\n</p>" +
                "</body></html>";



        simpleWebView.loadData(customHtml, "text/html", "UTF-8"); // load html string data in a web view


        return view;

    }
}
