package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    private List<String> data = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(Context context, List<String> data) {
        //mContext = context;
        this.data = data;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_item, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.RecyclerViewHolder holder, int position) {
        holder.textViewName.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        LinearLayout linearLayout;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.line);
        }
    }
}

//public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>{
//
//    private Context mContext;
//    private List<String> data = new ArrayList<>();
//
//    public RecyclerViewAdapter(Context mContext, List<String> data) {
//        this.mContext = mContext;
//        this.data = data;
//    }
//
//    @Override
//    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
//        View view = inflater.inflate(R.layout.layout_item, parent, false);
//        return new RecyclerViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(final RecyclerViewHolder holder, int position) {
//        holder.txtUserName.setText(data.get(position));
//        holder.line.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                holder.line.setBackgroundColor(ContextCompat.getColor(mContext, R.color.colorAccent));
//                if (onItemClickedListener != null) {
//                    onItemClickedListener.onItemClick(holder.txtUserName.getText().toString());
//                }
//            }
//        });
//    }
//
//    @Override
//    public int getItemCount() {
//        return data.size();
//    }
//
//
//    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
//        TextView txtUserName;
//        LinearLayout line;
//        public RecyclerViewHolder(View itemView) {
//            super(itemView);
//            txtUserName = (TextView) itemView.findViewById(R.id.textViewName);
//            line = (LinearLayout) itemView.findViewById(R.id.line);
//        }
//    }
//
//    public interface OnItemClickedListener {
//        void onItemClick(String username);
//    }
//
//    private OnItemClickedListener onItemClickedListener;
//
//    public void setOnItemClickedListener(OnItemClickedListener onItemClickedListener) {
//        this.onItemClickedListener = onItemClickedListener;
//    }
//}
