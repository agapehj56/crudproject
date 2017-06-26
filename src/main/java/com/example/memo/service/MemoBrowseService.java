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
public class MemoBrowseService {
	@Autowired
	MemoMapper memoMapper;
	
	public Map<String, Object> getPage(int pageNo,int mno){
		memoPagination paging = new memoPagination();
		paging.setTotalItem(memoMapper.memoCount());
		paging.setPageNo(pageNo);
		
		List<Memo> list = null;
		list = memoMapper.searchAll(paging,mno);
		
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
