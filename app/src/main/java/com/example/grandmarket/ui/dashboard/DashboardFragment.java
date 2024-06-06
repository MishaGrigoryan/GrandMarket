package com.example.grandmarket.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grandmarket.R;
import com.example.grandmarket.adapter.ProductAdapter;
import com.example.grandmarket.data.model.Order;
import com.example.grandmarket.data.model.Product;
import com.example.grandmarket.data.model.Product2;
import com.example.grandmarket.databinding.FragmentDashboardBinding;

import java.util.ArrayList;
import java.util.List;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;
    RecyclerView ResFiltr;
    Button Sort;
    ImageButton FNoutbuk;
    ImageButton FKomputer;
    ImageButton FMonitor;
    ImageButton FSmartfon;
    ImageButton FSmartChas;
    ImageButton FPlasnshet;
    ImageButton FElectronicbook;
    ImageButton FPhotoaparat;
    ImageButton FAchncamera;
    TextView TextNout;
    TextView TextKomp;
    TextView TextMonik;
    TextView TextSmartfon;
    TextView TextSmartChas;
    TextView TextPlanshet;
    TextView TextPhoto;
    TextView TextAchnCamera;
    TextView TextElbook;
    public String Filtr = "";
    static List<Product> productlist = new ArrayList<>();
    static List<Product> fullproductlist = new ArrayList<>();
    List<Product> ProductList = new ArrayList<>();
    List<Product> FiltProductList = new ArrayList<>();
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);
        View v = inflater.inflate(R.layout.fragment_dashboard,container,false);
        FNoutbuk= v.findViewById(R.id.Noutbuk);
        FKomputer = v.findViewById(R.id.Komputer);
        FMonitor = v.findViewById(R.id.Monitor);
        FSmartfon = v.findViewById(R.id.Smartfon);
        FSmartChas = v.findViewById(R.id.Smartchas);
        FPlasnshet = v.findViewById(R.id.Planshet);
        FElectronicbook = v.findViewById(R.id.Electronicbook);
        FPhotoaparat = v.findViewById(R.id.Photoaparat);
        FAchncamera = v.findViewById(R.id.Achncamera);
        TextNout = v.findViewById(R.id.textNout);
        TextKomp= v.findViewById(R.id.textKomp);
        TextMonik= v.findViewById(R.id.textMonik);
        TextSmartfon= v.findViewById(R.id.textSmartfon);
        TextSmartChas= v.findViewById(R.id.textSmartchas);
        TextPlanshet= v.findViewById(R.id.textPlanshet);
        TextPhoto= v.findViewById(R.id.textPhoto);
        TextAchnCamera= v.findViewById(R.id.textAchnCamera);
        TextElbook= v.findViewById(R.id.textElbook);
        Sort=v.findViewById(R.id.SortBut);

        List<Product> ProductList = new ArrayList<>();
        ProductList.add(new Product(1,"Смартфон",22499,21000,"Смартфон Xiaomi Redmi Note 12 256 ГБ голубой", "Cмартфон Xiaomi Redmi Note 12 256 ГБ черный","", "ядер - 8x(2.8 ГГц), 8 ГБ, 2 SIM, AMOLED, 2400x1080, камера 50+8+2 Мп, NFC, 4G, GPS, FM, 5000 мА*ч", "22 499₽","21 000₽","novtel1","str1tel1","str1tel2","str1tel3","str1tel4","str1tel5","str1tel6","str1tel7","str1tel8","buttoncvet1_1_on","buttoncvet1_1_off","buttoncvet1_2_on","buttoncvet1_2_off"));
        ProductList.add(new Product(2,"Смартфон",151199,145000,"Смартфон Apple iPhone 15 Pro Max 256 ГБ серый", "Смартфон Apple iPhone 15 Pro Max 256 ГБ черный","", "ядер - 6x(3.78 ГГц), 8 ГБ, 2 SIM, Super Retina XDR, 2796x1290, камера 48+12+12 Мп, NFC, 5G, GPS, 4441 мА*ч", "151 199₽","145 000₽","novtel5","str2tel1","str2tel2","str2tel3","str2tel4","str2tel5","str2tel6","str2tel7","str2tel8","buttoncvet2_1_on","buttoncvet2_1_off","buttoncvet2_2_on","buttoncvet2_2_off"));
        ProductList.add(new Product(3,"Компьтер",24999,25999,"Смартфон Xiaomi Redmi Note 12 Pro 256 ГБ голубой", "Смартфон Xiaomi Redmi Note 12 Pro 256 ГБ черный","", "яядер - 8x(2.3 ГГц), 8 ГБ, 2 SIM, AMOLED, 2400x1080, камера 108+8+2+2 Мп, NFC, 4G, GPS, 5000 мА*ч", "24 999₽","25 999₽","novtel2","str3tel1","str3tel2","str3tel3","str3tel4","str3tel5","str3tel6","str3tel7","str3tel8","buttoncvet2_1_on","buttoncvet2_1_off","buttoncvet2_2_on","buttoncvet2_2_off"));
        ProductList.add(new Product(4,"Ноутбук",20999,22000,"Смартфон Infinix NOTE 30 Pro 256 ГБ золотистый", "Смартфон Infinix NOTE 30 Pro 256 ГБ черный","", "ядер - 8x(2.2 ГГц), 8 ГБ, 2 SIM, AMOLED, 2400x1080, камера 108+2+2 Мп, NFC, 4G, GPS, 5000 мА*ч", "20 999₽","22 000₽","novtel3","str4tel1","str4tel2","str4tel3","str4tel4","str4tel5","str4tel6","str4tel7","str4tel8","buttoncvet2_1_on","buttoncvet2_1_off","buttoncvet2_2_on","buttoncvet2_2_off"));
        ProductList.add(new Product(5,"Смартфон",19999,21000,"Смартфон Xiaomi Redmi Note 12S 256 ГБ голубой", "Смартфон Xiaomi Redmi Note 12S 256 ГБ черный","", "ядер - 8x(2.05 ГГц), 8 ГБ, 2 SIM, AMOLED, 2400x1080, камера 108+8+2 Мп, NFC, 4G, GPS, 5000 мА*ч", "19 999₽","21 000₽","novtel4","str5tel1","str5tel2","str5tel3","str5tel4","str5tel5","str5tel6","str5tel7","str5tel8","buttoncvet2_1_on","buttoncvet2_1_off","buttoncvet2_2_on","buttoncvet2_2_off"));
        fullproductlist.addAll(productlist);

        List<Product> FiltProductList = new ArrayList<>();

        FNoutbuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VisibilitiOFF();
                Filtr = "Ноутбук";
                FiltProductList.clear();
                for(Product c : ProductList){
                    if (Filtr.equals(c.getCategory())){
                        FiltProductList.add( new Product(c.getId(),c.getCategory(),c.getCenaint1(),c.getCenaint2(),c.getGlav(),c.getGlav2(),c.getOpis(),c.getHarakt(),c.getCena(),c.getCena2(),c.getIm(),c.getImbig1(),c.getImbig2(),c.getImbig3(),c.getImbig4(),c.getImbig5(),c.getImbig6(),c.getImbig7(),c.getImbig8(),c.getBg1on(),c.getBg1off(),c.getBg2on(),c.getBg2off()));
                    }
                }
            }
        });
        FKomputer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VisibilitiOFF();
                Filtr = "Компьтер";
                FiltProductList.clear();
                for(Product c : ProductList){
                    if (Filtr.equals(c.getCategory())){
                        FiltProductList.add( new Product(c.getId(),c.getCategory(),c.getCenaint1(),c.getCenaint2(),c.getGlav(),c.getGlav2(),c.getOpis(),c.getHarakt(),c.getCena(),c.getCena2(),c.getIm(),c.getImbig1(),c.getImbig2(),c.getImbig3(),c.getImbig4(),c.getImbig5(),c.getImbig6(),c.getImbig7(),c.getImbig8(),c.getBg1on(),c.getBg1off(),c.getBg2on(),c.getBg2off()));
                    }
                }
            }
        });
        FMonitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VisibilitiOFF();
                Filtr = "Монитор";
                FiltProductList.clear();
                for(Product c : ProductList){
                    if (Filtr.equals(c.getCategory().toString())){
                        FiltProductList.add( new Product(c.getId(),c.getCategory(),c.getCenaint1(),c.getCenaint2(),c.getGlav(),c.getGlav2(),c.getOpis(),c.getHarakt(),c.getCena(),c.getCena2(),c.getIm(),c.getImbig1(),c.getImbig2(),c.getImbig3(),c.getImbig4(),c.getImbig5(),c.getImbig6(),c.getImbig7(),c.getImbig8(),c.getBg1on(),c.getBg1off(),c.getBg2on(),c.getBg2off()));
                    }
                }
            }
        });
        FSmartfon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VisibilitiOFF();
                Filtr = "Смартфон";
                FiltProductList.clear();
                for(Product c : ProductList){
                    if (Filtr.equals(c.getCategory())){
                        FiltProductList.add( new Product(c.getId(),c.getCategory(),c.getCenaint1(),c.getCenaint2(),c.getGlav(),c.getGlav2(),c.getOpis(),c.getHarakt(),c.getCena(),c.getCena2(),c.getIm(),c.getImbig1(),c.getImbig2(),c.getImbig3(),c.getImbig4(),c.getImbig5(),c.getImbig6(),c.getImbig7(),c.getImbig8(),c.getBg1on(),c.getBg1off(),c.getBg2on(),c.getBg2off()));
                    }
                }
            }
        });
        FSmartChas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VisibilitiOFF();
                Filtr = "Смарт часы";
                FiltProductList.clear();
                for(Product c : ProductList){
                    if (Filtr.equals(c.getCategory().toString())){
                        FiltProductList.add( new Product(c.getId(),c.getCategory(),c.getCenaint1(),c.getCenaint2(),c.getGlav(),c.getGlav2(),c.getOpis(),c.getHarakt(),c.getCena(),c.getCena2(),c.getIm(),c.getImbig1(),c.getImbig2(),c.getImbig3(),c.getImbig4(),c.getImbig5(),c.getImbig6(),c.getImbig7(),c.getImbig8(),c.getBg1on(),c.getBg1off(),c.getBg2on(),c.getBg2off()));
                    }
                }
            }
        });
        FPlasnshet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VisibilitiOFF();
                Filtr = "Планшет";
                FiltProductList.clear();
                for(Product c : ProductList){
                    if (Filtr.equals(c.getCategory().toString())){
                        FiltProductList.add( new Product(c.getId(),c.getCategory(),c.getCenaint1(),c.getCenaint2(),c.getGlav(),c.getGlav2(),c.getOpis(),c.getHarakt(),c.getCena(),c.getCena2(),c.getIm(),c.getImbig1(),c.getImbig2(),c.getImbig3(),c.getImbig4(),c.getImbig5(),c.getImbig6(),c.getImbig7(),c.getImbig8(),c.getBg1on(),c.getBg1off(),c.getBg2on(),c.getBg2off()));
                    }
                }
            }
        });
        FElectronicbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VisibilitiOFF();
                Filtr = "Электронная книга";
                FiltProductList.clear();
                for(Product c : ProductList){
                    if (Filtr.equals(c.getCategory().toString())){
                        FiltProductList.add( new Product(c.getId(),c.getCategory(),c.getCenaint1(),c.getCenaint2(),c.getGlav(),c.getGlav2(),c.getOpis(),c.getHarakt(),c.getCena(),c.getCena2(),c.getIm(),c.getImbig1(),c.getImbig2(),c.getImbig3(),c.getImbig4(),c.getImbig5(),c.getImbig6(),c.getImbig7(),c.getImbig8(),c.getBg1on(),c.getBg1off(),c.getBg2on(),c.getBg2off()));
                    }
                }
            }
        });
        FPhotoaparat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VisibilitiOFF();
                Filtr = "Фотоапарат";
                FiltProductList.clear();
                for(Product c : ProductList){
                    if (Filtr.equals(c.getCategory().toString())){
                        FiltProductList.add( new Product(c.getId(),c.getCategory(),c.getCenaint1(),c.getCenaint2(),c.getGlav(),c.getGlav2(),c.getOpis(),c.getHarakt(),c.getCena(),c.getCena2(),c.getIm(),c.getImbig1(),c.getImbig2(),c.getImbig3(),c.getImbig4(),c.getImbig5(),c.getImbig6(),c.getImbig7(),c.getImbig8(),c.getBg1on(),c.getBg1off(),c.getBg2on(),c.getBg2off()));
                    }
                }
            }
        });
        FAchncamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VisibilitiOFF();
                Filtr = "Экшн камера";
                FiltProductList.clear();

                for(Product c : ProductList){
                    if (Filtr.equals(c.getCategory().toString())){
                        FiltProductList.add( new Product(c.getId(),c.getCategory(),c.getCenaint1(),c.getCenaint2(),c.getGlav(),c.getGlav2(),c.getOpis(),c.getHarakt(),c.getCena(),c.getCena2(),c.getIm(),c.getImbig1(),c.getImbig2(),c.getImbig3(),c.getImbig4(),c.getImbig5(),c.getImbig6(),c.getImbig7(),c.getImbig8(),c.getBg1on(),c.getBg1off(),c.getBg2on(),c.getBg2off()));
                    }
                }
            }
        });





        Sort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FiltProductList.clear();
                FNoutbuk.setVisibility(View.VISIBLE);
                FKomputer.setVisibility(View.VISIBLE);
                FMonitor.setVisibility(View.VISIBLE);
                FSmartfon.setVisibility(View.VISIBLE);
                FSmartChas.setVisibility(View.VISIBLE);
                FPlasnshet.setVisibility(View.VISIBLE);
                FElectronicbook.setVisibility(View.VISIBLE);
                FPhotoaparat.setVisibility(View.VISIBLE);
                FAchncamera.setVisibility(View.VISIBLE);
                TextNout.setVisibility(View.VISIBLE);
                TextKomp.setVisibility(View.VISIBLE);
                TextMonik.setVisibility(View.VISIBLE);
                TextSmartfon.setVisibility(View.VISIBLE);
                TextSmartChas.setVisibility(View.VISIBLE);
                TextPlanshet.setVisibility(View.VISIBLE);
                TextPhoto.setVisibility(View.VISIBLE);
                TextAchnCamera.setVisibility(View.VISIBLE);
                TextElbook.setVisibility(View.VISIBLE);
            }
        });






        setProductRecycler(inflater,container,ProductList);
        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.FiltrProducts);
        ProductAdapter productAdapter = new ProductAdapter(getContext(),FiltProductList);
        recyclerView.setAdapter(productAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);











        return v;
    }
    private void setProductRecycler(LayoutInflater inflater, ViewGroup container, List<Product> productList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
        View v = inflater.inflate(R.layout.fragment_dashboard,container,false);
        ResFiltr = v.findViewById(R.id.FiltrProducts);
        ResFiltr.setLayoutManager(new LinearLayoutManager(getContext()));
        ResFiltr.setHasFixedSize(true);
        ProductAdapter productAdapter = new ProductAdapter(getContext(),FiltProductList);
        ResFiltr. setAdapter(productAdapter);
        productAdapter.notifyDataSetChanged();
    }

    private void VisibilitiOFF(){
        FNoutbuk.setVisibility(View.GONE);
        FKomputer.setVisibility(View.GONE);
        FMonitor.setVisibility(View.GONE);
        FSmartfon.setVisibility(View.GONE);
        FSmartChas.setVisibility(View.GONE);
        FPlasnshet.setVisibility(View.GONE);
        FElectronicbook.setVisibility(View.GONE);
        FPhotoaparat.setVisibility(View.GONE);
        FAchncamera.setVisibility(View.GONE);
        TextNout.setVisibility(View.GONE);
        TextKomp.setVisibility(View.GONE);
        TextMonik.setVisibility(View.GONE);
        TextSmartfon.setVisibility(View.GONE);
        TextSmartChas.setVisibility(View.GONE);
        TextPlanshet.setVisibility(View.GONE);
        TextPhoto.setVisibility(View.GONE);
        TextAchnCamera.setVisibility(View.GONE);
        TextElbook.setVisibility(View.GONE);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
