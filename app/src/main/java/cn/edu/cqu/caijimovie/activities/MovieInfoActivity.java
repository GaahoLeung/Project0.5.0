package cn.edu.cqu.caijimovie.activities;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import cn.edu.cqu.caijimovie.R;
import cn.edu.cqu.caijimovie.entities.Movie;

public class MovieInfoActivity extends AppCompatActivity {
    Movie mMovie;
    AppBarLayout mAppBarLayout;
    NestedScrollView mNestedScrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_info);
        mAppBarLayout = findViewById(R.id.app_bar);
        mNestedScrollView = findViewById(R.id.include);
        mMovie = (Movie) getIntent().getSerializableExtra("onClickMovie");
        setTitle(null);

        //Todo:ToolBar的返回顶部
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CoordinatorLayout.Behavior behavior =
                        ((CoordinatorLayout.LayoutParams) mAppBarLayout.getLayoutParams()).getBehavior();
                if (behavior instanceof AppBarLayout.Behavior) {
                    AppBarLayout.Behavior appBarLayoutBehavior = (AppBarLayout.Behavior) behavior;
                    int topAndBottomOffset = appBarLayoutBehavior.getTopAndBottomOffset();
                    if (topAndBottomOffset != 0) {
                        appBarLayoutBehavior.setTopAndBottomOffset(0);
                        mNestedScrollView.fling(0);
                        mNestedScrollView.scrollTo(0, 0);
                    }
                }
                mAppBarLayout.setExpanded(true);

            }
        });
        setSupportActionBar(toolbar);

        //ToolBar返回按钮
        ImageButton imageButtonBack = findViewById(R.id.movie_info_back);
        imageButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        //Todo:通过UID和MID来设置Like图标样式,并通过http来上传
        FloatingActionButton fabLike = findViewById(R.id.fab_like);

        fabLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //Todo:进入评论页面,如果评论过....就先算了
        FloatingActionButton fabComment = findViewById(R.id.fab_comment);
        fabComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}
