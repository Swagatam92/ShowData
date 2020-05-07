package com.example.showdata.viewModel;

import android.app.Application;

import com.example.showdata.model.CurrencyMainDataList;
import com.example.showdata.repository.CurrencyRepository;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class CurrencyListViewModel extends AndroidViewModel {
    CurrencyRepository repository;

    public CurrencyListViewModel(@NonNull Application application) {
        super(application);
        this.repository = new CurrencyRepository(application);
    }
    public LiveData<List<CurrencyMainDataList>> getData(){
        return repository.fetchAlldata();
    }
}
