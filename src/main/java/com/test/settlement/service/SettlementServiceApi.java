package com.test.settlement.service;

import java.util.List;

import com.test.settlement.entity.Transaction;

/**
 * 
 * @author deepak.udyawar
 *         Settlement Service API
 * 
 *         Contract to provide the API for Settlement Services.
 */
public interface SettlementServiceApi
{
    public List<Transaction> getSettlementTransaction(String sMerchantId, String sDate);
}
