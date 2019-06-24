package com.example.personaltrainer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

class Cycling_Fragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    WebView simpleWebView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_cycling, container, false);
        simpleWebView=view.findViewById(R.id.simpleWebView);
        // define static html text
        String customHtml ="<html><body><h1><font color=purple>Cycling\n\n</font></h1>" +
                "<p>Bicycling is another low impact, high-rewards activity for losing weight. Cycling can burn anywhere from 372 to over 1,100 calories per hour, depending on your weight, your speed and the terrain you're biking across.Unlike running, cycling is easy on the joints, and even the most out-of-shape beginner can hop on a bicycle and ride several miles without feeling like they've just been through the wringer. Outdoor cycling is best,because the varied terrain enables you to get a well-rounded workout that includes strengthening your lower body and getting a good cardiovascular workout.\n\n</p>" +
                "</body></html>";




        simpleWebView.loadData(customHtml, "text/html", "UTF-8"); // load html string data in a web view


        return view;
    }
}



