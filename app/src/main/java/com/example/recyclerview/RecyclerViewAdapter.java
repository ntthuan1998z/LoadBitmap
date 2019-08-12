package com.example.recyclerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
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
        holder.textViewPrice.setText(data.get(position));

        URL url;
        try {
            url = new URL("data:image/png;base64,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");
            Bitmap bitmap = BitmapFactory.decodeStream(url.openConnection().getInputStream());
            holder.imageView.setImageBitmap(bitmap);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView textViewPrice;
        ImageView imageView;
        Button button;
        TextView textViewName;
        LinearLayout linearLayout;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewPrice = (TextView) itemView.findViewById(R.id.textViewPrice);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            button = (Button) itemView.findViewById(R.id.button);
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
