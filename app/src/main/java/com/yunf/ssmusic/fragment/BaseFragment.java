package com.yunf.ssmusic.fragment;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;

import static com.yunf.ssmusic.R.layout.activity;

/**
 * Created by Administrator on 2017/5/19 0019.
 */

public class BaseFragment extends Fragment {

    public Context mContext;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext = context;
    }
}
