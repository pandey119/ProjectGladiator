package com.lti.user.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.entity.Option;
import com.lti.entity.Question;
import com.lti.entity.Register;
import com.lti.user.service.DescriptionService;
import com.lti.user.service.FetchQuestionService;
import com.lti.user.service.StoreScoreService;

@SessionAttributes({ "qid","questions", "question", "counter", "levelName", "subjectName", "score", "isRight" })

@Controller
public class FetchQuestionController {
	@Autowired
	private FetchQuestionService fetchQuestionService;
	@Autowired
	private StoreScoreService storeScoreService;
	@Autowired
	private DescriptionService descriptionService;
	private int score = 0;
	
	@RequestMapping(path = "/fetchQuestion", method = RequestMethod.GET)
	public String fetch(@RequestParam("levelName") String levelName,@RequestParam("counter") int counter, @RequestParam("subjectName") String subjectName,
			@RequestParam("score") int score,Map<String, Object> model) {

		List<Question> list = fetchQuestionService.fetchQuestion(levelName, subjectName);
		model.put("questions", list);
		
		if (list.size() > 0) {
			model.put("question", list.get(counter));

		counter = counter + 1;
		int i = (Integer) counter;
		model.put("counter", i);
	
		model.put("subjectName", subjectName);
		model.put("levelName", levelName);
	
		return "/testPaper.jsp";
		}
		else {
			
			return "/scoreCard.jsp";
		}
		
	}

	@RequestMapping(path = "/submitQuestion", method = RequestMethod.GET)
	public String submit(@RequestParam("option") int option, Map<String, Object> model, HttpSession session) {
		
		 
		int questionNo = (Integer)session.getAttribute("counter");
		
		List<Question> list = (List<Question>)session.getAttribute("questions");
		
		if(questionNo < list.size()) {
			Question q = list.get(questionNo);
			
			for(Option op : q.getOptions()) {
				if(op.getOid() == option && op.isIs_right()) {
					score=(Integer)model.get("score"); 
					 score++;
					
				
				 
				
				}
				 System.out.println(op.getOid());
				System.out.println(option);
				model.put("score", score);
			}
			
			return "redirect:/controller/fetchQuestion";
		}
		else {
			
			storeScoreService.storeScore((Integer) model.get("score"), (String) model.get("levelName"),
					(String) model.get("subjectName"),(Register) model.get("studentDetails"));
			return "redirect:/scoreCard.jsp";
			
		}
			
	}
	
	
	
}
