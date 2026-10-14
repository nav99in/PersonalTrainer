package com.example.personaltrainer.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {

    private final MutableLiveData<String> mText = new MutableLiveData<>();

    public void setIndex(int index) {
        mText.setValue("Hello world from section: " + index);
    }

    public LiveData<String> getText() {
        return mText;
    }
}