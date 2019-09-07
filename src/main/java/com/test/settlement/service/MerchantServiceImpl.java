package com.test.settlement.service;

import org.springframework.stereotype.Service;

/**
 * 
 * @author deepak.udyawar
 *         Merchant Service API
 * 
 *         This Service can be used to implement to call the Merchant API End
 *         Point for below implementation
 *         1. Merchant Details
 *         2. Merchant Availability
 *         3. Merchant Counts
 *         4. Caching Merchants
 *         
 * 
 */
@Service
public class MerchantServiceImpl implements MerchantServiceApi
{

    public boolean isMerchantAvailable(String sMerchant)
    {

        if (sMerchant.equals("Merchant1"))
        {
            return true;
        }

        return false;
    }
}
