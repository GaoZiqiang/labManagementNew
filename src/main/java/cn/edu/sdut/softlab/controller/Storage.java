package cn.edu.sdut.softlab.controller;


import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.inject.Named;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import cn.edu.sdut.softlab.model.Wupin;


@RequestScoped
@Named
@Default
public class Storage {

	private String id;
	private String name;
	
  public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
	public void add() {
		// 读取hibernate.cfg.xml文件
				Configuration cfg = new Configuration().configure("resources/META-INF/hibernate.cfg.xml");

				// 建立SessionFactory
				SessionFactory factory = cfg.buildSessionFactory();

				// 取得session
				Session session = null;
				try {
					// 创建session
					session = factory.openSession();
					// 开启事务
					session.beginTransaction();
					
					
					//Wupin user = new Wupin("001", "晶体管");
					/*user.setId("001");
					user.setName("gao自强");
					user.setPassword("123");
					user.setSex("F");
					user.setEmail("163.com");*/

					// 保存User对象
					session.save(new Wupin("001", "晶体管"));

					// 提交事务
					session.getTransaction().commit();
				} catch (Exception e) {
					e.printStackTrace();
					// 回滚事务
					session.getTransaction().rollback();
				} finally {
					if (session != null) {
						if (session.isOpen()) {
							// 关闭session
							session.close();
						}
					}
				}
	}

 

}
