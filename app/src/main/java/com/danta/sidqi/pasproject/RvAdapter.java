package com.danta.sidqi.pasproject;

import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import javax.security.auth.callback.Callback;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.ListViewHolder> {
    private Callback callback;
    private ArrayList<Model> list;

    interface Callback{
        void onClick(int position);
    }
    public RvAdapter (ArrayList<Model> list, Callback callback){
        this.callback = callback;
        this.list = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.listitem, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        holder.txtttl.setText(list.get(position).getRcpname());
        holder.txtdiff.setText(list.get(position).getDiff());
        holder.txtinfo.setText(list.get(position).getInfo());
        holder.imgv.setImageResource(list.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return (list != null) ? list.size() : 0;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        private TextView txtttl, txtdiff, txtinfo;
        private ImageView imgv;
        private CardView card;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            txtttl = (TextView) itemView.findViewById(R.id.ttl);
            txtdiff = (TextView) itemView.findViewById(R.id.diff);
            txtinfo = (TextView) itemView.findViewById(R.id.info);
            imgv = (ImageView) itemView.findViewById(R.id.rcpimg);
            card = (CardView) itemView.findViewById(R.id.card);
            card.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    callback.onClick(getAdapterPosition());
                }
            });


        }
    }
}
