package com.demo.utils;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**   
 *   自动生成实体生成xml文件
 * @author linzhenqiang  
 * @date  20:00 2018/7/18
 */
public class Tools {

	/******************************************** 以下为实体生成xml文件的方法 ***************************************************/

	public static void mapperStart(Object obj) {
		String className = obj.getClass().getName();
		StringBuffer mapperStartTag = new StringBuffer();
		mapperStartTag.append("<mapper namespace=\"")
				.append(className.replace("domain", "dao")).append("Dao")
				.append("\">");
		System.out.println(mapperStartTag);

	}

	public static void mapperEnd() {
		System.out.println("</mapper>");
	}

	/**
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 */
	public static void resultMap(Object obj) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException {
		String className = obj.getClass().getName();
		StringBuffer str = new StringBuffer();
		str.append("<resultMap type=")
				.append("\"")
				.append(className)
				.append("\"")
				.append(" id=")
				.append("\"")
				.append(className.substring(className.lastIndexOf(".") + 1,
						className.length())).append("\" >");
		System.out.println(str.toString());
		Class c = Class.forName(className);
		Field[] fields = c.getDeclaredFields();// 拿到数据成员
		for (Field f : fields) {
			String field = f.getName();
			if (field.equals("serialVersionUID")) {
				continue;
			}
			String column = propertyToColumn(field);
			StringBuffer str1 = new StringBuffer();
			if (field.equals("id")) {
				str1.append("<id property=\"").append(field).append("\" ")
						.append("column=\"").append(column.toLowerCase())
						.append("\" />");
			} else {
				str1.append("<result property=\"").append(field).append("\" ")
						.append("column=\"").append(column.toLowerCase())
						.append("\" />");
			}

			System.out.println("	 " + str1);
		}
		System.out.println("</resultMap>");
	}

	/**
	 * 根据实体生成查询和删除标签及sql语句
	 * 
	 * @param obj
	 * @param str
	 *            "select" 和 "delete"
	 * @throws ClassNotFoundException
	 */
	public static void createSelectOrDeleteTag(Object obj, String str)
			throws ClassNotFoundException {
		String className = obj.getClass().getName();
		StringBuffer tagStart = new StringBuffer();
		StringBuffer tagEnd = new StringBuffer();
		StringBuffer sql = new StringBuffer();
		String tableName = propertyToColumn(
				className.substring(className.lastIndexOf(".") + 1,
						className.length())).toLowerCase();
		tableName = tableName.substring(1, tableName.length());

		if ("select".equals(str)) {
			tagStart.append("<select id=\"get\" resultMap=\"")
					.append(className.substring(className.lastIndexOf(".") + 1,
							className.length()))
					.append("\" parameterType=\"String\">");
			sql.append("	select * from ").append(tableName)
					.append(" where id = #{id}");
			tagEnd.append("</select>");
		}
		if ("delete".equals(str)) {
			tagStart.append("<delete id=\"delete\"").append(
					" parameterType=\"String\">");
			sql.append("	delete from ").append(tableName)
					.append(" where id = #{id}");
			tagEnd.append("</delete>");
		}

		System.out.println(tagStart);
		System.out.println(sql);
		System.out.println(tagEnd);
	}

