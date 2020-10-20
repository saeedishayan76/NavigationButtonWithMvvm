package com.example.navigationtestmvvm.utils;

import android.graphics.Bitmap;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class BindingAdapter {

    @androidx.databinding.BindingAdapter("image")
    public static void setImage(ImageView imgView, Bitmap imgEncode)
    {
       imgView.setImageBitmap(imgEncode);
    }
}
