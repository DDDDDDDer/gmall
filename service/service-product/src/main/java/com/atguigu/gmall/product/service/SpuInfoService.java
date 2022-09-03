package com.atguigu.gmall.product.service;

import com.atguigu.gmall.model.product.SpuInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @description 针对表【spu_info(商品表)】的数据库操作Service
*/
public interface SpuInfoService extends IService<SpuInfo> {

    /**
     * Spu信息大保存
     * @param info
     */
    void saveSpuInfo(SpuInfo info);
}
