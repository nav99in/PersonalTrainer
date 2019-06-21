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

        String customHtml = "<html><body><h2>1. EAT FRUITS and VEGGIES</h2>" +
                "<p>Eating fruits and vegetables are of great help to human body.Loading on fruits and veggies will help you get a glowing skin.\n\n</p>" +
                "<h2>2. STAY HYDRATED</h2>" +
                "<p>Again staying hydrated is very important for your health.Drinking plenty of water helps your akin to stay hydrated and flush out toxins.\n\n</p>" +
                "<h2>3. SIP ON SOME TEA</h2>" +
                "<p>We are all aware of the benefits of green tea.Sipping some green tea will help your skin in many ways.\n\n</p>" +
                "<h2>4. MUNCH ON NUTS</h2>" +
                "<p>Eat nuts for a better improvement in skin condition.\n\n</p>" +
                "<h2>5. EXERCISE</h2>" +
                "<p>Modern doctors advise exercising to keep your muscles and joints healthy and toned, while helping you sweat out toxins. Exercise will also improve blood circulation, digestion, and give you a healthy blush!\n\n\n</p>" +
                "<h2>6. STAY STRESS FREE</h2>" +
                "<p>Stress is not good for you.Always try to stay stress free for a beautiful mind peace and healthy skin.\n\n</p>" +
                "<h2>7. MOISTURIZER TO RESCUE</h2>" +
                "<p>Always use moisturizer while stepping out from home to keep tan at bay and also use moisturizer at night for a well hydrated skin.\n\n</p>" +
                "</body></html>";

        simpleWebView.loadData(customHtml, "text/html", "UTF-8"); // load html string data in a web view






        return view;
    }
}
