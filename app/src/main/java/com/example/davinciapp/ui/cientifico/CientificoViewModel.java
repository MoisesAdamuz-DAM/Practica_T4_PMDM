package com.example.davinciapp.ui.cientifico;

import androidx.lifecycle.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CientificoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CientificoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Estudios Científicos");
    }

    public LiveData<String> getText() {
        return mText;
    }
}