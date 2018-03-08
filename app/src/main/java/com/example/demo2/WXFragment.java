package com.example.demo2;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.demo2.adapter.WXAdapter;
import com.example.demo2.bean.WXItemInfo;
import com.example.demo2.present.WXPresentImp;
import com.example.demo2.view.WXView;

import java.util.List;


import butterknife.ButterKnife;
import butterknife.InjectView;


/**
 * Created by Sheaf on 2018/3/7.
 */

public class WXFragment extends Fragment implements WXView {
    @InjectView(R.id.wx_recyclerView)
    RecyclerView wxRecyclerView;
    private WXAdapter wxAdapter;
    private WXPresentImp mWXPresentImp;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.wx_layout, null);

        ButterKnife.inject(this, view);
        wxAdapter = new WXAdapter(getContext());
        mWXPresentImp = new WXPresentImp(this);
        mWXPresentImp.loadData();
        wxRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        wxRecyclerView.addItemDecoration(new WXItemDecoration(getContext()));
        wxRecyclerView.setAdapter(wxAdapter);
        return view;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void setData(List<WXItemInfo> list) {

        wxAdapter.addData(list);
    }
}
