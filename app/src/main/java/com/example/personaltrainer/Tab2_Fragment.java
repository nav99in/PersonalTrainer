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

public class Tab2_Fragment extends Fragment {
    private static final String TAG = "Tab1_Fragment";
    Button btnTest2;
    WebView simpleWebView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab2_fragment, container, false);
        simpleWebView=view.findViewById(R.id.simpleWebView);
//        btnTest2=view.findViewById(R.id.button2);
//
//        btnTest2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getActivity(), "clicked", Toast.LENGTH_SHORT).show();
//            }
//        });

        // define static html text
        String customHtml = "<html><body>   <h1><font color=red>Diet Plan 2\n\n</font></h1>" +
                "<p><h2><font color=purple>Simple cleanse diet."+
                "[Do drink plenty of water during your diet plan]\n\n</font></h2></p>" +
                "<h2>Day 1</h2>" +
                "<p><h4><font color=blue>Breakfast</font>-</h4> Oatmeal, 1 apple."+
                "<h4><font color=blue>Snack-</font></h4> green tea with 1/2 lemon and ginger."+
                "<h4><font color=blue>Lunch-</font></h4> tomato soup and one cup of fresh fruits of your choice."+
                "<h4><font color=blue>Snack-</font></h4> raw veggies such as cucumber, carrots."+
                "<h4><font color=blue>Dinner-</font></h4> one cup brown rice or chapati/bread, spinach, lemon juice.\n\n</p>" +
        "<h2>Day 2</h2>" +
                "<p><h4><font color=blue>Breakfast-</font></h4> Fresh fruits,handful of dry fruits."+
                "<h4><font color=blue>Snack-</font></h4> green tea with lemon and ginger."+
                "<h4><font color=blue>Lunch-</font></h4> vegetable soup, one or two slice of brown bread, 1 citrus fruit."+
                "<h4><font color=blue>Snack-</font></h4> one apple."+
                "<h4><font color=blue>Dinner-</font></h4> steamed vegetables (broccoli, cauliflower, carrots etc).\n\n</p>" +
        "<h2>Day 3</h2>" +
                "<p><h4><font color=blue>Breakfast-</font></h4> one glass of milk, dry fruits."+
                "<h4><font color=blue>Snack-</font></h4> green tea."+
                "<h4><font color=blue>Lunch-</font></h4> one chapati/bread, sprouts and tomato soup."+
                "<h4><font color=blue>Snack-</font></h4> watermelon or any other fruit."+
                "<h4><font color=blue>Dinner-</font></h4> plain cottage cheese, chapati/bread, salad.</p>" +
        "</body></html>";

        simpleWebView.loadData(customHtml, "text/html", "UTF-8"); // load html string data in a web view


        return view;
    }
}
