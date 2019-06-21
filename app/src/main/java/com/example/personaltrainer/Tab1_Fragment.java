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

public class Tab1_Fragment extends Fragment {
    private static final String TAG = "Tab1_Fragment";
    Button btnTest1;
    WebView simpleWebView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1_fragment, container, false);
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
        String customHtml = "<html><body><h1><font color=red>Diet Plan 1\n\n</font></h1>" +
                "<p>Ohh that dress it's so pretty, I wish I could get one. Does this happens to you when you go out for shopping? You want to buy that dress but you know its too small for you. That's all right, here is a diet plan to help you attain a perfect size in matter of a month and then there will be no such dress or your favorite attire you wish to get but you just couldn't."+
                "This diet plan is very simple and helps you shed off those extra pounds. So let's get started... here's how you start your day for your journey of weight loss.</p>" +
                "<h2>BREAKFAST</h2>" +
                "<p> Before munching on anything drink one glass of Luke warm lemon water (made of 1 or 1/2 lemon) on empty stomach so as to detoxify your body and after half an hour or so you can eat fruits of your choice,but remember keep the quantity small. Fruits will help you fill up your stomach and provide energy you require. You can also eat either oats or munch on some dry fruits for your breakfast.\n\n</p>" +
                "<h2>LUNCH</h2>" +
                "<p>(Half or one) chapati/bread or brown rice (one cup), low-fat yogurt and one fruit (such as apple, orange). Don't forget to drink one glass of water before you have your lunch.\n\n</p>" +
                "<h2>DINNER</h2>" +
                "<p> You can drink soup, or eat half chapati/bread with vegetables either boiled or cooked in less oil and do have some salad without oil and other form of dressing.\n\n</p>" +
                "<h2>Note :</h2>" +
                "<p>This is how simple your diet is to make you shed those pounds and you even need not starve as sometimes you do while following the other strict diet plans. Following this diet will help you reach your goal and who knows you may end up shopping the perfect fit for yourself much more prettier than the dresses you once had deep love for.\n\n</p>" +
                "</body></html>";


        simpleWebView.loadData(customHtml, "text/html", "UTF-8"); // load html string data in a web view


        return view;
    }
}
