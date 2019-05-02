package com.longtextsample.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.longtextsample.model.MyModel;
import com.longtextsample.R;

import java.util.ArrayList;

/**
 * Created by Danish on 5/18/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private ArrayList<MyModel> mStoreMyModelArrayList;


    public MyAdapter(Activity activity, ArrayList<MyModel> storeMyModelArrayList) {
        this.mContext = activity;
        this.mStoreMyModelArrayList = storeMyModelArrayList;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_my_cart,
                parent, false);
        return new MyCartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final MyModel item = getValueAt(position);
        MyAdapter.MyCartViewHolder myCartViewHolder = (MyAdapter.MyCartViewHolder)holder;
        if (item != null) {
            setupValuesInWidgets(myCartViewHolder, item);
        }
    }


    private MyModel getValueAt(int position) {
        return mStoreMyModelArrayList.get(position);
    }

    @Override
    public int getItemCount() {
        return mStoreMyModelArrayList.size();
    }

    private void setupValuesInWidgets(MyAdapter.MyCartViewHolder itemHolder, MyModel
            cartMyModel) {
        if (cartMyModel != null) {
                itemHolder.title.setText(Html.fromHtml(cartMyModel.getTitle()));
        }
    }


    public class MyCartViewHolder extends RecyclerView.ViewHolder {

        AppCompatTextView title;

        public MyCartViewHolder(View itemView) {
            super(itemView);

            title=itemView.findViewById(R.id.title);

        }
    }
}
