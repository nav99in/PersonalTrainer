package com.example.personaltrainer;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Tab3_Fragment extends Fragment {
    private static final String TAG = "Tab1_Fragment";
    Button btnTest3;
    WebView simpleWebView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab3_fragment, container, false);
        simpleWebView=view.findViewById(R.id.simpleWebView);

//        btnTest3=view.findViewById(R.id.button3);
//
//        btnTest3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getActivity(), "clicked", Toast.LENGTH_SHORT).show();
//            }
//        });


        // define static html text

        String customHtml = "<html><body><h1><font color=red>Diet Plan 3\n\n</font></h1>" +
                "<p>Cucumbers make tasty and filling salads that can keep you going all along the day. Mix 2 lbs of cucumbers with a pinch of salt, a teaspoon of herbs such as oregano,parsley and dill, and olive oil to make a delicious salad for your cucumber diet.Besides the health benefits of cucumbers, the herbs are rich in vitamins and minerals that provide essential nourishment to the body. It works as a fantastic natural skin care product, which can instantly brighten up your skin and eyes. Here's an idea for a standard cucumber diet.\n\n</p>" +
                "<h2><font color=purple>The Cucumber Diet.\n\n</font></h2>" +
                "<p><h4><font color=blue>Breakfast-</font></h4> 1 bowl of cucumber salad, 1 cup of tea, and a toast of wheat bread.\n\n"+
                "<h4><font color=blue>Lunch-</font></h4> Chapati/Bread, a bowl of cucumber salad.\n\n"+
                "<h4><font color=blue>Dinner-</font></h4> Only salad.\n\n</p>" +
                "</body></html>";

        simpleWebView.loadData(customHtml, "text/html", "UTF-8"); // load html string data in a web view






        return view;
    }
}
