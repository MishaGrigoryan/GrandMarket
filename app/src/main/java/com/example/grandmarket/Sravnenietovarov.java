package com.example.grandmarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;
import android.widget.TextView;

import com.example.grandmarket.data.model.Haracteristiki;
import com.example.grandmarket.data.model.Isbran;
import com.example.grandmarket.data.model.Product;
import com.example.grandmarket.data.model.SravnenieSpisok;

import java.util.ArrayList;
import java.util.List;

public class Sravnenietovarov extends AppCompatActivity {
    private AppCompatImageView im1;
    private AppCompatImageView im2;
    private TextView TableCvet1;
    private TextView TableCvet2;
    private TextView TableDiag1;
    private TextView TableDiag2;
    private TextView TableMatir1;
    private TextView TableMatir2;
    private TextView TableOperac1;
    private TextView TableOperac2;
    private TextView TableObOp1;
    private TextView TableObOp2;
    private TextView TableObV1;
    private TextView TableObV2;
    private TextView TableKolK1;
    private TextView TableKolK2;
    private TextView TableKolMeg1;
    private TextView TableKolMeg2;
    private TextView TableForV1;
    private TextView TableForV2;
    private TextView TableBloot1;
    private TextView TableBloot2;
    private TextView TableInt1;
    private TextView TableInt2;
    private TextView TableEmk1;
    private TextView TableEmk2;
    private TextView TableNaush1;
    private TextView TableNaush2;
    private TextView NasvTel1;
    private TextView NasvTel2;
    private int id1;
    private int id2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sravnenietovarov);

        TableCvet1= (TextView) findViewById(R.id.TableCvet1);
        TableCvet2= (TextView) findViewById(R.id.TableCvet2);
        TableDiag1= (TextView) findViewById(R.id.TableDiag1);
        TableDiag2= (TextView) findViewById(R.id.TableDiag2);
        TableMatir1= (TextView) findViewById(R.id. TableMatir1);
        TableMatir2= (TextView) findViewById(R.id.TableMatir2);
        TableOperac1= (TextView) findViewById(R.id.TableOperac1);
        TableOperac2= (TextView) findViewById(R.id.TableOperac2);
        TableObOp1= (TextView) findViewById(R.id.TableObOp1);
        TableObOp2= (TextView) findViewById(R.id.TableObOp2);
        TableObV1= (TextView) findViewById(R.id.TableObV1);
        TableObV2= (TextView) findViewById(R.id.TableObV2);
        TableKolK1= (TextView) findViewById(R.id.TableKolK1);
        TableKolK2= (TextView) findViewById(R.id.TableKolK2);
        TableKolMeg1= (TextView) findViewById(R.id.TableKolMeg1);
        TableKolMeg2= (TextView) findViewById(R.id.TableKolMeg2);
        TableForV1= (TextView) findViewById(R.id.TableForV1);
        TableForV2= (TextView) findViewById(R.id.TableForV2);
        TableBloot1= (TextView) findViewById(R.id.TableBloot1);
        TableBloot2= (TextView) findViewById(R.id.TableBloot2);
        TableInt1= (TextView) findViewById(R.id.TableInt1);
        TableInt2= (TextView) findViewById(R.id.TableInt2);
        TableEmk1= (TextView) findViewById(R.id.TableEmk1);
        TableEmk2= (TextView) findViewById(R.id.TableEmk2);
        TableNaush1= (TextView) findViewById(R.id.TableNaush1);
        TableNaush2= (TextView) findViewById(R.id.TableNaush2);
        NasvTel1= (TextView) findViewById(R.id.NasvTel1);
        NasvTel2= (TextView) findViewById(R.id.NasvTel2);
        im1= (AppCompatImageView) findViewById(R.id.imageTel1);
        im2= (AppCompatImageView) findViewById(R.id.imageTel2);



        List<Product> ProductList = new ArrayList<>();
        ProductList.add(new Product(1,"Смартфон",22499,21000,"Смартфон Xiaomi Redmi Note 12 256 ГБ голубой", "Cмартфон Xiaomi Redmi Note 12 256 ГБ черный","", "ядер - 8x(2.8 ГГц), 8 ГБ, 2 SIM, AMOLED, 2400x1080, камера 50+8+2 Мп, NFC, 4G, GPS, FM, 5000 мА*ч", "22499₽","21000₽","novtel1","str1tel1","str1tel2","str1tel3","str1tel4","str1tel5","str1tel6","str1tel7","str1tel8","buttoncvet1_1_on","buttoncvet1_1_off","buttoncvet1_2_on","buttoncvet1_2_off"));
        ProductList.add(new Product(2,"Смартфон",151199,145000,"Смартфон Apple iPhone 15 Pro Max 256 ГБ серый", "Смартфон Apple iPhone 15 Pro Max 256 ГБ черный","", "ядер - 6x(3.78 ГГц), 8 ГБ, 2 SIM, Super Retina XDR, 2796x1290, камера 48+12+12 Мп, NFC, 5G, GPS, 4441 мА*ч", "151 199₽","145 000₽","novtel5","str2tel1","str2tel2","str2tel3","str2tel4","str2tel5","str2tel6","str2tel7","str2tel8","buttoncvet2_1_on","buttoncvet2_1_off","buttoncvet2_2_on","buttoncvet2_2_off"));
        ProductList.add(new Product(3,"Смартфон",24999,25999,"Смартфон Xiaomi Redmi Note 12 Pro 256 ГБ голубой", "Смартфон Xiaomi Redmi Note 12 Pro 256 ГБ черный","", "яядер - 8x(2.3 ГГц), 8 ГБ, 2 SIM, AMOLED, 2400x1080, камера 108+8+2+2 Мп, NFC, 4G, GPS, 5000 мА*ч", "24 999₽","25 999₽","novtel2","str3tel1","str3tel2","str3tel3","str3tel4","str3tel5","str3tel6","str3tel7","str3tel8","buttoncvet2_1_on","buttoncvet2_1_off","buttoncvet2_2_on","buttoncvet2_2_off"));
        ProductList.add(new Product(4,"Смартфон",20999,22000,"Смартфон Infinix NOTE 30 Pro 256 ГБ золотистый", "Смартфон Infinix NOTE 30 Pro 256 ГБ черный","", "ядер - 8x(2.2 ГГц), 8 ГБ, 2 SIM, AMOLED, 2400x1080, камера 108+2+2 Мп, NFC, 4G, GPS, 5000 мА*ч", "20 999₽","22 000₽","novtel3","str4tel1","str4tel2","str4tel3","str4tel4","str4tel5","str4tel6","str4tel7","str4tel8","buttoncvet2_1_on","buttoncvet2_1_off","buttoncvet2_2_on","buttoncvet2_2_off"));
        ProductList.add(new Product(5,"Смартфон",19999,21000,"Смартфон Xiaomi Redmi Note 12S 256 ГБ голубой", "Смартфон Xiaomi Redmi Note 12S 256 ГБ черный","", "ядер - 8x(2.05 ГГц), 8 ГБ, 2 SIM, AMOLED, 2400x1080, камера 108+8+2 Мп, NFC, 4G, GPS, 5000 мА*ч", "19 999₽","21 000₽","novtel4","str5tel1","str5tel2","str5tel3","str5tel4","str5tel5","str5tel6","str5tel7","str5tel8","buttoncvet2_1_on","buttoncvet2_1_off","buttoncvet2_2_on","buttoncvet2_2_off"));



        List<Haracteristiki> Haract = new ArrayList<>();
        Haract.add(new Haracteristiki(1, "Голубой", "35d", "Пластик", "Android", "256 ГБ", "512 ГБ", "4", "22МГ", "4к,2К", "Есть", "Type-C", "50000m","Есть"));
        Haract.add(new Haracteristiki(2, "Черный", "25d", "Пластик", "Android", "256 ГБ", "512 ГБ", "4", "22МГ", "4к,2К", "Есть", "Type-C", "50000m","Есть"));
        Haract.add(new Haracteristiki(3, "Желтый", "15d", "Пластик", "Android", "256 ГБ", "512 ГБ", "4", "22МГ", "4к,2К", "Есть", "Type-C", "50000m","Есть"));
        Haract.add(new Haracteristiki(4, "Золотистый", "45d", "Пластик", "Android", "128 ГБ", "256 ГБ", "4", "22МГ", "4к,2К", "Есть", "Type-C", "50000m","Есть"));
        Haract.add(new Haracteristiki(5, "Голубой", "65d", "Пластик", "Android", "256 ГБ", "512 ГБ", "4", "22МГ", "4к,2К", "Есть", "Type-C", "50000m","Есть"));
        int d = Haract.size();
        for(Product t : ProductList) {
            if (SravnenieSpisok.Items_id_Sravnenie1== t.getId()) {
                NasvTel1.setText(t.getGlav());
                int im = getResources().getIdentifier(t.getIm(), "drawable", getPackageName());
                im1.setImageResource(im);
            }
            if (SravnenieSpisok.Items_id_Sravnenie2== t.getId()) {
                NasvTel2.setText(t.getGlav());
                int im = getResources().getIdentifier(t.getIm(), "drawable", getPackageName());
                im2.setImageResource(im);
            }

        }

        for(Haracteristiki c : Haract) {
            if (SravnenieSpisok.Items_id_Sravnenie1== c.getId()) {

                TableCvet1.setText(c.getCvet());
                TableDiag1.setText(c.getDiagonal());
                TableMatir1.setText(c.getMaterial());
                TableOperac1.setText(c.getOpersys());
                TableObOp1.setText(c.getOboper());
                TableObV1.setText(c.getObvstr());
                TableKolK1.setText(c.getKolosnk());
                TableKolMeg1.setText(c.getKolmeg());
                TableForV1.setText(c.getFormat());
                TableBloot1.setText(c.getBlootus());
                TableInt1.setText(c.getInterfase());
                TableEmk1.setText(c.getEmkost());
                TableNaush1.setText(c.getNaushniki());
            }
        if (SravnenieSpisok.Items_id_Sravnenie2== c.getId()) {
            TableCvet2.setText(c.getCvet());
            TableDiag2.setText(c.getDiagonal());
            TableMatir2.setText(c.getMaterial());
            TableOperac2.setText(c.getOpersys());
            TableObOp2.setText(c.getOboper());
            TableObV2.setText(c.getObvstr());
            TableKolK2.setText(c.getKolosnk());
            TableKolMeg2.setText(c.getKolmeg());
            TableForV2.setText(c.getFormat());
            TableBloot2.setText(c.getBlootus());
            TableInt2.setText(c.getInterfase());
            TableEmk2.setText(c.getEmkost());
            TableNaush2.setText(c.getNaushniki());
        }}



















    }









}