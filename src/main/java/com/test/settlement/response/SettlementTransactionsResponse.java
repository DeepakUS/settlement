package com.test.settlement.response;

import java.util.List;

import com.test.settlement.entity.Transaction;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @author deepak.udyawar
 * 
 *         Response Entity for the List of Settlement Transactions
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
public class SettlementTransactionsResponse
{
    Integer           totalrecords;
    List<Transaction> transactions;
}
