package org.d3ifcool.jamin;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Fery Suyatna on 13/03/2018.
 */

public class ProfilAdapter extends ArrayAdapter<DataCustom> {

    public ProfilAdapter(@NonNull Context context, @NonNull List objects) {
        super(context, 0, objects);
    }
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listViewItem = convertView;
        if(listViewItem == null ){
            listViewItem = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_profil, parent, false);
        }
        DataCustom currentDataCustom = getItem(position);
        TextView profilTextView = (TextView) listViewItem.findViewById(R.id.text1);
        profilTextView.setText(currentDataCustom.getMlist());
        return listViewItem;
    }
}
