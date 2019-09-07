package com.test.settlement.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.test.settlement.entity.Transaction;

/**
 * 
 * @author deepak.udyawar
 *         Implementation for the Database Repository to get all the Settlement
 *         Transactions
 * 
 *         This provides the mocked data to be returned from the database
 */
@Repository
public class TransactionRepository
{
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Transaction> findByMerchantandDate(String merchant, String date)
    {

        List<Transaction> transactionList = new ArrayList<Transaction>();
        Transaction transaction = new Transaction();
        transaction.setMerchantid("Merchant1");
        transaction.setId(1);
        transaction.setStatus(0);
        transaction.setType(1);
        transaction.setAmount(100);
        transaction.setDate(1567809914);
        transactionList.add(transaction);

        transaction = new Transaction();
        transaction.setMerchantid("Merchant1");
        transaction.setId(1);
        transaction.setStatus(0);
        transaction.setType(1);
        transaction.setAmount(100);
        transaction.setDate(1567809940);
        transactionList.add(transaction);

        return transactionList;
    }

}
