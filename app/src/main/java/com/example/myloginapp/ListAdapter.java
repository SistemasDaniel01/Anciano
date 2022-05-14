package com.example.myloginapp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<ListElement> nData;
    private LayoutInflater mInflater;
    private Context context;
    final ListAdapter.OnItemClickListener listener;

    public interface OnItemClickListener{
        void OnItemClick(ListElement item);
    }

    public ListAdapter(List<ListElement> itemList,Context context,ListAdapter.OnItemClickListener listener){
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.nData = itemList;
        this.listener = listener;
    }


    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.list_element,null);
        return new ListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder,final int position) {

        holder.bindData(nData.get(position));

    }

    @Override
    public int getItemCount() {
        return nData.size();
    }

    public void setItems(List<ListElement> items){nData = items;}

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView name,city,status;

        ViewHolder(View itemView){
            super(itemView);

            iconImage = itemView.findViewById(R.id.iconImageView);
            name = itemView.findViewById(R.id.nameTextView);
            city = itemView.findViewById(R.id.cityTextView);
            status = itemView.findViewById(R.id.statusTextView);



        }

        void bindData(final ListElement item){
            iconImage.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            name.setText(item.getName());
            city.setText(item.getCity());
            status.setText(item.getStatus());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.OnItemClick(item);
                }
            });
        }
    }
}

