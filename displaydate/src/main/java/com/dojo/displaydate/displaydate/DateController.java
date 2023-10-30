package com.dojo.displaydate.displaydate;

//add
import org.springframework.stereotype.Controller;

//add
import org.springframework.ui.Model;

//add
import org.springframework.web.bind.annotation.RequestMapping;

// simple date format
import java.text.SimpleDateFormat;

// import Date
import java.util.Date;

//add
@Controller
public class DateController {
	// home
	@RequestMapping("/")
	public String index(Model model) {
		return "index.jsp";
	}
    
	// date
	@RequestMapping("/date")
	public String date(Model model) {

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMM, yyyy");
		String formattedDate = formatter.format(date);
		
		model.addAttribute("date", formattedDate);

		return "date.jsp";
	}

	// time
	@RequestMapping("/time")
	public String time(Model model) {

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
		String formattedDate = formatter.format(date);
		
		model.addAttribute("time", formattedDate);

		return "time.jsp";
	}

}
