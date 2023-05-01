package com.example.fatalframes.ViewHome;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fatalframes.Interface.ItemClickListener;
import com.example.fatalframes.R;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtProductionName, txtProductDescription, txtProductprice;
    public ImageView imageView;
    public ItemClickListener itemClickListener;
    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = (ImageView) itemView.findViewById(R.id.product_image);
        txtProductionName = (TextView) itemView.findViewById(R.id.product_name);
        txtProductDescription = (TextView) itemView.findViewById(R.id.product_description);
        txtProductprice = (TextView) itemView.findViewById(R.id.product_price);
    }
    public void setItemClickListener(ItemClickListener listener){
        this.itemClickListener = listener;
    }


    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view,getAdapterPosition(), false);
    }
}
