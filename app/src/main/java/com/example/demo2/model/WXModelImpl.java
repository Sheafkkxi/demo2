package com.example.demo2.model;



import com.example.demo2.bean.WXItemInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sheaf on 2018/2/27.
 */

public class WXModelImpl implements WXModel {
    List<WXItemInfo> mList;
    WXItemInfo wxItemInfo;
    @Override
    public List<WXItemInfo> initData() {
        mList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            wxItemInfo = new WXItemInfo();
            wxItemInfo.setTime(i +":11");
            wxItemInfo.setTitle("测试标题" +i);
            wxItemInfo.setContent("测试内容" +i);
            mList.add(wxItemInfo);
        }
        return mList;
    }
}
