package com.example.memo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.memo.service.MemoRegisterService;
import com.example.memo.service.MemoSearchService;
import com.example.domain.Memo;
import com.example.form.MemoForm;

@Controller
@RequestMapping("/memo")
public class MemoRegisterController {
	@Autowired
	MemoSearchService memoSearchService;
	@Autowired
	MemoRegisterService memoRegisterService;
	
	@GetMapping("/register")
	public String registerForm(MemoForm memoForm){

		return "memo/registerForm";
	}
	
	@PostMapping("/register")
	public String register(@Valid MemoForm memoForm, BindingResult errors){
		
		String content = memoForm.getMcontent();
		content=content.replace("\u0020","&nbsp");
		content=content.replace("\r\n","<br>");
		memoForm.setMcontent(content);
		
		if(errors.hasErrors()){
			return "memo/registerForm";
		}
		
		memoRegisterService.register(memoForm,errors);
		if(errors.hasErrors()){
			return "memo/registerForm";
		}
		return "redirect:/memo/registerSuccess/" + memoForm.getMno();
	}
	
	@GetMapping("registerSuccess/{mno}")
	public String registerSuccess(@PathVariable int mno, Model model){
		Memo memo = memoSearchService.getItem(mno);
		model.addAttribute("memo",memo);
		return "memo/registerSuccess";
	}
}
