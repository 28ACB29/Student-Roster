/**
 * 
 */
package com.arthurcbaroi.roster;

import org.owasp.html.HtmlPolicyBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author arthu
 *
 */
@Controller
public class RosterController
{
	private HtmlPolicyBuilder sanitizer;

	private CSVUtil util;

	@Autowired
	private StudentRepository students;

	/**
	 * 
	 */
	public RosterController()
	{
		// TODO Auto-generated constructor stub
		this.sanitizer = new HtmlPolicyBuilder();
		this.util = new CSVUtil();
	}

	@RequestMapping("/")
	public String home(Model model)
	{
		return "roster";
	}

	@PostMapping("/searchForm")
	public String search(Model model)
	{
		// TODO: search here
		return "roster";
	}

	@PostMapping("/uploadForm")
	public String upload(@RequestParam("file") MultipartFile file)
	{
		// TODO: upload and replace here
		this.util.parse(file);
		return "roster";
	}

}
