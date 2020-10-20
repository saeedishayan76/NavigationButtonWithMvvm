package com.example.navigationtestmvvm.viewModel;

import android.graphics.Bitmap;
import android.view.View;

import androidx.core.content.ContextCompat;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.navigationtestmvvm.model.ModelImage;

public class FragmentsViewModel extends ViewModel {

    private final MutableLiveData<Bitmap> imgEncodeData = new MutableLiveData<>();

    public void setImageEncode(Bitmap imageBitmap)
    {
        imgEncodeData.setValue(imageBitmap);
    }

    public MutableLiveData<Bitmap> getImgEncodeData() {
        return imgEncodeData;
    }
    public Bitmap getImage()
    {
        return imgEncodeData.getValue();
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }
}
