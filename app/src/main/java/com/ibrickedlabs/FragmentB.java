package com.ibrickedlabs;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ibrickedlabs.scrolltab.R;

/**
 * Created by RajeshAatrayan on 12-09-2018.
 */

public class FragmentB extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.frag_a,container,false);
        TextView textView=view.findViewById(R.id.fragText);
        textView.setText("FRAGMENT-B");
        return view;
    }
}
