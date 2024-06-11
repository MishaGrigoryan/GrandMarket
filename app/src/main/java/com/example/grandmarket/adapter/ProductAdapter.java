package com.example.grandmarket.adapter;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grandmarket.R;
import com.example.grandmarket.Stranicatel1;
import com.example.grandmarket.data.model.Product;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    Context context;
    List<Product> products;

    public ProductAdapter(Context context, List<Product> products) {
        this.context = context;
        this.products = products;
    }




    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View productItems = LayoutInflater.from(context).inflate(R.layout.productdesign,parent, false);
        return new ProductViewHolder(productItems);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.cardGlav.setText(products.get(position).getGlav());
        holder.CardPob.setText(products.get(position).getHarakt());
        holder.Cardcena.setText(products.get(position).getCena());

        holder.Kupit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        holder.cardisb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        int imageid = context.getResources().getIdentifier(products.get(position).getIm(),"drawable", context.getPackageName());
        int imagebig1 = context.getResources().getIdentifier(products.get(position).getImbig1(),"drawable", context.getPackageName());
        int imagebig2 = context.getResources().getIdentifier(products.get(position).getImbig2(),"drawable", context.getPackageName());
        int imagebig3 = context.getResources().getIdentifier(products.get(position).getImbig3(),"drawable", context.getPackageName());
        int imagebig4 = context.getResources().getIdentifier(products.get(position).getImbig4(),"drawable", context.getPackageName());
        int imagebig5 = context.getResources().getIdentifier(products.get(position).getImbig5(),"drawable", context.getPackageName());
        int imagebig6 = context.getResources().getIdentifier(products.get(position).getImbig6(),"drawable", context.getPackageName());
        int imagebig7 = context.getResources().getIdentifier(products.get(position).getImbig7(),"drawable", context.getPackageName());
        int imagebig8 = context.getResources().getIdentifier(products.get(position).getImbig8(),"drawable", context.getPackageName());
        int buttoncvet1 = context.getResources().getIdentifier(products.get(position).getBg1on(),"drawable", context.getPackageName());
        int buttoncvet2 = context.getResources().getIdentifier(products.get(position).getBg1off(),"drawable", context.getPackageName());
        int buttoncvet3 = context.getResources().getIdentifier(products.get(position).getBg2on(),"drawable", context.getPackageName());
        int buttoncvet4 = context.getResources().getIdentifier(products.get(position).getBg2off(),"drawable", context.getPackageName());
        holder.cardim.setImageResource(imageid);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Stranicatel1.class);
                intent.putExtra("Id", products.get(position).getId());
                intent.putExtra("Glav1", products.get(position).getGlav());
                intent.putExtra("Glav2", products.get(position).getGlav2());
                intent.putExtra("Opis", products.get(position).getOpis());
                intent.putExtra("Haract", products.get(position).getHarakt());
                intent.putExtra("Cena1", products.get(position).getCena());
                intent.putExtra("Cena2", products.get(position).getCena2());
                intent.putExtra("image", imageid);
                intent.putExtra("imagebig1", imagebig1);
                intent.putExtra("imagebig2", imagebig2);
                intent.putExtra("imagebig3", imagebig3);
                intent.putExtra("imagebig4", imagebig4);
                intent.putExtra("imagebig5", imagebig5);
                intent.putExtra("imagebig6", imagebig6);
                intent.putExtra("imagebig7", imagebig7);
                intent.putExtra("imagebig8", imagebig8);
                intent.putExtra("buttoncvet1_on", buttoncvet1);
                intent.putExtra("buttoncvet1_off", buttoncvet2);
                intent.putExtra("buttoncvet2_on", buttoncvet3);
                intent.putExtra("buttoncvet2_off", buttoncvet4);

                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public static final class ProductViewHolder extends  RecyclerView.ViewHolder{


        TextView cardGlav;
        TextView CardPob;
        TextView Cardcena;
        ImageView cardim;
        AppCompatButton Kupit;
        AppCompatButton cardisb1;



        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            cardGlav = itemView.findViewById(R.id.cardGlav);
            CardPob = itemView.findViewById(R.id.CardPob);
            Cardcena = itemView.findViewById(R.id.Cardcena);
            cardim = itemView.findViewById(R.id.cardim);
            Kupit = itemView.findViewById(R.id.cardbut1);
            cardisb1 = itemView.findViewById(R.id.cardisb1);
        }
    }
}
