package com.example.myportfolio;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class profileFragment extends Fragment {
    ImageView github, insta, linkedin, facebook;

    public profileFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        github = view.findViewById(R.id.github_logo);
        insta = view.findViewById(R.id.instagram_logo);
        facebook = view.findViewById(R.id.facebook_logo);
        linkedin = view.findViewById(R.id.linked_logo);

        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://github.com/Sandesh032");
            }
        });

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/sandeshpandey22/");
            }
        });

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.linkedin.com/in/sandesh-pandey-sp2061/");
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/p.sandesh61");
            }
        });

        return view;
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}