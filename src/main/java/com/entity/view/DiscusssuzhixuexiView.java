package com.entity.view;

import com.entity.DiscusssuzhixuexiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 素质学习评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-16 20:05:03
 */
@TableName("discusssuzhixuexi")
public class DiscusssuzhixuexiView  extends DiscusssuzhixuexiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusssuzhixuexiView(){
	}
 
 	public DiscusssuzhixuexiView(DiscusssuzhixuexiEntity discusssuzhixuexiEntity){
 	try {
			BeanUtils.copyProperties(this, discusssuzhixuexiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
