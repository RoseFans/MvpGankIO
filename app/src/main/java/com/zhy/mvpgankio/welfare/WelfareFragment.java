package com.zhy.mvpgankio.welfare;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhy.mvpgankio.R;
import com.zhy.mvpgankio.common.base.fragment.BaseFragment;

/**
 * 福利
 * Created by zhy on 2019/1/17.
 */
public class WelfareFragment extends BaseFragment {


    public WelfareFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_welfare, container, false);
    }

}
