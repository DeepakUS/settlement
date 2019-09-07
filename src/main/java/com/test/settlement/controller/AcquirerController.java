package com.test.settlement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.settlement.controller.exception.NoContentException;
import com.test.settlement.controller.exception.RequestBadParamException;
import com.test.settlement.entity.Transaction;
import com.test.settlement.response.SettlementTransactionsResponse;
import com.test.settlement.service.MerchantServiceApi;
import com.test.settlement.service.SettlementServiceApi;

/**
 * 
 * @author deepak.udyawar
 *         Controller implementing the mocked data for the Settlement
 *         Transaction based queries
 * 
 * 
 */
@RestController
@RequestMapping("/acquirer")
public class AcquirerController
{
    @Autowired
    public SettlementServiceApi settlementApi;

    @Autowired
    public MerchantServiceApi   merchantApi;

    /**
     * 
     * @param  sDate                    - Date of Transactions
     * @param  sMerchant                - Merchant ID
     * @return                          Returns List of Transactions and total
     *                                  records of Transactions for the selected
     *                                  Date and Merchant
     * @throws RequestBadParamException - Invalid Request Parameter
     * @throws NoContentException       - If no Relevant Merchant is found.
     * 
     * 
     *                                  For Example:
     *                                  http://localhost:6565/acquirer/transactions?date=2019-08-08&merchant=Merchant1
     *                                  Returns the HTTP Status: 200 List of
     *                                  Transactions for Merchant1
     * 
     *                                  http://localhost:6565/acquirer/transactions?date=2019-08-08&merchant=Merchant2
     *                                  Returns the HTTP Status : 204
     * 
     *                                  http://localhost:6565/acquirer/transactions?date=2019-08-08&merchant=
     *                                  Returns the HTTP Status : 400
     */
    @GetMapping("transactions")
    public SettlementTransactionsResponse getTransactions(@RequestParam("date") String sDate,
                                                          @RequestParam("merchant") String sMerchant) throws RequestBadParamException,
                                                                                                      NoContentException
    {
        if (sMerchant == null || sMerchant.equals(""))
        {
            throw new RequestBadParamException("Merchant ID not Valid");
        }

        if (!merchantApi.isMerchantAvailable(sMerchant))
        {
            throw new NoContentException("Merchant ID not Found");
        }
        SettlementTransactionsResponse response = new SettlementTransactionsResponse();
        List<Transaction> list = settlementApi.getSettlementTransaction(sMerchant,
                                                                        sDate);
        response.setTotalrecords(list.size());
        response.setTransactions(list);
        return response;
    }
}
