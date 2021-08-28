package com.meero.meeromessengerchat.Fragments;

import android.content.Context;
import android.content.Intent;

import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.meero.meeromessengerchat.databinding.FragmentCallsBinding;

public class CallsFragment extends Fragment {



    FragmentCallsBinding binding;
    Context ct;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentCallsBinding.inflate(inflater, container, false);
        ct = inflater.getContext();

            binding.phoneBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String getNumber = binding.etPhone.getText().toString();
                    String uri = "tel:" + getNumber.trim() ;
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(uri));
                    startActivity(intent);

                }
            });


        return binding.getRoot();
    }
}