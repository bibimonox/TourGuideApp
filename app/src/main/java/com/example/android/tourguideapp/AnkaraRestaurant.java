package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AnkaraRestaurant extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_list);

        final ArrayList<Text> texts=new ArrayList<>();
        texts.add(new Text(R.string.masabasi_kebapcisi,R.string.masabasi_kebapcisi_address,R.drawable.masabasi_kebapcisi));
        texts.add(new Text(R.string.gunaydin_kebap_restaurant,R.string.gunaydin_kebap_restaurant_address,R.drawable.gunaydin_kebap_restaurant));
        texts.add(new Text(R.string.muslum_kebap,R.string.muslum_kebap_address,R.drawable.muslum_kebap));
        texts.add(new Text(R.string.duveroglu,R.string.duveroglu_address,R.drawable.duveroglu));
        texts.add(new Text(R.string.nusr_et,R.string.nusr_et_address,R.drawable.nusr_et));
        texts.add(new Text(R.string.amarillo_restaurant_and_bar,R.string.amarillo_restaurant_and_bar_address,R.drawable.amarillo_restaurant_and_bar));
        texts.add(new Text(R.string.adana_sofrasi,R.string.adana_sofrasi_address,R.drawable.adana_sofrasi));

        TextAdapter adapter = new TextAdapter(this,texts);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);



    }
}
