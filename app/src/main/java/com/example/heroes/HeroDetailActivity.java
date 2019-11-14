package com.example.heroes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class HeroDetailActivity extends AppCompatActivity {

    TextView textViewName;
    TextView textViewDescription;
    TextView textViewRanking;
    TextView textViewSuperPower;
    ImageView imageViewPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_detail);
        wireWidgets();
        Intent lastIntent = getIntent();
        Hero hero = lastIntent.getParcelableExtra(HeroesListActivity.EXTRA_HERO);
        textViewName.setText(hero.getName());
        textViewDescription.setText(hero.getDescription());
        textViewRanking.setText(String.valueOf(hero.getRanking()));
        textViewSuperPower.setText(hero.getSuperpower());
        int resourceImage = getResources().getIdentifier(hero.getImage(), "drawable", getPackageName());
        imageViewPicture.setImageDrawable(getResources().getDrawable(resourceImage));

    }

    private void wireWidgets() {
        textViewName = findViewById(R.id.textView_detail_name);
        textViewDescription = findViewById(R.id.textView_detail_description_text);
        textViewRanking = findViewById(R.id.textView_detail_rank_text);
        textViewSuperPower = findViewById(R.id.textView_detail_power_text);
        imageViewPicture = findViewById(R.id.imageView_detail_image);
    }
}