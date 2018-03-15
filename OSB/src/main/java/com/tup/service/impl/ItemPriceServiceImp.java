package com.tup.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tup.mssql.mapper.ItemPriceMapper;
import com.tup.mssql.model.ItemPrice;
import com.tup.service.IItemPriceService;
@Service
public class ItemPriceServiceImp extends ServiceImpl<ItemPriceMapper, ItemPrice> implements IItemPriceService {

}
