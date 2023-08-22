package com.example.myportfolio;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myportfolio.R;

import org.w3c.dom.Text;

import java.util.List;

public class portfolioFragment extends Fragment {
    TextView classroom_app_click, ott_click, bus_management_click;

    public portfolioFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_project, container, false);

        classroom_app_click = view.findViewById(R.id.classroom_app_click);
        ott_click = view.findViewById(R.id.ott_click);
        bus_management_click = view.findViewById(R.id.bus_management_click);

        classroom_app_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://github.com/Sandesh032/O2-Android-App");
            }
        });

        ott_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://github.com/Sandesh032/OTT-Subscription-Management-using-OOP-in-python");
            }
        });

        bus_management_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://github.com/Sandesh032/Bus-Management-System-Using-CPP-");
            }
        });

        return view;
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}