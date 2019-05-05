package com.example.big.band.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.thymeleaf.expression.Ids;

import com.example.big.band.domain.Line;
import com.example.big.band.domain.Article;
import com.example.big.band.domain.Band;
import com.example.big.band.domain.Place;
import com.example.big.band.domain.Railway;
import com.example.big.band.domain.Station;
import com.example.big.band.domain.service.BandService;
import com.example.big.band.domain.service.LineService;
import com.example.big.band.domain.service.ArticleService;
import com.example.big.band.domain.service.PlaceService;
import com.example.big.band.domain.service.RailwayService;
import com.example.big.band.domain.service.ResearchService;
import com.example.big.band.domain.service.StationService;
import com.example.big.band.form.ResearchForm;

@Controller
public class BigBandController {

	@Autowired
	PlaceService placeService;
	@Autowired
	ArticleService articleService;
	@Autowired
	BandService bandService;
	@Autowired
	RailwayService railwayService;
	@Autowired
	LineService lineService;
	@Autowired
	StationService stationService;
	@Autowired
	ResearchService researchService;

	// サイトトップページ
	@RequestMapping(value = "/", method = RequestMethod.GET)
	private String goTop(Model model) {

		// ビッグバンド情報
		List<Article> articleList = articleService.findForTopPage();
		model.addAttribute("articleList", articleList);

		// 活動場所を探すの条件一覧
//		List<Railway> railwayList = railwayService.findAll();
//		model.addAttribute("railwayList", railwayList);

		return "top";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	private String goGroupRehearsal(Model model) {
		model.addAttribute("message", "スタジオ一覧");

		List<Place> list = placeService.findAll();
		model.addAttribute("list", list);

		return "commingSoon";
	}
	
	@RequestMapping(value = "/placeResearch", method = RequestMethod.GET)
	private String goPlaceResearch(ResearchForm form, Model model) {

		// 検索
		Map<Railway, List<Line>> lineMap = researchService.getMap();
		model.addAttribute("lineMap", lineMap);

		// 検索条件フォーム
		model.addAttribute("form", form);

		return "placeResearch";
	}

	@RequestMapping(value = "/placeList", method = RequestMethod.POST)
	private String goPlaceList(@ModelAttribute ResearchForm form, BindingResult result, Map<Railway, List<Line>> form2, Model model) {

		// 鉄道会社を選択している場合、路線コードを除去
		List<String> codeList = new ArrayList<String>(Arrays.asList(form.getCode()));

		List<String> targetForSelect = new ArrayList<String>();// 検索に用いる

		for (String code : codeList) {
			if (code.length() == 3) {
				// 路線コードなのでそのまま格納
				targetForSelect.add(code);
			}
		}

		codeList: for (String code : codeList) {

			if (code.length() == 5) {
				String lineCode = code;
				for (String railwayCode : targetForSelect) {
					if (lineCode.startsWith(railwayCode)) {
						continue codeList;
					}
				}
				targetForSelect.add(lineCode);
			}
		}

		// 検索処理
		List<Place> placelist = new ArrayList<Place>();
		
		for (String code : targetForSelect) {
			List<Place> tmpList = placeService.findByStationCode(code);
			
			for (Place p : tmpList) {
				placelist.add(p);
			}	
		}
		
		model.addAttribute("placeList", placelist);

//		Railway railway = railwayService.getOne("101");
//		System.out.println(railway.getRailwayName());

		return "placeList";
	}

	@RequestMapping(value = "/areaList", method = RequestMethod.GET)
	private String goAreaList(Model model) {

		List<Railway> railwayList = railwayService.findAll();
		model.addAttribute("railwayList", railwayList);

		return "commingSoon";
	}

	@RequestMapping(value = "/placeDetail/{placeId}", method = RequestMethod.GET)
	private String goPlaceDetail(@PathVariable int placeId, Model model) {

		Place place = placeService.findById(placeId);
		model.addAttribute("place", place);

//		Station station = stationService.findById(place.getPlaceId())

		// 場所に紐づく複数の駅を取得
		List<Station> stationList = stationService.getStationList(place);
		model.addAttribute("stationList", stationList);

		for (Station station : stationList) {
			if (station != null) {
				System.out.println(station.getStaionName());
			}
		}

		return "placeDetail";
	}
	
	@RequestMapping(value = "/bandList/{bandClsf}", method = RequestMethod.GET)
	private String goBandList(Model model) {
		
		List<Band> bandList = bandService.findAll();
		model.addAttribute("bandList", bandList);
		
		return "commingSoon";
	}

	@RequestMapping(value = "/goSoloRehearsalTop", method = RequestMethod.GET)
	private String goSoloRehearsalTop(Model model) {
		return "commingSoon";
	}

	//記事詳細
	@RequestMapping(value = "/articleDetail/{articleId}", method = RequestMethod.GET)
	private String goArticleDetail(@PathVariable int articleId, Model model) {

		Article article = articleService.findAllById(articleId);
		model.addAttribute("article", article);

		return "commingSoon";
	}
	//記事もっと見る
	@RequestMapping(value = "/articleList", method = RequestMethod.GET)
	private String goArticleList(Model model) {
		return "commingSoon";
	}

	//楽譜を検索する
	@RequestMapping(value = "/searchScore", method = RequestMethod.GET)
	private String searchScore(Model model) {
		return "commingSoon";
	}
	//採譜を依頼する
	@RequestMapping(value = "/transcription", method = RequestMethod.GET)
	private String transcription(Model model) {
		return "commingSoon";
	}
	//お問い合わせ
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	private String contact(Model model) {
		return "commingSoon";
	}
	//このサイトについて
	@RequestMapping(value = "/aboutUs", method = RequestMethod.GET)
	private String aboutUs(Model model) {
		return "commingSoon";
	}

}