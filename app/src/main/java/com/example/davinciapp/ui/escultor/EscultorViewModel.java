package com.example.davinciapp.ui.escultor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EscultorViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EscultorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Escultor");
    }

    public LiveData<String> getText() {
        return mText;
    }
}