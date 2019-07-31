package com.geekplus.test.athena.rpc.facade.impl;

import java.util.Map;

import com.geekplus.athena.api.APIResponse;
import com.geekplus.athena.api.facade.WarehouseCallbackFacade;
import com.geekplus.athena.api.msg.body.v3_1_0.WarehouseCallbackBody;
import com.geekplus.athena.common.entity.api.msg.RequestHeader;


 public class WarehouseCallbackFacadeImpl implements WarehouseCallbackFacade<WarehouseCallbackBody> {
     @Override
     public APIResponse callback(RequestHeader header, WarehouseCallbackBody message) {
         return null;
     }
}
