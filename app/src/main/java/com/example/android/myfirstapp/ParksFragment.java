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
public class ParksFragment extends Fragment {






    public ParksFragment() {
        // Required empty public constructor
    }

    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<Category> parks = new ArrayList<>();

        view =inflater.inflate(R.layout.category_list,container,false);
        RecyclerView rv =view.findViewById(R.id.recycleView);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));














        parks.add(new Category("Парк Горького","ул. Крымский Вал, 9, Москва, 119049","http://strana.ru/media/images/original/original23153306.jpg"));
        parks.add(new Category("Сокольники","ул. Сокольнический Вал, 1, стр. 1, Москва","http://strana.ru/media/images/original/original23854335.jpg"));
        parks.add(new Category("ВДНХ","пр-т Мира, 119, Москва, 129223","https://kudamoscow.ru/uploads/616cc32a2bfde8134747b250b0f58d08.jpg"));
        parks.add(new Category("Зарядье","ул. Варварка, 8с1, Москва, 109012","https://img03.rl0.ru/afisha/1500x-/daily.afisha.ru/uploads/images/a/f1/af1bb838061b4090a23ea4b017dbdf04.png"));
        parks.add(new Category("Музей-заповедник Царицыно","Дольская ул., 1, Москва, 115569","https://upload.wikimedia.org/wikipedia/commons/thumb/2/28/%D0%91%D0%BE%D0%BB%D1%8C%D1%88%D0%BE%D0%B9-%D0%B4%D0%B2%D0%BE%D1%80%D0%B5%D1%86-%D0%BE%D1%82%D0%BA%D1%80%D1%8B%D1%82%D0%B8%D0%B5.jpg/1280px-%D0%91%D0%BE%D0%BB%D1%8C%D1%88%D0%BE%D0%B9-%D0%B4%D0%B2%D0%BE%D1%80%D0%B5%D1%86-%D0%BE%D1%82%D0%BA%D1%80%D1%8B%D1%82%D0%B8%D0%B5.jpg"));
        parks.add(new Category("Александровский сад","Москва, 119072","https://www.gardenvisit.com/uploads/image/image/185/18581/alexander_garden_original.jpg"));
        parks.add(new Category("Сад «Эрмитаж»","ул. Каретный Ряд, 3, Москва, 127006","http://www.mosgorsad.ru/upload/medialibrary/754/7544ec285f2c0fc94929ba92ceba3df9.jpg"));


        CategoryAdapter adapter = new CategoryAdapter(getContext(),parks);
        //RecyclerView rv = container.findViewById(R.id.recycleView);
        rv.setAdapter(adapter);

//        TextView textView = new TextView(getActivity());
//        textView.setText(R.string.hello_blank_fragment);
        return view; //textView;
    }

}
