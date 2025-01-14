package com.entity.view;

import com.entity.SuzhixuexiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 素质学习
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-16 20:05:03
 */
@TableName("suzhixuexi")
public class SuzhixuexiView  extends SuzhixuexiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SuzhixuexiView(){
	}
 
 	public SuzhixuexiView(SuzhixuexiEntity suzhixuexiEntity){
 	try {
			BeanUtils.copyProperties(this, suzhixuexiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
