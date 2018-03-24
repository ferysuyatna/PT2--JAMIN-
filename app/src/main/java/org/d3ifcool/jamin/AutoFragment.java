package org.d3ifcool.jamin;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Fery Suyatna on 13/03/2018.
 */

public class AutoFragment extends Fragment {

    private ImageButton imgBtn;
    private Boolean img = false;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_auto, container, false);

        imgBtn = (ImageButton) view.findViewById(R.id.buttonpower);

        imgBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(img){
                    imgBtn.setImageResource(R.drawable.off);
                } else {
                    imgBtn.setImageResource(R.drawable.auto);
                    Toast.makeText(getContext(),
                            "Masih dalam tahap pengembangan", Toast.LENGTH_SHORT).show();
                }
                img = !img;
            }
        });
        return view;
    }
}
