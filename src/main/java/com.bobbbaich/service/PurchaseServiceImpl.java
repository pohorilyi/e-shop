package com.bobbbaich.service;

import com.bobbbaich.model.Purchase;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Bohdan Pohotilyi on 09.01.2016.
 */
@Service
@Transactional
public class PurchaseServiceImpl implements PurchaseService {

    @Override
    public void save(Purchase purchase) {

    }

    @Override
    public Purchase findById(Long id) {
        return null;
    }

    @Override
    public List<Purchase> findAll() {
        return null;
    }

    @Override
    public List<Purchase> findPaid() {
        return null;
    }

    @Override
    public List<Purchase> findNotPaid() {
        return null;
    }
}
