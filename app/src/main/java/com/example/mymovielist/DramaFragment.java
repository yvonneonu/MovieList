package com.example.mymovielist;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DramaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DramaFragment extends Fragment {

    MyAdapter dramaFilm;
    List<MyMovie> dramaMovies;
    RecyclerView rv;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DramaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DramaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DramaFragment newInstance(String param1, String param2) {
        DramaFragment fragment = new DramaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DramaMovie dramaHouse = new DramaMovie();
        dramaMovies = dramaHouse.funnyMovie();

        dramaFilm = new MyAdapter(dramaMovies, getActivity());
        dramaFilm.CallAdapter(new MyAdapter.MyAdapterListener() {
            @Override
            public void movieAdapterListener(int position) {
                Intent intent = new Intent(getActivity(), AnotherActivity2.class);
                MyMovie movie = dramaMovies.get(position);
                intent.putExtra("Name", movie);
                startActivity(intent);
            }
        });




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_action, container, false);
        rv = view.findViewById(R.id.recyclerView);
        rv.setAdapter(dramaFilm);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }
}