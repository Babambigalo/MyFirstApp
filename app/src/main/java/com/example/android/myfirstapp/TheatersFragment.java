package com.example.android.myfirstapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TheatersFragment extends Fragment {


    public TheatersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<Category> parks = new ArrayList<>();

        View view =inflater.inflate(R.layout.category_list,container,false);
        RecyclerView rv =view.findViewById(R.id.recycleView);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));













        parks.add(new Category("Большой театр","Театральная пл., 1, Москва, 125009","8 (495) 455-55-55","http://www.undergroundexpert.info/images/articles/podzemnie-sooruzheniya/Bolshoi%20teatr/bolshoi-teatr.png"));
        parks.add(new Category("Малый театр","пр-д.Театральный, 1, Москва, 125009","8 (495) 624-40-46","https://www.2do2go.ru/uploads/28c8a36f3222c1602250e356abe89629.jpg"));
        parks.add(new Category("Театр на Таганке"," ул. Земляной Вал, 76/21, Москва, 109240","8 (495) 915-11-53","https://icdn.lenta.ru/images/2014/03/26/13/20140326132257271/pic_67f8ee5d38936012e6ff288363c4a13d.jpg"));
        parks.add(new Category("Современник","Чистопрудный бул., 19А, Москва, 101000","8 (495) 628-77-49","http://www.bileti-v-teatr.ru/media/theaters/sovremennik-osnovnaya_scena.jpg"));
        parks.add(new Category("Московский театр эстрады","Берсеневская наб., 20/2, Москва, 119072","8 (495) 959-04-56","http://stp2006.ru/wp-content/uploads/2013/07/10b2f2445e6a27f3c20297c525457148.jpg"));
        parks.add(new Category("Московская оперетта"," ул. Большая Дмитровка, 6, Москва, 125009","8 (495) 925-50-50","http://www.ebilet.ru/userdata/1274100995.jpg"));
        parks.add(new Category("Театр имени Владимира Маяковского","ул. Б.Никитская, 19/13, Москва, 125009","8 (495) 690-46-58","http://karelinform.ru/pic/61118_590x371.jpg"));
        parks.add(new Category("Московский театр кукол","Спартаковская ул., 26/30, Москва, 105066"," 8 (499) 261-21-97","http://b1.culture.ru/c/94869.jpg"));


        CategoryAdapter adapter = new CategoryAdapter(getContext(),parks);
        //RecyclerView rv = container.findViewById(R.id.recycleView);
        rv.setAdapter(adapter);

//        TextView textView = new TextView(getActivity());
//        textView.setText(R.string.hello_blank_fragment);
        return view; //textView;
    }

}
