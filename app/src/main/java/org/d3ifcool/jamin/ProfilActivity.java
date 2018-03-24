package org.d3ifcool.jamin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Fery Suyatna on 13/03/2018.
 */

public class ProfilActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        ArrayList<DataCustom> data = new ArrayList<>();
        data.add(new DataCustom("Weight  :"));
        data.add(new DataCustom("Genre   :"));
        data.add(new DataCustom("Wake up :"));
        data.add(new DataCustom("Sleep   :"));

        ListView listView = (ListView) findViewById(R.id.listProfil);
        ProfilAdapter profilAdapter = new ProfilAdapter(this, data);
        listView.setAdapter(profilAdapter);
    }
}


