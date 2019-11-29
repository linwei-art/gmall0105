package com.mju.gmall.user.service;

import com.mju.gmall.user.bean.UmsMember;
import com.mju.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
