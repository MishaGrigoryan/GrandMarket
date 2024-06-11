package com.example.grandmarket;

import androidx.appcompat.widget.AppCompatButton;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.grandmarket.data.model.Order;
import com.example.grandmarket.data.model.UserLoginned;
import com.example.grandmarket.data.model.Users;

import java.util.ArrayList;
import java.util.List;

public class BlankFragment extends Fragment {

    private BlankViewModel mViewModel;
    String Name;
    String City;
    int Id;
    boolean Log = false;
    TextView Nameuser;
    TextView Cityuser;
    private AppCompatButton BtnLog;
    private AppCompatButton Isbr;
    private AppCompatButton Sravnenie;
    private AppCompatButton Status;
    public static BlankFragment newInstance() {
        return new BlankFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_blank,container,false);

        Nameuser = v.findViewById(R.id.NameUser);
        Cityuser = v.findViewById(R.id.CityUser);
        BtnLog = v.findViewById(R.id.loginbut);
        Isbr = v.findViewById(R.id.IsbranBut);
        Sravnenie = v.findViewById(R.id.Sravnenie);
        Status = v.findViewById(R.id.Status);
        BtnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),LoginStranica.class);
                getActivity().startActivity(intent);
            }

        });
        Isbr .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Isbrannoe2.class);
                getActivity().startActivity(intent);
            }

        });
        Sravnenie .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Sravnenietovarov.class);
                getActivity().startActivity(intent);
            }

        });
        Status .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Status.class);
                getActivity().startActivity(intent);
            }

        });

        Nameuser.setText(UserLoginned.UserNamelog.toString());
        Cityuser.setText(UserLoginned.UserCitylog.toString());





        if(UserLoginned.TF.contains(3)){
            Log=true;
        }

        if (Log==false){
            BtnLog.setVisibility(View.VISIBLE);
            Nameuser.setVisibility(View.GONE);
            Cityuser.setVisibility(View.GONE);
        }
        if(Log==true){
            BtnLog.setVisibility(View.GONE);
            Nameuser.setVisibility(View.VISIBLE);
            Cityuser.setVisibility(View.VISIBLE);
        }













        return v;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(BlankViewModel.class);
        // TODO: Use the ViewModel
    }

}