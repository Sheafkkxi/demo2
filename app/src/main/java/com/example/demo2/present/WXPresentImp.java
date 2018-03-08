package com.example.demo2.present;



import com.example.demo2.bean.WXItemInfo;
import com.example.demo2.model.WXModel;
import com.example.demo2.model.WXModelImpl;
import com.example.demo2.view.WXView;

import java.util.List;

/**
 * Created by Sheaf on 2018/2/27.
 */

public class WXPresentImp implements WXPresent {

    private WXModel wxModel;
    private WXView wxView;
    private List<WXItemInfo> mList;

    public WXPresentImp(WXView wxView) {
        this.wxView = wxView;
        wxModel = new WXModelImpl();
    }

    @Override
    public void loadData() {
        mList = wxModel.initData();
        wxView.setData(mList);
    }
}
