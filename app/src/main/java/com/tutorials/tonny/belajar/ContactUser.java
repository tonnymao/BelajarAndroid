package com.tutorials.tonny.belajar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Tonny on 6/1/2017.
 */

public class ContactUser extends Fragment implements View.OnClickListener{

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.contact_user, container, false);
        getActivity().setTitle("Contact List");
        return v;
    }

    @Override
    public void onClick(View v) {

    }
}
