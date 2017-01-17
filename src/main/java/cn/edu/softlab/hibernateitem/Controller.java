package cn.edu.softlab.hibernateitem;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Controller {
   
	public void insertItem() {

		// 读取hibernate.cfg.xml文件
		Configuration cfg = new Configuration().configure();

		// 建立SessionFactory
		SessionFactory factory = cfg.buildSessionFactory();

		// 取得session
		Session session = null;
		try {
			// 创建session
			session = factory.openSession();
			// 开启事务
			session.beginTransaction();
			
			
			Person user = new Person("001", "gaoziqiang", "001", "nan", "163.com");
			/*user.setId("001");
			user.setName("gao自强");
			user.setPassword("123");
			user.setSex("F");
			user.setEmail("163.com");*/

			// 保存User对象
			session.save(user);

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