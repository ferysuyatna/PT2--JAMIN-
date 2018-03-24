package org.d3ifcool.jamin;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Fery Suyatna on 13/03/2018.
 */

public class ManualFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_manual, container, false);
        FloatingActionButton fab = (FloatingActionButton)view.findViewById(R.id.fab);
        final TextView hint = (TextView)view.findViewById(R.id.hint);
        final LinearLayout body = (LinearLayout)view.findViewById(R.id.body);
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                View mView = getActivity().getLayoutInflater().inflate(R.layout.menu_tambahan, null);
                ImageButton btn_250ml = (ImageButton) mView.findViewById(R.id.btn250ML);
                ImageButton btn_500ml = (ImageButton) mView.findViewById(R.id.btn500ML);
                ImageButton btn_750ml = (ImageButton) mView.findViewById(R.id.btn750ML);
                ImageButton btn_1l = (ImageButton) mView.findViewById(R.id.btn1L);
                ImageButton btn_2l = (ImageButton) mView.findViewById(R.id.btn2L);
                btn_250ml.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        hint.setVisibility(View.INVISIBLE);
                        ImageButton b = new ImageButton(view.getContext());
                        b.setBackgroundResource(R.drawable.gelas1);
                        b.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.
                                WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                        body.addView(b);
                        Toast.makeText(getContext(),
                                "Masih dalam tahap pengembangan", Toast.LENGTH_SHORT).show();
                    }
                });
                btn_500ml.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        hint.setVisibility(View.INVISIBLE);
                        ImageButton b = new ImageButton(view.getContext());
                        b.setBackgroundResource(R.drawable.gelas2);
                        b.setLayoutParams(new LinearLayout.LayoutParams
                                (ViewGroup.LayoutParams.
                                        WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                        body.addView(b);
                        Toast.makeText(getContext(),
                                "Masih dalam tahap pengembangan", Toast.LENGTH_SHORT).show();
                    }
                });
                btn_750ml.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        hint.setVisibility(View.INVISIBLE);
                        ImageButton b = new ImageButton(view.getContext());
                        b.setBackgroundResource(R.drawable.gelas3);
                        b.setLayoutParams(new LinearLayout.LayoutParams
                                (ViewGroup.LayoutParams.
                                        WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                        body.addView(b);
                        Toast.makeText(getContext(),
                                "Masih dalam tahap pengembangan", Toast.LENGTH_SHORT).show();
                    }
                });
                btn_1l.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        hint.setVisibility(View.INVISIBLE);
                        ImageButton b = new ImageButton(view.getContext());
                        b.setBackgroundResource(R.drawable.gelas4);
                        b.setLayoutParams(new LinearLayout.LayoutParams
                                (ViewGroup.LayoutParams.
                                        WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                        body.addView(b);
                        Toast.makeText(getContext(),
                                "Masih dalam tahap pengembangan", Toast.LENGTH_SHORT).show();
                    }
                });
                btn_2l.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        hint.setVisibility(View.INVISIBLE);
                        ImageButton b = new ImageButton(view.getContext());
                        b.setBackgroundResource(R.drawable.gelas5);
                        b.setLayoutParams(new LinearLayout.LayoutParams
                                (ViewGroup.LayoutParams.
                                        WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                        body.addView(b);
                        Toast.makeText(getContext(),
                                "Masih dalam tahap pengembangan", Toast.LENGTH_SHORT).show();
                    }
                });
                BottomSheetDialog dialog = new BottomSheetDialog(view.getContext());
                dialog.setContentView(mView);
                dialog.show();
            }
        });
        return view;
    }
}

