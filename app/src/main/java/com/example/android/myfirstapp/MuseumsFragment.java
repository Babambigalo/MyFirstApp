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
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<Category> parks = new ArrayList<>();

        View view =inflater.inflate(R.layout.category_list,container,false);
        RecyclerView rv =view.findViewById(R.id.recycleView);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));














        parks.add(new Category("Государственный исторический музей","Красная пл., 1, Москва, 109012","8 (495) 692-40-19","http://mos-holidays.ru/wp-content/uploads/2015/01/istoricheskij-muzej-10-2015-3.jpg"));
        parks.add(new Category("Музей Отечественной войны 1812 года","пл. Революции, 2/3, Москва, 109012","8 (495) 692-40-19","http://strana.ru/media/images/original/original23854335.jpg"));
        parks.add(new Category("Государственная Третьяковская галерея","Лаврушинский пер., 10, Москва, 119017","8 (499) 230-77-88","https://artkassir.ru/sites/default/files/4_14.jpg"));
        parks.add(new Category("Оружейная палата","Московский Кремль, Москва, 125009","8 (495) 697-03-49","https://media-cdn.tripadvisor.com/media/photo-s/09/62/79/65/caption.jpg"));
        parks.add(new Category("Алмазный фонд","Кремль, Москва, 125009","8 (495) 629-20-36","http://mos-holidays.ru/wp-content/uploads/2010/02/almaznyi-fond3.jpg"));
        parks.add(new Category("Музей Победы","пл. Победы, 3, Москва, 121170","8 (499) 449-81-81","https://kudamoscow.ru/uploads/5cb111a5fd7561c372f68cf9dd7a210e.jpg"));
        parks.add(new Category("Московский Музей Современного Искусства","Тверской б-р, 9, Центральный АО, Москва, 123104","8 (495) 694-28-90","http://tournavigator.net/%D1%84%D0%BE%D1%82%D0%BE/other/1021/1009/1456485014.jpg"));


        CategoryAdapter adapter = new CategoryAdapter(getContext(),parks);

        rv.setAdapter(adapter);


        return view; //textView;
    }





}
