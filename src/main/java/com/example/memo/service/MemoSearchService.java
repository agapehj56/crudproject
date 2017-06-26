package com.example.memo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Memo;
import com.example.util.memoPagination;
import com.example.mapper.MemoMapper;

@Service
public class MemoSearchService {
	@Autowired
	MemoMapper memoMapper;
	
	public Map<String, Object> getPage(int pageNo){
		memoPagination paging = new memoPagination();
		paging.setTotalItem(memoMapper.memoCount());
		paging.setPageNo(pageNo);
		
		List<Memo> list = null;
		list = memoMapper.selectPage(paging);
		
		Map<String, Object> map = new HashMap<>();
		map.put("list", list);
		map.put("paging", paging);
		return map;
	}
	public Memo getItem(int mno){
		Memo memo = null;
		memo = memoMapper.selectItem(mno); 
		
		return memo;
	}

}