	/**
	 * 根据实体生成插入和修改标签及sql语句
	 * 
	 * @param obj
	 * @param str
	 *            "insert" 和 "update"
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public static void createInsertOrUpdateTag(Object obj, String str)
			throws ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		String className = obj.getClass().getName();
		StringBuffer tagStart = new StringBuffer();
		StringBuffer selectKey = new StringBuffer();
		StringBuffer propertyStr = new StringBuffer();
		StringBuffer paramsStr = new StringBuffer();
		StringBuffer sql = new StringBuffer();
		StringBuffer tagEnd = new StringBuffer();
		StringBuffer setParam = new StringBuffer();
		String tableName = propertyToColumn(
				className.substring(className.lastIndexOf(".") + 1,
						className.length())).toLowerCase();
		tableName = tableName.substring(1, tableName.length());
		if ("insert".equals(str)) {
			tagStart.append("<insert id=\"insert\" parameterType=\"")
					.append(className).append("\">");
			selectKey
					.append("	<selectKey resultType=\"String\" keyProperty=\"id\" order=\"BEFORE\" > select replace(uuid(),'-','') from dual </selectKey>");
			sql.append("	insert into ").append( tableName);
			propertyStr.append(" ( ");
			paramsStr.append(" values ( ");
			tagEnd.append("</insert>");

			Class c = Class.forName(className);
			Field[] fields = c.getDeclaredFields();// 拿到数据成员
			for (Field f : fields) {
				String field = f.getName();
				if (("serialVersionUID").equals(field)) {
					continue;
				}
				propertyStr.append(propertyToColumn(field)).append(",");
				paramsStr.append("#{").append(field).append("}").append(",");
			}
			propertyStr.replace(propertyStr.length() - 1, propertyStr.length(),
					"");
			propertyStr.append(" ) ");
			paramsStr.replace(paramsStr.length() - 1, paramsStr.length(), "");
			paramsStr.append(" ) ");
			sql.append(propertyStr).append(paramsStr);
		}

		if ("update".equals(str)) {
			tagStart.append("<update id=\"update\" parameterType=\"")
					.append(className).append("\">");
			sql.append("	update ").append( tableName).append(" set ");

			Class c = Class.forName(className);
			Field[] fields = c.getDeclaredFields();// 拿到数据成员
			for (Field f : fields) {
				String field = f.getName();
				if (("serialVersionUID").equals(field) || ("id").equals(field)) {
					continue;
				}
				setParam.append(propertyToColumn(field)).append("=#{")
						.append(field).append("},");
			}
			setParam.replace(setParam.length() - 1, setParam.length(), "");
			sql.append(setParam);
			sql.append(" where id = #{id} ");
			tagEnd.append("</update>");
		}

		System.out.println(tagStart);
		if(!"".equals(selectKey.toString()))
			System.out.println(selectKey);
		System.out.println(sql);
		System.out.println(tagEnd);
	}

	/**
	 * 将实体属性转为对应的字段
	 * 
	 * @param property
	 * @return
	 */
	public static String propertyToColumn(String property) {
		StringBuffer column = new StringBuffer();
		for (int i = 0; i < property.length(); i++) {
			char ch = property.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				column.append("_");
			}
			column.append(ch);
		}
		return column.toString().toLowerCase();
	}

	/**
	 * 输出mybatis文件头
	 */
	public static void printFileHeader() {
		System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
		System.out
				.println("<!DOCTYPE mapper PUBLIC \"-//mybatis.org//DTD Mapper 3.0//EN\" \"http://mybatis.org/dtd/mybatis-3-mapper.dtd\">");
	}

	/**
	 * 根据路径扫描所有文件
	 * 
	 * @param domainPath
	 * @return
	 */
	public static List<File> getAllDomain(String domainPath) {
		LinkedList<File> list = new LinkedList<File>();
		File dir = new File(domainPath);
		File file[] = dir.listFiles();
		for (int i = 0; i < file.length; i++) {
			if (file[i].getName().contains(".java")) {
				list.add(file[i]);
			}
		}
		return list;
	}

	/**
	 * 生成xml文件
	 * 
	 * @param domainPath
	 *            实体类所在的路径
	 * @param domainPackage
	 *            实体类所在的包名
	 * @param xmlOutputPath
	 *            输出目录
	 * @param object
	 *            如果为null ,生成实体类对应包下的所有xml文件。如果给定实体，则按给定的生成
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 * @throws FileNotFoundException
	 */
	public static void generateXML(String domainPath, String domainPackage,
			String xmlOutputPath, Object object) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException,
			FileNotFoundException {
		if (object == null) {
			List<File> files = getAllDomain(domainPath);
			for (File file : files) {
				String domainName = domainPackage
						+ file.getName().substring(0,
								file.getName().indexOf("."));
				Object domain = Class.forName(domainName).newInstance();

				String className = domain.getClass().getName();
				StringBuffer outputFileName = new StringBuffer();
				outputFileName.append(
						className.substring(className.lastIndexOf(".") + 1,
								className.length())).append("Dao.xml");

				PrintStream oldPrintStream = System.out;
				String outputFilePath = xmlOutputPath
						+ outputFileName.toString();
				FileOutputStream bos = new FileOutputStream(outputFilePath);
				System.setOut(new PrintStream(bos));

				printFileHeader();
				mapperStart(domain);
				resultMap(domain);
				createSelectOrDeleteTag(domain, new String("select"));
				createInsertOrUpdateTag(domain, new String("insert"));
				createInsertOrUpdateTag(domain, new String("update"));
				createSelectOrDeleteTag(domain, new String("delete"));
				mapperEnd();

				System.setOut(oldPrintStream);
			}
		} else {
			String className = object.getClass().getName();
			StringBuffer outputFileName = new StringBuffer();
			outputFileName.append(
					className.substring(className.lastIndexOf(".") + 1,
							className.length())).append("Dao.xml");

			PrintStream oldPrintStream = System.out;
			String outputFilePath = xmlOutputPath + outputFileName.toString();
			FileOutputStream bos = new FileOutputStream(outputFilePath);
			System.setOut(new PrintStream(bos));

			printFileHeader();
			mapperStart(object);
			resultMap(object);
			createSelectOrDeleteTag(object, new String("select"));
			createInsertOrUpdateTag(object, new String("insert"));
			createInsertOrUpdateTag(object, new String("update"));
			createSelectOrDeleteTag(object, new String("delete"));
			mapperEnd();

			System.setOut(oldPrintStream);
		}
	}

	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException,
			FileNotFoundException {
		// 实体类所在的路径
		String domainPath = "src/main/java/com/demo/domain/";
		 // 实体类所在的包名
		String domainPackage = "com.demo.domain.";
		 // 输出目录
		String xmlOutputPath = "D:/";

		 //此处如果object已经实例化，就会按照给定的实例生成xml
		// object为null时，生成所有实例的xml文件
		 //Object object = new Business();
        Object object=null;
		 generateXML(domainPath, domainPackage, xmlOutputPath, object);

		//new GenEntity();
	}
	

	/**   
	 * Description 自动生成实体类
	 */
	public static class GenEntity {

		private String packageOutPath = "com.demo.domain";// 指定实体生成所在包的路径
		private String[] colnames; // 列名数组
		private String[] colTypes; // 列名类型数组
		private int[] colSizes; // 列名大小数组
		private String[] colComment; // 列注释数组
		private boolean isNeedUtil = false; // 是否需要导入包java.util.*
		// 数据库连接
		private static final String URL = "jdbc:mysql://localhost:3306/mqps";
		private static final String NAME = "root";
		private static final String PASS = "123456";
		private static final String DRIVER = "org.gjt.mm.mysql.Driver";

		/*
		 * 构造函数
		 */
		public GenEntity() {
			// 创建连接
			Connection con;
			List<String> tableNames = getTableNameByCon();
			if(tableNames != null && tableNames.size() > 0) {
				for(String tableName : tableNames) {
					// 查要生成实体类的表
					String sql = "select * from " + tableName;
					Statement pStemt = null;
					try {
						try {
							Class.forName(DRIVER);
						} catch (ClassNotFoundException e1) {
							e1.printStackTrace();
						}
						con = DriverManager.getConnection(URL, NAME, PASS);
						pStemt = (Statement) con.createStatement();
						ResultSet rs = pStemt.executeQuery(sql);
						ResultSetMetaData rsmd = rs.getMetaData();
						int size = rsmd.getColumnCount(); // 统计列
						ResultSet resutlSet = con.getMetaData().getColumns(null, "%", tableName, "%");
						colComment = new String[size];
						int index=0;
						while (resutlSet.next()) {
							colComment[index] = resutlSet.getString("REMARKS");
							index++;
						}
						ResultSet rr = pStemt.executeQuery("SHOW CREATE TABLE " + tableName);
						String tableComment = "";
                        if(rr != null && rr.next()) {
                            String create = rr.getString(2);
                            tableComment = getTableComment(create);
                        }
						colnames = new String[size];
						colTypes = new String[size];
						colSizes = new int[size];
						for (int i = 0; i < size; i++) {
							colnames[i] = rsmd.getColumnName(i + 1);
							colTypes[i] = rsmd.getColumnTypeName(i + 1);
							if (colTypes[i].equalsIgnoreCase("date")
									|| colTypes[i].equalsIgnoreCase("datetime")) {
								isNeedUtil = true;
							}
							colSizes[i] = rsmd.getColumnDisplaySize(i + 1);
						}
						String content = parse(tableName,tableComment, colnames, colTypes, colSizes,colComment);

						try {
							String path = "D:";
							File file = new File(path);
							if (!file.exists()) {
								file.mkdirs();
							}
							String resPath = path + "/" + initcap(tableName,true).substring(0, initcap(tableName,true).length()) + ".java";
							System.out.println("resPath=" + resPath);
							FileUtils.writeStringToFile(new File(resPath), content);
						} catch (IOException e) {
							e.printStackTrace();
						}

					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}

		}
		
		 public String getTableComment(String all) {
             String comment = null;
             int index = all.indexOf("COMMENT='");
             if(index < 0) {
                     return "";
             }
             comment = all.substring(index+9);
             comment = comment.substring(0,comment.length() - 1);
             return comment;
		 }
		
		 public List<String> getTableNameByCon() { 
		    	List<String> tableNames = new ArrayList<String>();
	        	Connection con;
				try {
					con = DriverManager.getConnection(URL, NAME, PASS);
				
		        DatabaseMetaData meta = con.getMetaData();  
		        ResultSet rs = meta.getTables(null, "%", "%",new String[] { "TABLE" });  
		        while (rs.next()) {  
		        	tableNames.add(rs.getString("TABLE_NAME"));
		        	System.out.println(rs.getString("REMARKS"));
		        }  
		        con.close();  
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return tableNames;
		     }  

		/**
		 * 功能：生成实体类主体代码
		 * 
		 * @param colnames
		 * @param colTypes
		 * @param colSizes
		 * @return
		 */
		private String parse(String tableName,String tableComment,String[] colnames, String[] colTypes,
				int[] colSizes,String[] colComments) {
			StringBuffer sb = new StringBuffer();

			sb.append("package " + this.packageOutPath + ";\r\n");
			sb.append("import java.io.Serializable;\r\n");
			// 判断是否导入工具包
			if (isNeedUtil) {
				sb.append("import java.util.Date;\r\n");
			}
			sb.append("\r\n");
			// 注释部分
			sb.append("/**\r\n");
			sb.append(" * " + ("".equals(tableComment) ? tableName : tableComment) + " 实体类\r\n");
			sb.append(" */ \r\n");
			// 实体部分
			sb.append("public class " + initcap(tableName,true).substring(0, initcap(tableName,true).length()) + " implements Serializable {\r\n");
			processAllAttrs(sb);// 属性
			processAllMethod(sb);// get set方法
			sb.append("}\r\n");

			return sb.toString();
		}

		/**
		 * 功能：生成所有属性
		 * 
		 * @param sb
		 */
		private void processAllAttrs(StringBuffer sb) {

			for (int i = 0; i < colnames.length; i++) {
				sb.append("\tprivate " + sqlType2JavaType(colTypes[i]) + " "
						+ initcap(colnames[i],false) + ";");
				if(colComment[i] != null && !"".equals(colComment[i])) {
					sb.append("\t// " + colComment[i] + "\r\n");
				} else {
					sb.append("\r\n");
				}
			}

		}

		/**
		 * 功能：生成所有方法
		 * 
		 * @param sb
		 */
		private void processAllMethod(StringBuffer sb) {

			for (int i = 0; i < colnames.length; i++) {
				sb.append("\tpublic void set" + initcap(colnames[i],true) + "("
						+ sqlType2JavaType(colTypes[i]) + " " + initcap(colnames[i],false)
						+ "){\r\n");
				sb.append("\t\tthis." + initcap(colnames[i],false) + " = " + initcap(colnames[i],false) + ";\r\n");
				sb.append("\t}\r\n");
				sb.append("\tpublic " + sqlType2JavaType(colTypes[i]) + " get"
						+ initcap(colnames[i],true) + "(){\r\n");
				sb.append("\t\treturn " + initcap(colnames[i],false) + ";\r\n");
				sb.append("\t}\r\n");
			}

		}

		/**
		 * 功能：将输入字符中间的"_"去掉，并将后面的字母换成大写
		 * 
		 * @param str
		 * @return
		 */
		private String initcap(String str,boolean isFirstUpper) {
			StringBuffer sb = new StringBuffer();
			if(str.contains("_")) {
				String[] sList = str.split("_");
				if(sList != null && sList.length > 0) {
					for(int i=0;i<sList.length;i++) {
						char[] array = sList[i].toCharArray();
						if(i > 0 || (isFirstUpper == true && i== 0)) {
							array[0] -= 32;
						}
						sb.append(String.valueOf(array));
					}
				}
			} else {
				char[] array = str.toCharArray();
				if(isFirstUpper)
					array[0] -= 32;
				sb.append(String.valueOf(array));
			}
			return sb.toString();
		}

		/**
		 * 功能：获得列的数据类型
		 * 
		 * @param sqlType
		 * @return
		 */
		private String sqlType2JavaType(String sqlType) {
			if (sqlType.equalsIgnoreCase("double")) {
				return "double";
			} else if (sqlType.equalsIgnoreCase("char")
					|| sqlType.equalsIgnoreCase("varchar2")) {
				return "String";
			}else if (sqlType.equalsIgnoreCase("int")
					|| sqlType.equalsIgnoreCase("tinyint")) {
				return "int";
			}else if (sqlType.equalsIgnoreCase("date")
					|| sqlType.equalsIgnoreCase("datetime")) {
				return "Date";
			} else if (sqlType.equalsIgnoreCase("bigint")) {
				return "long";
			}
			return "String";
		}
	}
}
