package example.manoj_pc.appsadt;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter {
        private ArrayList<EmpInfo> arrayList;


    public ListAdapter(ArrayList<EmpInfo> arrayList) {
        this.arrayList = arrayList;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return  new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        EmpInfo empInfo = arrayList.get(position);
        ((ListViewHolder)holder).mItemText.setText(empInfo.getName());
        ((ListViewHolder)holder).tvDesign.setText(empInfo.getDesignation());
        ((ListViewHolder)holder).mItemImage.setImageResource(empInfo.getImagepic());
//        ((ListViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    private class ListViewHolder extends  RecyclerView.ViewHolder implements View.OnClickListener{

        private  TextView tvDesign;
        private TextView mItemText;
        private ImageView mItemImage;

        public ListViewHolder(View itemView){
            super(itemView);
            mItemText = (TextView) itemView.findViewById(R.id.itemText);
            mItemImage =  (ImageView) itemView.findViewById(R.id.itemImage);
            tvDesign = (TextView) itemView.findViewById(R.id.tvDesign);
            itemView.setOnClickListener(this);

        }



        public void onClick(View view){

        }
    }
}
