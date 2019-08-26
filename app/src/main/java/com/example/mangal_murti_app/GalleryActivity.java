package com.example.mangal_murti_app;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

public class GalleryActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        recyclerView = findViewById(R.id.recycler_iew_for_gallery);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        databaseReference = FirebaseDatabase.getInstance().getReference().child("English").child("Gallery");
    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseRecyclerAdapter<ImageAndDescDataStorage, GalleryViewHolder> firebaseRecyclerAdapter =
                new FirebaseRecyclerAdapter<ImageAndDescDataStorage, GalleryViewHolder>(
                        ImageAndDescDataStorage.class,
                        R.layout.recycler_view_display_data,
                        GalleryViewHolder.class,
                        databaseReference
                ) {
                    @Override
                    protected void populateViewHolder(GalleryViewHolder viewHolder, ImageAndDescDataStorage model, int position) {
                        viewHolder.setDesc(model.getDesc());
                        viewHolder.setImage(model.getImage());
                    }
                };
        recyclerView.setAdapter(firebaseRecyclerAdapter);
    }

    public static class GalleryViewHolder extends RecyclerView.ViewHolder {

        View itemVew;

        public GalleryViewHolder(@NonNull View itemView) {
            super(itemView);

            this.itemVew = itemView;
        }

        public void setDesc(String desc) {
            TextView post_desc = itemVew.findViewById(R.id.text_view_for_recycler_view);
            desc = desc.replace("_b","\n");
            post_desc.setText(desc);
        }

        public void setImage(String image) {
            ImageView post_image = itemVew.findViewById(R.id.image_view_for_recycler_view);
            Picasso.get().load(image).into(post_image);
        }
    }
}
