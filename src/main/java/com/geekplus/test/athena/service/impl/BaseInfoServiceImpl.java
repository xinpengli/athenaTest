package com.geekplus.test.athena.service.impl;

import com.geekplus.test.athena.dao.BaseShelfMapper;
import com.geekplus.test.athena.entity.BaseShelf;
import com.geekplus.test.athena.entity.BaseShelfExample;
import com.geekplus.test.athena.service.BaseInfoService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public  class BaseInfoServiceImpl implements BaseInfoService {

   @Autowired
    private BaseShelfMapper baseShelfMapper;
   @Autowired
	private BaseShelf baseShelf;
    @Override
    public List<String> getShelfCodeList(int shelfNum) {
        RowBounds rowBounds= new RowBounds(0,shelfNum);
        List<String> shelfCodeList=new ArrayList<>();
        BaseShelfExample example = new BaseShelfExample();
        byte status = 4;
        example.or().andStatusEqualTo(status);
        List<BaseShelf> shelfList=baseShelfMapper.selectByExampleWithRowbounds(example,rowBounds);
        if(shelfList.size()>0){
            for (BaseShelf shelf:shelfList){
                shelfCodeList.add(shelf.getShelfCode());
            }
        }
        return shelfCodeList;
    }
    @Override
	public int insert(BaseShelf record) {
	int row=	baseShelfMapper.insert(record);
		
 		return row;
	}
	@Override
	public int deleteAllShelf() {
	 	BaseShelfExample example = new BaseShelfExample();
	 	return baseShelfMapper.deleteByExample(example);
 		  
	}
	@Override
	public void setShelfProperty(String shelfCode, int x, int y) {
		
		baseShelf.setShelfCode(shelfCode);
		baseShelf.setClassCode("A");
		baseShelf.setLocationX(x);
		baseShelf.setLocationY(y);
		baseShelf.setPlacementX(x);
		baseShelf.setPlacementY(y);
		 
		baseShelf.setWarehouseId(0);
		baseShelf.setLogicId(0);
		baseShelf.setStatus((byte) 4);
		baseShelf.setTemperature(0);
		baseShelf.setAngle(0F);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BaseShelf> getShlefListCondtion(String shelfCode,int startPlacementIndexX ,int startPlacementIndexY ,int endPlacementIndexX ,int endPlacementIndexY) {
		List<BaseShelf> shelfList = new ArrayList<>();
		BaseShelfExample example = new BaseShelfExample();
		if (shelfCode.equals("none")) {

			example.or().andPlacementXLessThanOrEqualTo(endPlacementIndexX).andPlacementXGreaterThan(startPlacementIndexX).andPlacementYGreaterThan(startPlacementIndexY).andPlacementYLessThan(endPlacementIndexY);

		} else {
			example.or().andPlacementXLessThanOrEqualTo(endPlacementIndexX).andPlacementXGreaterThan(startPlacementIndexX).andPlacementYGreaterThan(startPlacementIndexY).andPlacementYLessThan(endPlacementIndexY).andShelfCodeLike(shelfCode);
		}

		if (!baseShelfMapper.selectByExample(example).isEmpty()) {
			return baseShelfMapper.selectByExample(example);

		}
		return null;

	}


}

