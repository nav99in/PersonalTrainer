package com.example.personaltrainer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

class Jumprope_Fragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    WebView simpleWebView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_juomprope, container, false);
        simpleWebView=view.findViewById(R.id.simpleWebView);
        // define static html text
        String customHtml ="<html><body><h1><font color=purple>Jumping Rope\n\n</font></h1>" +
                "<p>Just ten minutes of rope jumping is worth an eight minute mile when it comes to cardio benefits and calorie burning.An hour of jumping rope burns over 800calories and works the arms, legs, and core, as well as strengthens bones and joints. A great 13-minute rope-jumping workout involves one minute of intense activity followed by one minute of rest. Start with the basic jump, during which both feet push off and land at the same time.Next, alternate your feet. Follow that with a combination jump during which you do the basic jump for ten turns of the rope followed by alternating your feet for ten turns.Finally, perform the high step:Alternate your feet, but bring your knees up to a 90-degree angle with each jump. End the workout with an endurance round during which you jump rope in your favorite way for at least five minutes.\n\n</p>" +
                "</body></html>";


        simpleWebView.loadData(customHtml, "text/html", "UTF-8"); // load html string data in a web view


        return view;
    }
}






