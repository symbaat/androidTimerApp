package com.example.admin.mytimerapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CitiesAdapter extends RecyclerView.Adapter<CitiesAdapter.MyViewHolder> {

    private List<City> mCityList = new ArrayList<>();
    private Context mContext;

    public CitiesAdapter(Context context, List<City> mCityList) {
        this.mContext = context;
        this.mCityList = mCityList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.city_item, parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.name.setText(mCityList.get(position).getCityName());
        holder.mTextClock.setTimeZone(mCityList.get(position).getTimeZone());
        holder.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("addedCity", mCityList.get(position));
                ((Activity) mContext).setResult(Activity.RESULT_OK, intent);
                ((Activity) mContext).finish();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mCityList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private Button btnAdd;
        private TextClock mTextClock;

        public MyViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.cityName);
            btnAdd = itemView.findViewById(R.id.btnAdd);
            mTextClock = itemView.findViewById(R.id.currentTime);
        }
    }

}
