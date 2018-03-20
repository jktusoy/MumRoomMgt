package co.mum.roommgt.util;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import co.mum.roommgt.model.Col;
 

public class ReflectionUtil<T> {
	//https://stackoverflow.com/questions/21956042/mapping-a-jdbc-resultset-to-an-object
	
	
	public ReflectionUtil()
	{	
	}
	
	 
	@SuppressWarnings("unchecked")
	public List<T> JavaObjectify (ResultSet rs, T obj) throws SecurityException, SQLException 
	{
		List<T> resultList = new ArrayList<T>();
		T dto;
		
		while (rs.next()) {
			try {
				dto = (T) obj.getClass().newInstance();

				List<Field> fields = Arrays.asList(obj.getClass().getDeclaredFields());

				for (Field field : fields) {
					Col col = field.getAnnotation(Col.class);
					if (col != null) {
						String name = col.name();
						try {
							System.out.println(rs.getString(name));
							String value = rs.getString(name);
						
							field.set(dto, field.getType().getConstructor(String.class).newInstance(value));
						} catch (Exception e) {
							 System.out.println(e.getMessage());
						}
					}
				}

				resultList.add(dto);
			} catch (InstantiationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		return resultList;
		
	}
	

 

}
