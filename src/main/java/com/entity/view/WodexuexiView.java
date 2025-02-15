package com.entity.view;

import com.entity.WodexuexiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 我的学习
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-16 20:05:03
 */
@TableName("wodexuexi")
public class WodexuexiView  extends WodexuexiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WodexuexiView(){
	}
 
 	public WodexuexiView(WodexuexiEntity wodexuexiEntity){
 	try {
			BeanUtils.copyProperties(this, wodexuexiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
