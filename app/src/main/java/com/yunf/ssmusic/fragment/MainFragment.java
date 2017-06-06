package com.yunf.ssmusic.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yunf.ssmusic.R;
import com.yunf.ssmusic.adapter.MainFragmentAdapter;
import com.yunf.ssmusic.adapter.MainFragmentItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/19 0019.
 */

public class MainFragment extends BaseFragment {
    private MainFragmentAdapter mAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private List<MainFragmentItem> mList = new ArrayList<>();
//    private PlaylistInfo playlistInfo; //playlist 管理类
    private SwipeRefreshLayout swipeRefresh; //下拉刷新layout

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }
}
