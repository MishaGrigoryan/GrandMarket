package com.example.grandmarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.grandmarket.adapter.ProductAdapter;
import com.example.grandmarket.data.model.Isbran;
import com.example.grandmarket.data.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Isbrannoe2 extends AppCompatActivity {
    RecyclerView Risbrannoe;
    static List<Product> productlist = new ArrayList<>();
    static List<Product> fullproductlist = new ArrayList<>();
    static List<Product> Castlist = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isbrannoe2);






        List<Product> ProductList = new ArrayList<>();
        ProductList.add(new Product(1,"Смартфон",22499,21000,"Смартфон Xiaomi Redmi Note 12 256 ГБ голубой", "Cмартфон Xiaomi Redmi Note 12 256 ГБ черный","", "ядер - 8x(2.8 ГГц), 8 ГБ, 2 SIM, AMOLED, 2400x1080, камера 50+8+2 Мп, NFC, 4G, GPS, FM, 5000 мА*ч", "22499₽","21000₽","novtel1","str1tel1","str1tel2","str1tel3","str1tel4","str1tel5","str1tel6","str1tel7","str1tel8","buttoncvet1_1_on","buttoncvet1_1_off","buttoncvet1_2_on","buttoncvet1_2_off"));
        ProductList.add(new Product(2,"Смартфон",151199,145000,"Смартфон Apple iPhone 15 Pro Max 256 ГБ серый", "Смартфон Apple iPhone 15 Pro Max 256 ГБ черный","", "ядер - 6x(3.78 ГГц), 8 ГБ, 2 SIM, Super Retina XDR, 2796x1290, камера 48+12+12 Мп, NFC, 5G, GPS, 4441 мА*ч", "151 199₽","145 000₽","novtel5","str2tel1","str2tel2","str2tel3","str2tel4","str2tel5","str2tel6","str2tel7","str2tel8","buttoncvet2_1_on","buttoncvet2_1_off","buttoncvet2_2_on","buttoncvet2_2_off"));
        ProductList.add(new Product(3,"Смартфон",24999,25999,"Смартфон Xiaomi Redmi Note 12 Pro 256 ГБ голубой", "Смартфон Xiaomi Redmi Note 12 Pro 256 ГБ черный","", "яядер - 8x(2.3 ГГц), 8 ГБ, 2 SIM, AMOLED, 2400x1080, камера 108+8+2+2 Мп, NFC, 4G, GPS, 5000 мА*ч", "24 999₽","25 999₽","novtel2","str3tel1","str3tel2","str3tel3","str3tel4","str3tel5","str3tel6","str3tel7","str3tel8","buttoncvet2_1_on","buttoncvet2_1_off","buttoncvet2_2_on","buttoncvet2_2_off"));
        ProductList.add(new Product(4,"Смартфон",20999,22000,"Смартфон Infinix NOTE 30 Pro 256 ГБ золотистый", "Смартфон Infinix NOTE 30 Pro 256 ГБ черный","", "ядер - 8x(2.2 ГГц), 8 ГБ, 2 SIM, AMOLED, 2400x1080, камера 108+2+2 Мп, NFC, 4G, GPS, 5000 мА*ч", "20 999₽","22 000₽","novtel3","str4tel1","str4tel2","str4tel3","str4tel4","str4tel5","str4tel6","str4tel7","str4tel8","buttoncvet2_1_on","buttoncvet2_1_off","buttoncvet2_2_on","buttoncvet2_2_off"));
        ProductList.add(new Product(5,"Смартфон",19999,21000,"Смартфон Xiaomi Redmi Note 12S 256 ГБ голубой", "Смартфон Xiaomi Redmi Note 12S 256 ГБ черный","", "ядер - 8x(2.05 ГГц), 8 ГБ, 2 SIM, AMOLED, 2400x1080, камера 108+8+2 Мп, NFC, 4G, GPS, 5000 мА*ч", "19 999₽","21 000₽","novtel4","str5tel1","str5tel2","str5tel3","str5tel4","str5tel5","str5tel6","str5tel7","str5tel8","buttoncvet2_1_on","buttoncvet2_1_off","buttoncvet2_2_on","buttoncvet2_2_off"));

        fullproductlist.addAll(productlist);
        List<Product> IsbrannoeList = new ArrayList<>();

        for(Product c : ProductList) {
            if (Isbran.Items_id_Ibrannoe.contains(c.getId())) {
                IsbrannoeList.add(new Product(c.getId(), c.getCategory(), c.getCenaint1(), c.getCenaint2(), c.getGlav(), c.getGlav2(), c.getOpis(), c.getHarakt(), c.getCena(), c.getCena2(), c.getIm(), c.getImbig1(), c.getImbig2(), c.getImbig3(), c.getImbig4(), c.getImbig5(), c.getImbig6(), c.getImbig7(), c.getImbig8(), c.getBg1on(), c.getBg1off(), c.getBg2on(), c.getBg2off()));
            }
        }
        setProductRecycler(IsbrannoeList);







    }
    private void setProductRecycler(List<Product> IsbrannoeList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        Risbrannoe = findViewById(R.id.RIsbrannoe);
        Risbrannoe.setLayoutManager(layoutManager);
        ProductAdapter productAdapter = new ProductAdapter(this,IsbrannoeList);
        Risbrannoe. setAdapter(productAdapter);
    }


}
