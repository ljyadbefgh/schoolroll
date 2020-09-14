package com.jhxx.schoolroll.base;

import org.apache.ibatis.annotations.*;
import org.mybatis.spring.annotation.MapperScan;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 基于JPA实体的MyBatic通用DAO类
 * @author Sinlon
 */
@Mapper
@MapperScan
public interface BaseDAO备份<Entity extends Serializable> {
	/**
	 * 通用添加方法
	 * @param TABLE_NAME 表名
	 * @param COLUMNS 列数据
	 * @return Map数据
	 */
	@Insert("<script>"
			+ "INSERT INTO ${TABLE_NAME} ("
			+ "<foreach collection='COLUMNS' index='key' item='val' separator=','> `${key}` </foreach>" 
			+ ") values (" 
			+ "<foreach collection='COLUMNS' index='key' item='val' separator=','> #{val} </foreach>" 
			+ ")"
			+ "</script>")
	@Options(useGeneratedKeys=true, keyProperty="COLUMNS.ID_DATA_VALUE",keyColumn="ID_COLUMN")
	public int save(@Param("TABLE_NAME") String TABLE_NAME, @Param("ID_COLUMN") String ID_COLUMN, @Param("COLUMNS") Map<String, Object> COLUMNS);

	/**
	 * 通用复合主键/联合主键删除方法
	 * @param TABLE_NAME 表名
	 * @param ID_COLUMNS ID列名
	 * @return 是否成功
	 */
	@Delete("<script>"
			+ "DELETE FROM ${TABLE_NAME} WHERE "
			+ "<foreach collection='ID_COLUMNS' index='key' item='val' separator=' and '> `${key}` = #{val} </foreach>"
			+ "</script>")
	public int delete(@Param("TABLE_NAME") String TABLE_NAME, @Param("ID_COLUMNS") Map<String, Object> ID_COLUMNS);

	/**
	 * 通用修改方法
	 * @param TABLE_NAME 表名
	 * @param ID_DATAS ID列数据
	 * @param COLUMNS 列数据
	 * @return Map数据
	 */
	@Update("<script>"
			+ "UPDATE ${TABLE_NAME} SET " 
			+ "<foreach collection='COLUMNS' index='key' item='val' separator=','> `${key}` = #{val} </foreach> " 
			+ "WHERE "
			+ "<foreach collection='ID_DATAS' index='key' item='val' separator=' and '> `${key}` = #{val} </foreach>"
			+ "</script>")
	public int update(@Param("TABLE_NAME") String TABLE_NAME, @Param("ID_DATAS") Map<String, Object> ID_DATAS, @Param("COLUMNS") Map<String, Object> COLUMNS);

	/**
	 * 通用ID查询方法
	 * @param TABLE_NAME 表名
	 * @param ID_DATAS ID列数据
	 * @return Map数据
	 */
	@Select("<script>"
			+ "SELECT * FROM ${TABLE_NAME} WHERE " 
			+ "<foreach collection='ID_DATAS' index='key' item='val' separator=' and '> `${key}` = #{val} </foreach>"
			+ "LIMIT 1"
			+ "</script>")
	public Map<String, Object> find(@Param("TABLE_NAME") String TABLE_NAME, @Param("ID_DATAS") Map<String, Object> ID_DATAS);

	/**
	 * 通用条件查询方法
	 * @param TABLE_NAME 表名
	 * @param COLUMNS 条件列数据
	 * @return list数据
	 */
	@Select("<script>"
			+ "SELECT "
			+ "<foreach collection='TABLE_COLUMNS' index='key' item='val' separator=','>`${key}`</foreach>"
			+ " FROM ${TABLE_NAME} WHERE " 
			+ "<foreach collection='COLUMNS' index='key' item='val' separator=' and '> `${key}` = #{val} </foreach>"
			+ "</script>")
	public List<Map<String, Object>> where(@Param("TABLE_NAME") String TABLE_NAME, @Param("TABLE_COLUMNS") Map<String, Object> TABLE_COLUMNS, @Param("COLUMNS") Map<String, Object> COLUMNS);
	public List<Map<String, Object>> where(@Param("TABLE_NAME") String TABLE_NAME, @Param("TABLE_COLUMNS") LinkedHashMap<String, Object> TABLE_COLUMNS, @Param("COLUMNS") Map<String, Object> COLUMNS);

	/**
	 * 通用条件查询方法2
	 * @param TABLE_NAME 表名
	 * @param where 条件列数据
	 * @return list数据
	 */
	@Select("<script>"
			+ "SELECT "
			+ "<foreach collection='TABLE_COLUMNS' index='key' item='val' separator=','>`${key}`</foreach>"
			+ " FROM ${TABLE_NAME} WHERE ${WHERE}"
			+ "</script>")
	public List<Map<String, Object>> wheres(@Param("TABLE_NAME") String TABLE_NAME, @Param("TABLE_COLUMNS") Map<String, Object> TABLE_COLUMNS, @Param("WHERE") String where);

	/**
	 * 通用分页查询方法
	 * @param TABLE_NAME 表名
	 * @param COLUMNS 条件列数据
	 * @param ORDER_COLUMN 排序列
	 * @param ORDER_TYPE 排序方式
	 * @param PAGE_START 分页开始行数
	 * @param PAGE_SIZE 页数
	 * @return list数据
	 */
	@Select("<script>"
			+ "SELECT * FROM ${TABLE_NAME} WHERE " 
			+ "<foreach collection='COLUMNS' index='key' item='val' separator=' and '> `${key}` = #{val} </foreach>"
			+ " ORDER BY ${ORDER_COLUMN} ${ORDER_TYPE} LIMIT ${PAGE_START}, ${PAGE_SIZE}"
			+ "</script>")
	public List<Map<String, Object>> page(@Param("TABLE_NAME") String TABLE_NAME, @Param("COLUMNS") Map<String, Object> COLUMNS, @Param("ORDER_COLUMN") String ORDER_COLUMN, @Param("ORDER_TYPE") String ORDER_TYPE, @Param("PAGE_START") int PAGE_START, @Param("PAGE_SIZE") int PAGE_SIZE);

	/**
	 * 通用总记录数查询方法
	 * @param TABLE_NAME 表名
	 */
	@Select("SELECT count(0) FROM ${TABLE_NAME}")
	public int totals(@Param("TABLE_NAME") String TABLE_NAME);
}
