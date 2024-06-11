package com.example.grandmarket.ui.home;

import android.content.Intent;
import android.media.MediaDrm;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grandmarket.R;
import com.example.grandmarket.Stranicatel1;
import com.example.grandmarket.adapter.ProductAdapter;
import com.example.grandmarket.data.model.Product;
import com.example.grandmarket.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {



    private FragmentHomeBinding binding;
    RecyclerView productRecycler;
    com.example.grandmarket.adapter.ProductAdapter ProductAdapter;
    static List<Product> productlist = new ArrayList<>();
    static List<Product> fullproductlist = new ArrayList<>();
    ListView orders_list;
    List<Product> ProductList = new ArrayList<>();


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();



        View v = inflater.inflate(R.layout.fragment_home,container,false);
        List<Product> ProductList = new ArrayList<>();
        ProductList.add(new Product(1,"Смартфон",22499,21000,"Смартфон Xiaomi Redmi Note 12 256 ГБ голубой", "Cмартфон Xiaomi Redmi Note 12 256 ГБ черный","Смартфон Xiaomi Redmi Note 12S оснащен 6.43-дюймовым AMOLED-дисплеем, который отображает глубокий черный цвет и не допускает задержек при смене динамичных эпизодов. Покрытие Corning Gorilla Glass 3 оберегает экран от образования царапин.", "ядер - 8x(2.8 ГГц), 8 ГБ, 2 SIM, AMOLED, 2400x1080, камера 50+8+2 Мп, NFC, 4G, GPS, FM, 5000 мА*ч", "22 499₽","21 000₽","novtel1","str1tel1","str1tel2","str1tel3","str1tel4","str1tel5","str1tel6","str1tel7","str1tel8","buttoncvet1_1_on","buttoncvet1_1_off","buttoncvet1_2_on","buttoncvet1_2_off"));
        ProductList.add(new Product(2,"Смартфон",151199,145000,"Смартфон Apple iPhone 15 Pro Max 256 ГБ серый", "Смартфон Apple iPhone 15 Pro Max 256 ГБ черный","Смартфон Apple iPhone 15 Pro выкован из титана – прочного и легкого материала, из которого изготовлены его боковые грани. Чип A17 Pro гарантирует невероятную производительность устройства. Программируемая кнопка Action обеспечит быстрый доступ к вашей любимой функции. Теперь для подзарядки аккумулятора используется порт USB-C с поддержкой USB 3 и передачей данных до 20 раз быстрее. Батарея обеспечит до 23 часов просмотра видео - время работы, достойное Pro.", "ядер - 6x(3.78 ГГц), 8 ГБ, 2 SIM, Super Retina XDR, 2796x1290, камера 48+12+12 Мп, NFC, 5G, GPS, 4441 мА*ч", "151 199₽","145 000₽","novtel5","str2tel1","str2tel2","str2tel3","str2tel4","str2tel5","str2tel6","str2tel7","str2tel8","buttoncvet2_1_on","buttoncvet2_1_off","buttoncvet2_2_on","buttoncvet2_2_off"));
        ProductList.add(new Product(3,"Смартфон",24999,25999,"Смартфон Xiaomi Redmi Note 12 Pro 256 ГБ голубой", "Смартфон Xiaomi Redmi Note 12 Pro 256 ГБ черный","Смартфон Xiaomi Redmi Note 12 Pro+ с объемом памяти 256 ГБ оборудован 6.67-дюймовым дисплеем, главным звеном которого выступила AMOLED-технология. Она усиливает контрастность изображений и способствует охвату широкой гаммы цветов. Частота обновления 120 Гц гарантирует мгновенную смену кадров во время динамичных игр и фильмов. Трехмодульная оптика может похвастаться увеличенным углом обзора, обеспечивая захват удаленных элементов.", "яядер - 8x(2.3 ГГц), 8 ГБ, 2 SIM, AMOLED, 2400x1080, камера 108+8+2+2 Мп, NFC, 4G, GPS, 5000 мА*ч", "24 999₽","25 999₽","novtel2","str3tel1","str3tel2","str3tel3","str3tel4","str3tel5","str3tel6","str3tel7","str3tel8","buttoncvet2_1_on","buttoncvet2_1_off","buttoncvet2_2_on","buttoncvet2_2_off"));
        ProductList.add(new Product(4,"Смартфон",20999,22000,"Смартфон Infinix NOTE 30 Pro 256 ГБ золотистый", "Смартфон Infinix NOTE 30 Pro 256 ГБ черный","Смартфон Infinix NOTE 30 Pro в корпусе из металла и стекла обладает олеофобным покрытием, которое предупреждает постоянное накапливание загрязнений. Частота обновления 6.67-дюймового дисплея составляет 120 Гц, что обеспечивает своевременную смену кадров при трансляции динамичных сцен.", "ядер - 8x(2.2 ГГц), 8 ГБ, 2 SIM, AMOLED, 2400x1080, камера 108+2+2 Мп, NFC, 4G, GPS, 5000 мА*ч", "20 999₽","22 000₽","novtel3","str4tel1","str4tel2","str4tel3","str4tel4","str4tel5","str4tel6","str4tel7","str4tel8","buttoncvet2_1_on","buttoncvet2_1_off","buttoncvet2_2_on","buttoncvet2_2_off"));
        ProductList.add(new Product(5,"Смартфон",19999,21000,"Смартфон Xiaomi Redmi Note 12S 256 ГБ голубой", "Смартфон Xiaomi Redmi Note 12S 256 ГБ черный","Смартфон Xiaomi Redmi Note 12S оснащен 6.43-дюймовым AMOLED-дисплеем, который отображает глубокий черный цвет и не допускает задержек при смене динамичных эпизодов. Покрытие Corning Gorilla Glass 3 оберегает экран от образования царапин. Разрешение контента достигает 2400x1080 пикселей.", "ядер - 8x(2.05 ГГц), 8 ГБ, 2 SIM, AMOLED, 2400x1080, камера 108+8+2 Мп, NFC, 4G, GPS, 5000 мА*ч", "19 999₽","21 000₽","novtel4","str5tel1","str5tel2","str5tel3","str5tel4","str5tel5","str5tel6","str5tel7","str5tel8","buttoncvet2_1_on","buttoncvet2_1_off","buttoncvet2_2_on","buttoncvet2_2_off"));

        fullproductlist.addAll(productlist);
        setProductRecycler(inflater,container,ProductList);

        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.ProductRecycler);
        ProductAdapter productAdapter = new ProductAdapter(getContext(),ProductList);
        recyclerView.setAdapter(productAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);




        return v;
    }





    private void setProductRecycler(LayoutInflater inflater, ViewGroup container, List<Product> productList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
        View v = inflater.inflate(R.layout.fragment_home,container,false);
        productRecycler = v.findViewById(R.id.ProductRecycler);
        productRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        productRecycler.setHasFixedSize(true);
        ProductAdapter productAdapter = new ProductAdapter(getContext(),ProductList);
        productRecycler. setAdapter(productAdapter);
        productAdapter.notifyDataSetChanged();
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }



}