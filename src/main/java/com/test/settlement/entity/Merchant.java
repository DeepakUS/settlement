package com.test.settlement.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @author deepak.udyawar
 *         Merchant Entity
 */
@Getter
@Setter
@EqualsAndHashCode
@RequiredArgsConstructor
@ToString
public class Merchant
{
    String merchantId;
    String merchantName;
    String merchantType;
}
