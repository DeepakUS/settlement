package com.test.settlement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.settlement.entity.Transaction;
import com.test.settlement.repository.TransactionRepository;

/**
 * 
 * @author deepak.udyawar
 *         Settlement Service API implementation
 * 
 *         Retrieves data from the Settlement Database.
 *         This Service Implements to get all the Settlement Transaction related
 *         queries
 *         
 */
@Service
public class SettlementServiceImpl implements SettlementServiceApi
{

    @Autowired
    TransactionRepository transactionRepo;

    @Override
    public List<Transaction> getSettlementTransaction(String sMerchantId, String sDate)
    {
        return transactionRepo.findByMerchantandDate(sMerchantId,
                                                     sDate);
    }

}
