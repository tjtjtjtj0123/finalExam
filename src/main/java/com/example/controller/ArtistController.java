package com.example.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Artist;
import com.example.model.Company;
import com.example.model.SearchCommand;
import com.example.service.ArtistService;

@Controller
public class ArtistController {
	@Autowired
	private ArtistService artService;
	
	public void setArtService(ArtistService artistService) {
		this.artService = artistService;
	}
	
	@RequestMapping("/index")
	public String main(Model model) {
		List<String> namelist = artService.getCompanyList();
		model.addAttribute("companies", namelist);
		return "index";
	}
	
	@RequestMapping("/search/artist")
	public String searchArtist(@PathVariable("id") int id, Model model) {
		Artist artist = artService.getArtist(id);
		model.addAttribute("artist", artist);
		return "artistDetail";
	}
	
	@RequestMapping("/search1")
	public String searchArtistsByAgent1(@RequestParam("agentName") String agentName, Model model) {
		List<Artist> list = artService.getArtistsByAgent(agentName);
		if (list != null && list.size() > 0) { 
			model.addAttribute("artistList", list);
			model.addAttribute("agent", list.get(0).getAgent());
		}
		return "result1";
	}
		
	@RequestMapping("/search2")
	public String searchArtistsByAgent2(@RequestParam("agentName") String agentName, Model model) {
		Company agent = artService.getAgentWithArtists(agentName);
		model.addAttribute("agent", agent);
		return "result2";
	}
	
	@RequestMapping(value="/search3", method=RequestMethod.POST)
	@ResponseBody 
	public List<Artist> searchArtistsByCondition(@RequestBody Map<String, String> condition, HttpServletResponse resp) {
		System.out.println(condition);
		
		List<Artist> list = artService.getArtistsByCondition(condition);
		if (list == null) {
			try {
				resp.sendError(HttpServletResponse.SC_NOT_FOUND);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
