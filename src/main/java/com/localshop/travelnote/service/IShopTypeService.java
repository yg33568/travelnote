package com.localshop.travelnote.service;

import com.localshop.travelnote.dto.Result;
import com.localshop.travelnote.entity.ShopType;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 */
public interface IShopTypeService extends IService<ShopType> {

    Result querySort();
}
