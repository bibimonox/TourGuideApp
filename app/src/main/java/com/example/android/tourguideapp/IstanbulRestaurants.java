package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class IstanbulRestaurants extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.text_list);

        final ArrayList<Text>texts=new ArrayList<>();
        texts.add(new Text(R.string.saray_erzurum,R.string.saray_erzurum_address,R.drawable.saray_erzurum));
        texts.add(new Text(R.string.emin_baba,R.string.emin_baba_address,R.drawable.emin_baba));
        texts.add(new Text(R.string.kolcuoglu_restorant,R.string.kolcuoglu_restaurant_address,R.drawable.kolcuoglu_restorant));
        texts.add(new Text(R.string.oz_kilis,R.string.oz_kilis_address,R.drawable.oz_kilis));
        texts.add(new Text(R.string.develi,R.string.develi_address,R.drawable.develi));
        texts.add(new Text(R.string.karadeniz_pide,R.string.karadeniz_pide_address,R.drawable.karadeniz_pide));
        texts.add(new Text(R.string.orjinal_bafra_pide,R.string.orjinal_bafra_pide_address,R.drawable.orjinal_bafra_pide));

        TextAdapter adapter = new TextAdapter(this,texts);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);



    }




}
