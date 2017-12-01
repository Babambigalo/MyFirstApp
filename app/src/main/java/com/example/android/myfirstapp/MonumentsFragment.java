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
public class MonumentsFragment extends Fragment {


    public MonumentsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<Category> parks = new ArrayList<>();

        View view =inflater.inflate(R.layout.category_list,container,false);
        RecyclerView rv =view.findViewById(R.id.recycleView);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));













        parks.add(new Category("Памятник Минину и Пожарскому","Красная Площадь, Москва, 109012","http://img.7ya.ru/tests/159/20121016033657.jpg"));
        parks.add(new Category("Памятник Петру I","Крымская наб., Москва, 119072","https://upload.wikimedia.org/wikipedia/ru/b/be/Monument_to_Peter_the_Great_in_Moscow.jpg"));
        parks.add(new Category("Памятник героям Плевны","пл. Ильинские Ворота, Москва, 101000","http://content.foto.mail.ru/mail/karpenko_10n/1463/i-2730.jpg"));
        parks.add(new Category("Памятник маршалу Жукову","Манежная пл., Москва, 109012","http://svtihon.ru/sites/default/files/pamyatnik_marshalu_zhukovu_v_moskve_skulptor_v.klykov.jpg"));
        parks.add(new Category("Памятник Карлу Марксу","Театральный пр-д, 1/4, Москва, 109012","http://www.mytravelbook.org/object_foto/2016/03/Pamjatnik_Karlu_Marksu_2.jpg"));
        parks.add(new Category("Памятник Гагарину на Ленинском проспекте","пл. Гагарина, Москва, 119334","https://team.mail.ru/wp-content/uploads/2014/10/15-730x486.jpg"));
        parks.add(new Category("Памятник Владимиру Великому","Боровицкая пл., Москва, 125009","https://strana.ua/pub/a/a/9/a9b32ee0dfaab3f54c12b7b1535c2d9a.jpg"));
        parks.add(new Category("Рабочий и колхозница","пр-т Мира, 123Б, Москва, 129344","https://upload.wikimedia.org/wikipedia/ru/1/1b/WorkerAndKolkhozWoman_20100322.jpg"));



        CategoryAdapter adapter = new CategoryAdapter(getContext(),parks);
        rv.setAdapter(adapter);

        return view; //textView;
    }

}
