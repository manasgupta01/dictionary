package com.example.dictionary.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionary.R;

public class MeaningsViewHolder extends RecyclerView.ViewHolder {
    public TextView textview_partsofspeech;
    public RecyclerView recycler_definitions;
    public MeaningsViewHolder(@NonNull View itemView) {
        super(itemView);
        recycler_definitions = itemView.findViewById(R.id.recycler_definitions);
        textview_partsofspeech = itemView.findViewById(R.id.textview_partsofspeech);
    }
}
