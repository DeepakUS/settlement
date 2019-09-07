package com.test.settlement.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * @author deepak.udyawar
 *         Mocked Transactions Entity
 */
@Getter
@Setter
@NoArgsConstructor
public class Transaction
{
    public Integer id;
    public Integer amount;
    public Integer date;
    public String  merchantid;
    public Integer status;
    public Integer type;
}
