package com.dhinojosac.android.requestincidents.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dhinojosac.android.requestincidents.R;
import com.dhinojosac.android.requestincidents.http.apimodel.Incidencium;

import java.util.ArrayList;

/**
 * Created by negro-PC on 21-Dec-16.
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomHolder> {

    private ArrayList<Incidencium> incidenciumaArrayList;
    private RecyclerItemClickListener recyclerItemClickListener;

    public void setRecyclerItemClickListener(RecyclerItemClickListener recyclerItemClickListener) {
        this.recyclerItemClickListener = recyclerItemClickListener;
    }

    public CustomAdapter() {
    }

    public CustomAdapter(ArrayList<Incidencium> rowDataArrayList) {
        this.incidenciumaArrayList = rowDataArrayList;
    }

    @Override
    public CustomHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        return new CustomHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomHolder holder, int position) {
        final Incidencium incidencium = incidenciumaArrayList.get(position);
        holder.title.setText(incidencium.getTitulo());
    }

    @Override
    public int getItemCount() {
        return incidenciumaArrayList.size();
    }

    public class CustomHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView title;
        ImageView imageView;

        public CustomHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.txtv_row_item);
            imageView = (ImageView) itemView.findViewById(R.id.img_row_item);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            if (recyclerItemClickListener != null) {
                recyclerItemClickListener.onItemClickListener(getAdapterPosition());
            }

        }
    }




}
