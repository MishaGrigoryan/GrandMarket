package com.example.grandmarket.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grandmarket.R;
import com.example.grandmarket.Stranicatel1;
import com.example.grandmarket.adapter.CastAdapter;
import com.example.grandmarket.adapter.ProductAdapter;
import com.example.grandmarket.data.model.Order;
import com.example.grandmarket.data.model.Product;
import com.example.grandmarket.data.model.Product2;
import com.example.grandmarket.databinding.FragmentNotificationsBinding;
import com.example.grandmarket.ui.home.HomeFragment;

import java.util.ArrayList;
import java.util.List;

public class NotificationsFragment extends Fragment {
    List<Product2> Productcastlist = new ArrayList<>();
    static List<Product> productlist = new ArrayList<>();
    static List<Product> fullproductlist = new ArrayList<>();
    static List<Product> Castlist = new ArrayList<>();
    private FragmentNotificationsBinding binding;
    ListView orders_list;
    RecyclerView CastResycler;
    private AppCompatButton Btn;
    private TextView Symma;
    int symma = 0;
    String V;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NotificationsViewModel notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();



        View v = inflater.inflate(R.layout.fragment_notifications,container,false);


        List<Product> ProductList = new ArrayList<>();
        ProductList.add(new Product(1,"Смартфон",22499,21000,"Смартфон Xiaomi Redmi Note 12 256 ГБ голубой", "Cмартфон Xiaomi Redmi Note 12 256 ГБ черный","", "ядер - 8x(2.8 ГГц), 8 ГБ, 2 SIM, AMOLED, 2400x1080, камера 50+8+2 Мп, NFC, 4G, GPS, FM, 5000 мА*ч", "22499₽","21000₽","novtel1","str1tel1","str1tel2","str1tel3","str1tel4","str1tel5","str1tel6","str1tel7","str1tel8","buttoncvet1_1_on","buttoncvet1_1_off","buttoncvet1_2_on","buttoncvet1_2_off"));
        ProductList.add(new Product(2,"Смартфон",151199,145000,"Смартфон Apple iPhone 15 Pro Max 256 ГБ серый", "Смартфон Apple iPhone 15 Pro Max 256 ГБ черный","", "ядер - 6x(3.78 ГГц), 8 ГБ, 2 SIM, Super Retina XDR, 2796x1290, камера 48+12+12 Мп, NFC, 5G, GPS, 4441 мА*ч", "151 199₽","145 000₽","novtel5","str2tel1","str2tel2","str2tel3","str2tel4","str2tel5","str2tel6","str2tel7","str2tel8","buttoncvet2_1_on","buttoncvet2_1_off","buttoncvet2_2_on","buttoncvet2_2_off"));
        ProductList.add(new Product(3,"Смартфон",24999,25999,"Смартфон Xiaomi Redmi Note 12 Pro 256 ГБ голубой", "Смартфон Xiaomi Redmi Note 12 Pro 256 ГБ черный","", "яядер - 8x(2.3 ГГц), 8 ГБ, 2 SIM, AMOLED, 2400x1080, камера 108+8+2+2 Мп, NFC, 4G, GPS, 5000 мА*ч", "24 999₽","25 999₽","novtel2","str3tel1","str3tel2","str3tel3","str3tel4","str3tel5","str3tel6","str3tel7","str3tel8","buttoncvet2_1_on","buttoncvet2_1_off","buttoncvet2_2_on","buttoncvet2_2_off"));
        ProductList.add(new Product(4,"Смартфон",20999,22000,"Смартфон Infinix NOTE 30 Pro 256 ГБ золотистый", "Смартфон Infinix NOTE 30 Pro 256 ГБ черный","", "ядер - 8x(2.2 ГГц), 8 ГБ, 2 SIM, AMOLED, 2400x1080, камера 108+2+2 Мп, NFC, 4G, GPS, 5000 мА*ч", "20 999₽","22 000₽","novtel3","str4tel1","str4tel2","str4tel3","str4tel4","str4tel5","str4tel6","str4tel7","str4tel8","buttoncvet2_1_on","buttoncvet2_1_off","buttoncvet2_2_on","buttoncvet2_2_off"));
        ProductList.add(new Product(5,"Смартфон",19999,21000,"Смартфон Xiaomi Redmi Note 12S 256 ГБ голубой", "Смартфон Xiaomi Redmi Note 12S 256 ГБ черный","", "ядер - 8x(2.05 ГГц), 8 ГБ, 2 SIM, AMOLED, 2400x1080, камера 108+8+2 Мп, NFC, 4G, GPS, 5000 мА*ч", "19 999₽","21 000₽","novtel4","str5tel1","str5tel2","str5tel3","str5tel4","str5tel5","str5tel6","str5tel7","str5tel8","buttoncvet2_1_on","buttoncvet2_1_off","buttoncvet2_2_on","buttoncvet2_2_off"));

        fullproductlist.addAll(productlist);
        List<Product2> Productcastlist = new ArrayList<>();
        int cena;
        Symma = v.findViewById(R.id.Summ);
        for(Product c : ProductList){
            if (Order.items_id.contains(c.getId())){
                Productcastlist.add( new Product2(c.getId(),c.getGlav(),c.getCena(),c.getIm()));
                symma=symma+c.getCenaint1();
                V=Integer.toString(symma);
                Symma.setText(V);

            }
            if (Order.items_id.contains(c.getId()+10000)){
                Productcastlist.add( new Product2(c.getId(),c.getGlav2(),c.getCena2(),c.getImbig5()));
                symma=symma+c.getCenaint2();
                V=Integer.toString(symma);
                Symma.setText(V);
            }
        }

        CastAdapter castAdapter = new CastAdapter(getContext(),Productcastlist);
        Btn = v.findViewById(R.id.Deletecast);

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Productcastlist.clear();
                Order.items_id.clear();
                castAdapter.notifyDataSetChanged();
                symma=0;
                V=Integer.toString(symma);
                Symma.setText(V);
            }
        });
        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.ProductCastt);
        castAdapter.notifyDataSetChanged();
        recyclerView.setAdapter(castAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);




        return v;



    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}