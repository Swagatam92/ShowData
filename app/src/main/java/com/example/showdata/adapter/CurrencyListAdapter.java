package com.example.showdata.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.showdata.R;
import com.example.showdata.databinding.LayoutDataBinding;
import com.example.showdata.model.CurrencyMainDataList;
import com.example.showdata.viewModel.CurrencyListViewModel;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

public class CurrencyListAdapter extends RecyclerView.Adapter<CurrencyListAdapter.CustomViewHolder> {

    public CurrencyListAdapter(Context context, List<CurrencyMainDataList> priceLists, CurrencyListViewModel currencyListViewModel) {
        this.context = context;
        this. priceList= priceLists;
        this.currencyListViewModel = currencyListViewModel;

    }

    Context context;
    private List<CurrencyMainDataList> priceList;
    private CurrencyListViewModel currencyListViewModel;


    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        LayoutDataBinding layoutDataBinding = DataBindingUtil.inflate(layoutInflater, R.layout.layout_data, parent, false);
        return new CustomViewHolder(layoutDataBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        CurrencyMainDataList currencyMainDataList = priceList.get(position);
        holder.setBinding(currencyMainDataList, currencyListViewModel);
    }


    @Override
    public int getItemCount() {
        return priceList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder{

        LayoutDataBinding binding;

        public CustomViewHolder(LayoutDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        void setBinding(CurrencyMainDataList currencyMainDataList, CurrencyListViewModel currencyListViewModel){
            binding.setCurrencyData(currencyMainDataList);
            binding.setViewModel(currencyListViewModel);
            binding.executePendingBindings();
        };
    }
}
