package com.example.showdata.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.showdata.R;
import com.example.showdata.adapter.CurrencyListAdapter;
import com.example.showdata.databinding.ActivityMainBinding;
import com.example.showdata.model.CurrencyMainDataList;
import com.example.showdata.viewModel.CurrencyListViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    CurrencyListViewModel currencyListViewModel;
    ActivityMainBinding activityMainBinding;
    private LinearLayoutManager linearLayoutManager;
    private CurrencyListAdapter dataListAdapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        currencyListViewModel = new ViewModelProvider(this).get(CurrencyListViewModel.class);
        currencyListViewModel.getData().observe(this, new Observer<List<CurrencyMainDataList>>() {
            @Override
            public void onChanged(List<CurrencyMainDataList> currencyMainDataLists) {
                ///activityMainBinding.tv.setText("");
                for (int i=0; i<currencyMainDataLists.size();i++) {
                    Log.i("data", String.valueOf(currencyMainDataLists.get(i).getName()));
                    //activityMainBinding.tv.setText(activityMainBinding.tv.getText().toString()+currencyMainDataLists.get(i).getQuote().getUSD().getPrice()+"\n\n");
                }

                dataListAdapter = new CurrencyListAdapter(MainActivity.this, currencyMainDataLists,currencyListViewModel );
                activityMainBinding.recyclerview.setLayoutManager(linearLayoutManager);
                activityMainBinding.recyclerview.setAdapter(dataListAdapter);
                dataListAdapter.notifyDataSetChanged();
            }
        });
    }
}
