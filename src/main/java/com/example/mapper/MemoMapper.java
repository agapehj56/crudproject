package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.domain.Memo;
import com.example.util.memoPagination;

@Mapper
public interface MemoMapper {
	@Select("select count(*) from memo")
	int memoCount();
	
	@Select({
		"select *                ",
		"  from memo             ",
		" order by mno desc         ",
		"offset #{firstItem} - 1 rows   ",
		" fetch next #{itemsPerPage} rows only"
	})
	List<Memo> selectPage(memoPagination paging);
	
	@Select("select * from memo")
	List<Memo> selectAll();
	
	@Select("select * from memo where mno=#{mno}")
	Memo selectItem(int mno);
	
	int insert(Memo memo);
	
	int updateByMno(Memo memo);
	
	@Delete("delete from memo where mno=#{mno}")
	int deleteByMno(int mno);
	
	@Select({
		"select * 						",
		"from memo 						",
		"where mno like #{mno}		",
		" order by mno desc        		",
		" offset #{firstItem} - 1 rows  ",
		" fetch next #{itemsPerPage} rows only"		
	})
	List<Memo> searchAll(memoPagination paging, int mno);
}
