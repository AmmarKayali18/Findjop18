package com.example.dell.navbot;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    public Itemdata[] itemdata;
    public MyAdapter(Itemdata[] itemdata)
    {
        this.itemdata=itemdata;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_recycler,null);
        MyViewHolder viewHolder=new MyViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
           holder.rec_title.setText(itemdata[position].title);
           holder.rec_detail.setText(itemdata[position].detail);
           holder.rec_img.setImageResource(itemdata[position].image);
    }

    @Override
    public int getItemCount() {
        return itemdata.length;
    }

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public class MyViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public  TextView rec_title,rec_detail;
        public ImageView rec_img;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public MyViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.

            super(itemView);

            rec_title = (TextView) itemView.findViewById(R.id.title_item);
            rec_detail=(TextView)itemView.findViewById(R.id.detail_item);
            rec_img = (ImageView) itemView.findViewById(R.id.image_item);
        }
        public int getItemCount()
        {
            return  itemdata.length;
        }
    }
}
   // Now that we've defined the basic adapter and ViewHolder, we need to begin filling in our adapter. First, let's store a member variable for the list of contacts and pass the list in through our constructor:


