package com.example.demo2.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.demo2.R;
import com.example.demo2.bean.WXItemInfo;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * 聊天通信适配器
 * Created by idisfkj on 16/4/22.
 * Email : idisfkj@qq.com.
 */
public class WXAdapter extends RecyclerView.Adapter<WXAdapter.ViewHolder> {
    private LayoutInflater mLayoutInflater;
    private Context mContext;
    private List<WXItemInfo> wxItemInfos;

    public WXAdapter(Context context) {
        super();
        mLayoutInflater = LayoutInflater.from(context);
        mContext = context;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.wx_item, parent, false);
        ViewHolder holder= new ViewHolder(view);
        return  holder;
    }

    @Override
    public void onBindViewHolder(WXAdapter.ViewHolder holder, int position) {
        WXItemInfo wxItemInfo = wxItemInfos.get(position);
        holder.wxItemTitle.setText(wxItemInfo.getTitle());
        holder.wxItemContent.setText(wxItemInfo.getContent());
        holder.wxItemTime.setText(wxItemInfo.getTime());
    }

    @Override
    public int getItemCount() {
        return wxItemInfos.size();
    }

    public void addData(List<WXItemInfo> list) {
        wxItemInfos = list;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
      /*  @InjectView(R.id.wx_item_picture)
        ImageView wxItemPicture;*/
        @InjectView(R.id.wx_item_title)
        TextView wxItemTitle;
        @InjectView(R.id.wx_item_time)
        TextView wxItemTime;
        @InjectView(R.id.wx_item_content)
        TextView wxItemContent;
        //public int unReadNum;
        ViewHolder(View view) {
            super(view);
            ButterKnife.inject(this, view);
        }
    }
}
