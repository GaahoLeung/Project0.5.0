package cn.edu.cqu.caijimovie.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import cn.edu.cqu.caijimovie.R;
import cn.edu.cqu.caijimovie.adapter.MovieCardAdapter;
import cn.edu.cqu.caijimovie.entities.Movie;


public class MainRecommendFragment extends MyFragment {

    private ArrayList<Movie> RecommendList = new ArrayList<>();

    private RecyclerView recyclerView;
    private MovieCardAdapter movieCardAdapter;

    public MainRecommendFragment() {
        super("Recommend");
        // Required empty public constructor
    }

    //
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //实例化recyclerView
        recyclerView = getActivity().findViewById(R.id.main_recommend_recycler);

        //初始化数据
        initData();

        //设置适配器
//        movieCardAdapter=new MovieCardAdapter(getActivity(),RecommendList);
//        recyclerView.setAdapter(movieCardAdapter);
//        movieCardAdapter.setOnItemClickListener(new MovieCardAdapter.OnItemClickListener() {
//            @Override
//            public void onItemClick(View view, Movie movie) {
//                //Todo:这里写MovieInfoActivity的页面跳转()
//
//            }
//        });
    }

    private void initData() {
        //Todo:用来获取推荐的Movie类列表,并添加到RecommendList里面

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_recommend, container, false);
    }


}
