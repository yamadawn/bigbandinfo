package com.example.big.band.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.big.band.domain.service.BandService;
import com.example.big.band.domain.service.LineService;
import com.example.big.band.domain.service.ManagerService;
import com.example.big.band.domain.Article;
import com.example.big.band.domain.Place;
import com.example.big.band.domain.service.ArticleService;
import com.example.big.band.domain.service.PlaceService;
import com.example.big.band.domain.service.RailwayService;
import com.example.big.band.domain.service.ResearchService;
import com.example.big.band.domain.service.StationService;
import com.example.big.band.form.ArticleForm;
import com.example.big.band.form.BackOfficeForm;

@Controller
@SessionAttributes(names = "backOfficeForm")
public class BackOfficeController {

	@Autowired
	private PlaceService placeService;
	@Autowired
	private ArticleService articleService;
	@Autowired
	private BandService bandService;
	@Autowired
	private RailwayService railwayService;
	@Autowired
	private LineService lineService;
	@Autowired
	private StationService stationService;
	@Autowired
	private ResearchService researchService;
	@Autowired
	private ManagerService managerService;

	// 場所編集画面
	@RequestMapping(value = "/boControl/{screenId}", method = RequestMethod.GET)
	private String boControl(@PathVariable int screenId, @ModelAttribute("backOfficeForm") BackOfficeForm form, Pageable pageable, Model model) {

		System.out.println(form.getAuthKey());
		System.out.println(form.getLoginId());
		System.out.println(form.getPassword());

		// TODO ログインしていなかったらエラー
		if (!"authenticated8372456283402014375".equals(form.getAuthKey())) {
			return "boError";
		}

		switch (screenId) {

		// 場所一覧画面
		case 1:
			return boPlaceList(pageable, model);

		// 記事一覧画面
		case 2:
			return boArticleList(pageable, model);
		}
		model.addAttribute("form", form);
		return null;

	}

	@RequestMapping(value = "/boPlaceList", method = RequestMethod.GET)
	private String boPlaceList(Pageable pageable, Model model) {

		// 場所一覧取得処理
		Page<Place> page = placeService.boFindAll(pageable);
		model.addAttribute("page", page);
		model.addAttribute("contents", page.getContent());

		return "boPlaceList";
	}

	// 記事一覧へ
	@RequestMapping(value = "/boArticleList", method = RequestMethod.GET)
	private String boArticleList(Pageable pageable, Model model) {

		// 場所一覧取得処理
		Page<Article> page = articleService.boFindAll(pageable);
		model.addAttribute("page", page);
		model.addAttribute("contents", page.getContent());

		return "boArticleList";
	}

	// 記事編集画面へ
	@RequestMapping(value = "/boEditArticle/{articleId}", method = RequestMethod.GET)
	private String boEditArticle(@ModelAttribute ArticleForm form, @PathVariable int articleId, Pageable pageable, Model model) {

		Article article = articleService.findAllById(articleId);
		if (article != null) {

			form = copyTopForm(article);
		}
		model.addAttribute("article", article);
		model.addAttribute("form", form);
		return "boEditArticle";
	}

	private ArticleForm copyTopForm(Article article) {

		ArticleForm form = new ArticleForm();
		form.setArticleId(article.getArticleId());
		form.setContent1(article.getContent1());
		form.setContent2(article.getContent2());
		form.setContent3(article.getContent3());
		form.setContent4(article.getContent4());
		form.setContent5(article.getContent5());
		form.setDelFlg(article.isDelFlg());
		form.setImgUrl1(article.getImgUrl1());
		form.setImgUrl2(article.getImgUrl2());
		form.setImgUrl3(article.getImgUrl3());
		form.setImgUrl4(article.getImgUrl4());
		form.setImgUrl5(article.getImgUrl5());
		form.setInstYmd(article.getInstYmd());
		form.setTitle(article.getTitle());
		form.setOverview(article.getOverview());
		return form;

	}

	// 記事登録処理、一覧への遷移
	@RequestMapping(value = "/boRegistArticle", method = RequestMethod.POST)
	private String boRegistArticle(@ModelAttribute ArticleForm form, Pageable pageable, Model model) {
		articleService.updateArticle(form);

		return boArticleList(pageable, model);
	}

	// ログイン画面初期表示
	@RequestMapping(value = "/boLogin", method = RequestMethod.GET)
	private String goLogin(BackOfficeForm form, Model model) {

		model.addAttribute("form", form);
		return "boLogin";
	}

	// バックオフィストップ画面（ログイン処理）
	@RequestMapping(value = "/boTop", method = RequestMethod.POST)
	private String boTop(@ModelAttribute BackOfficeForm form, BindingResult result, Model model) {

		// TODO ログインしていなかったらエラー
//		if (form == null) {
//			return "boError";
//		}
		if ("authenticated8372456283402014375".equals(form.getAuthKey())) {
			return "boTop";
		}

		String loginId = form.getLoginId();
		String password = form.getPassword();

		// 検索処理
		boolean authResult = managerService.managerAuth(loginId, password);

		if (!authResult) {
			form.setAuthKey("");
			model.addAttribute("message", "ログインIDまたはパスワードが間違っています。");
			return goLogin(form, model);
		} else {
			// TODO 認証セッション作成
//			setBackOfficeForm(form);
			form.setAuthKey("authenticated8372456283402014375");
			return "boTop";
		}
	}

	// セッションのオブジェクト代入格納メソッド
	@ModelAttribute("backOfficeForm")
	public BackOfficeForm setBackOfficeForm(BackOfficeForm backOfficeForm) {
		return backOfficeForm;
	}
}