package com.example.mangal_murti_app;

import android.content.Intent;
import android.media.Image;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);

        ImageButton specialTherapyButton = findViewById(R.id.image_button_special_therapy);
        ImageButton newsAndEventsButton = findViewById(R.id.image_button_news_and_events);
        ImageButton activitiesButton  = findViewById(R.id.image_button_activities);
        ImageButton trustiesButton = findViewById(R.id.image_button_trusties);
        ImageButton hostelFacilitiesButton = findViewById(R.id.image_button_hostel_facilities);
        ImageButton galleryButton = findViewById(R.id.image_button_gallery);
        ImageButton donateAtButton = findViewById(R.id.image_button_donate_us);
        ImageButton contactUsButton = findViewById(R.id.image_button_contact_us);

        specialTherapyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuScreenActivity.this, SpecialTherapyActivity.class));
            }
        });

        newsAndEventsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuScreenActivity.this, NewsAndEventsActivity.class));
            }
        });

        hostelFacilitiesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuScreenActivity.this, HostelFacilitiesActivity.class));
            }
        });

        galleryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuScreenActivity.this, GalleryActivity.class));
            }
        });

        activitiesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuScreenActivity.this, OtherActivitiesActivity.class));
            }
        });

        trustiesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuScreenActivity.this, TrustiesActivity.class));
            }
        });

        donateAtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuScreenActivity.this, DonateUsActivity.class));
            }
        });

        contactUsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuScreenActivity.this, ContactUsActivity.class));
            }
        });
    }
}
