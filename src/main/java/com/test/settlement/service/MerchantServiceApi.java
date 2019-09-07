package com.test.settlement.service;

import org.springframework.stereotype.Service;

/**
 * 
 * @author deepak.udyawar
 * 
 *         Contract to provide the API for Merchant Services
 */
public interface MerchantServiceApi
{
    public boolean isMerchantAvailable(String sMerchant);
}
