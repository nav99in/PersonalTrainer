package com.example.personaltrainer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

class Running_Fragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    WebView simpleWebView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_running, container, false);
        simpleWebView=view.findViewById(R.id.simpleWebView);
        // define static html text
        String customHtml ="<html><body><h1><font color=purple>Running\n\n</font></h1>" +
                "<p>If you're one of the many people who love to run, you're in luck. Running burns about 600 calories per hour, helps build strong bones and connective tissue and gets your heart pumping at a healthy rate to help preventheart disease, stroke and certain cancers.The only equipment running requires is a good pair of shoes to protect your joints and, if it helps you keep the pace and maintain motivation, an iPod with your favorite tunes.Interval training can bump up the calories you burn on your daily run. Also called speed work, interval training involves short spurts, usually between 30 seconds and two minutes, of running at top speed. Intervals burn a large number of calories in a short amount of time, improve your resting metabolism to help you burn more calories during the day,and increase your muscle mass.\n\n</p>" +
                "</body></html>";



        simpleWebView.loadData(customHtml, "text/html", "UTF-8"); // load html string data in a web view


        return view;
    }
}



