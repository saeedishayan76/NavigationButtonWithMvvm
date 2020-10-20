package com.example.navigationtestmvvm.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.navigationtestmvvm.R;
import com.example.navigationtestmvvm.databinding.FragmentSecoundBinding;
import com.example.navigationtestmvvm.viewModel.FragmentsViewModel;


public class SecoundFragment extends Fragment {

    private FragmentSecoundBinding binding;
    private ImageView imgSecound;
    private FragmentsViewModel fragmentsViewModel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_secound, container, false);
        imgSecound = binding.imgSecoundragment;
        fragmentsViewModel = ViewModelProviders.of(getParentFragment()).get(FragmentsViewModel.class);
        binding.setData(fragmentsViewModel);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
    }
}