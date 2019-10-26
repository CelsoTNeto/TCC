package com.example.olx_app.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
<<<<<<< HEAD
        mText.setValue("This is home fragment");
=======
        mText.setValue("A ideia é colocar uma recycle view aqui");
>>>>>>> a6d559837fa513a8f52a9c516a2f824cde01e576
    }

    public LiveData<String> getText() {
        return mText;
    }
}