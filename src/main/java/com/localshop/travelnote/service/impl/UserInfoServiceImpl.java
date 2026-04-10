package com.localshop.travelnote.service.impl;

import com.localshop.travelnote.entity.UserInfo;
import com.localshop.travelnote.mapper.UserInfoMapper;
import com.localshop.travelnote.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 虎哥
 * @since 2021-12-24
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
