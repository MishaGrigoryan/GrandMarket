package com.example.grandmarket.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grandmarket.R;
import com.example.grandmarket.data.model.Product;
import com.example.grandmarket.data.model.Product2;

import java.util.List;

public class CastAdapter extends RecyclerView.Adapter<CastAdapter.CastViewHolder> {

    Context context;
    List<Product2> Productcast;

    public CastAdapter(Context context, List<Product2> productcast) {
        this.context = context;
        Productcast = productcast;
    }

    @NonNull
    @Override
    public CastViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View productcastitems = LayoutInflater.from(context).inflate(R.layout.castitemdesign,parent,false);

        return new CastViewHolder(productcastitems);
    }

    @Override
    public void onBindViewHolder(@NonNull CastViewHolder holder, int position) {
        holder.cartGlav.setText(Productcast.get(position).getGlavcast());
        holder.cartcena.setText(Productcast.get(position).getCenacast());
        int imageid = context.getResources().getIdentifier(Productcast.get(position).getImcast(),"drawable", context.getPackageName());
        holder.cartim.setImageResource(imageid);
    }

    @Override
    public int getItemCount() {
        return Productcast.size();
    }

    public static final class CastViewHolder extends RecyclerView.ViewHolder{
        TextView cartGlav;
        TextView cartcena;
        ImageView cartim;
        public CastViewHolder(@NonNull View itemView) {

            super(itemView);
            cartGlav = itemView.findViewById(R.id.cardGlav);
            cartcena = itemView.findViewById(R.id.Cardcena);
            cartim = itemView.findViewById(R.id.cardim);
        }
    }
}
