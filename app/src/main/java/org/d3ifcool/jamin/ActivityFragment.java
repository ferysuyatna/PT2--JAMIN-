package org.d3ifcool.jamin;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Fery Suyatna on 13/03/2018.
 */

public class ActivityFragment extends Fragment {

    private Button btnActivate;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_activity, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listview);

        ArrayList<DataCustom> data = new ArrayList<>();
        data.add(new DataCustom("Olahraga", R.drawable.olahraga));
        data.add(new DataCustom("Sekolah", R.drawable.sekolah));
        data.add(new DataCustom("Kerja", R.drawable.kerja));
        data.add(new DataCustom("Liburan", R.drawable.liburan));

        ActivityAdapter activityAdapter = new ActivityAdapter(getActivity(), data);
        listView.setAdapter(activityAdapter);

        btnActivate = (Button) view.findViewById(R.id.activity_btn);
        btnActivate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),
                        "Masih dalam tahap pengembangan", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }


}