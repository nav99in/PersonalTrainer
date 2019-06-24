package com.example.personaltrainer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

class Swimming_Fragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    WebView simpleWebView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_swimming, container, false);
        simpleWebView=view.findViewById(R.id.simpleWebView);
//        btnTest1=view.findViewById(R.id.button);
//
//        btnTest1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getActivity(), "clicked", Toast.LENGTH_SHORT).show();
//            }
//        });
        // define static html text
        String customHtml ="<html><body><h1><font color=purple>Swimming\n\n</font></h1>" +
                "<p>Vigorous swimming can burn anywhere from 400 to 700 calories an hour. All types of swimming are effective for helping you shed pounds, from a front crawl to a breast stroke or even the dog paddle. Swimming is a highly effective exercise for weight loss and toning. It's one of the lowest-impact exercises out there,and it strengthens, tones and conditions your whole body.\n\n</p>" +
                "</body></html>";



        simpleWebView.loadData(customHtml, "text/html", "UTF-8"); // load html string data in a web view


        return view;
    }
}



