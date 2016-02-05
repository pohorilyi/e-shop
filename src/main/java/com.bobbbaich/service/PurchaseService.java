package com.bobbbaich.service;

import com.bobbbaich.model.Purchase;

import java.util.List;

/**
 * Created by Bohdan Pohotilyi on 09.01.2016.
 */
public interface PurchaseService {
    public void save(Purchase purchase);
    public Purchase findById(Long id);
    public List<Purchase> findAll();
    public List<Purchase> findPaid();
    public List<Purchase> findNotPaid();
}
