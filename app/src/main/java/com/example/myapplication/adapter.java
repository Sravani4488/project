package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.ViewHolder> {

    Context context;
    ArrayList<modified> modifiedArrayList=new ArrayList<>();

    public adapter(Context context,ArrayList<modified> modifiedArrayList){
        this.context=context;
        this.modifiedArrayList=modifiedArrayList;

    }
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_feed,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
      final modified modified=modifiedArrayList.get(position);

      holder.t2.setText(modified.getComment());
      holder.t3.setText(modified.getSmile());
    }

    @Override
    public int getItemCount() {

        return modifiedArrayList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView t1,t2,t3,t4;
        ImageView i1,i2;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            t1=(TextView) itemView.findViewById(R.id.t1);
            t2=(TextView) itemView.findViewById(R.id.t2);
            t3=(TextView) itemView.findViewById(R.id.t3);
            t4=(TextView) itemView.findViewById(R.id.t4);

        }
    }
}
