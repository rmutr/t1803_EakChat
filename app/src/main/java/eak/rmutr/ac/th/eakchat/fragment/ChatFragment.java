package eak.rmutr.ac.th.eakchat.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import eak.rmutr.ac.th.eakchat.R;

/**
 * Created by Slump on 01/28/2018.
 */

public class ChatFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.flagment_chat, container, false);

        return view;
    }
}
