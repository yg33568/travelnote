package com.localshop.travelnote.service;

import com.localshop.travelnote.dto.Result;
import com.localshop.travelnote.entity.ShopType;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 虎哥
 * @since 2021-12-22
 */
public interface IShopTypeService extends IService<ShopType> {

    Result querySort();
}
