package com.vsrpp.onlineshop.service;

import com.vsrpp.onlineshop.entity.Edelivery;

public interface EdeliveryService extends GeneralService <Edelivery> {
    Edelivery findByName(String name);
}
