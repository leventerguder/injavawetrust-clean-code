package chapter03.examples;

/**
 * Modifications:
 *
 * If statement should always use braces, even if they only contain one
 * statement. The alternative is error-prone;
 *
 * A dotted statement spanning more than one line should end with the dot on
 * each line instead of beginning with the dot on the next line. It improves
 * readability (IMHO).
 */
public class SetupTeardownIncluder {
	private PageData pageData;
	private boolean isSuite;
	private WikiPage testPage;
	private StringBuffer newPageContent;
	private PageCrawler pageCrawler;

	public static String render(PageData pageData) throws Exception {
		return render(pageData, false);
	}

	private static String render(PageData pageData, boolean isSuite) throws Exception {
		return new SetupTeardownIncluder(pageData).render(isSuite);
	}

	private SetupTeardownIncluder(PageData pageData) {
		this.pageData = pageData;
		testPage = pageData.getWikiPage();
		pageCrawler = testPage.getPageCrawler();
		newPageContent = new StringBuffer();
	}

	private String render(boolean isSuite) throws Exception {
		this.isSuite = isSuite;
		if (isTestPage()) {
			includeSetupAndTeardownPages();
		}
		return pageData.getHtml();
	}

	private boolean isTestPage() throws Exception {
		return pageData.hasAttribute("Test");
	}

	private void includeSetupAndTeardownPages() throws Exception {
		includeSetupPages();
		includePageContent();
		includeTeardownPages();
		updatePageContent();
	}

	private void includeSetupPages() throws Exception {
		if (isSuite) {
			includeSuiteSetupPage();
		}
		includeSetupPage();
	}

	private void includeSuiteSetupPage() throws Exception {
		include(SuiteResponder.SUITE_SETUP_NAME, "-setup");
	}

	private void includeSetupPage() {
		include("SetUp", "-setup");
	}

	private void includePageContent() {
		newPageContent.append(pageData.getContent());
	}

	private void includeTeardownPages() {
		includeTeardownPage();
		if (isSuite) {
			includeSuiteTeardownPage();
		}
	}

	private void includeTeardownPage() {
		include("TearDown", "-teardown");
	}

	private void includeSuiteTeardownPage() {
		include(SuiteResponder.SUITE_TEARDOWN_NAME, "-teardown");
	}

	private void updatePageContent() {
		pageData.setContent(newPageContent.toString());
	}

	private void include(String pageName, String arg) {
		WikiPage inheritedPage = findInheritedPage(pageName);
		if (inheritedPage != null) {
			String pagePathName = getPathNameForPage(inheritedPage);
			buildIncludeDirective(pagePathName, arg);
		}
	}

	private WikiPage findInheritedPage(String pageName) {
		return PageCrawlerImpl.getInheritedPage(pageName, testPage);
	}

	private String getPathNameForPage(WikiPage page) {
		WikiPagePath pagePath = pageCrawler.getFullPath(page);
		return PathParser.render(pagePath);
	}

	private void buildIncludeDirective(String pagePathName, String arg) {
		newPageContent.append("\n!include").append(arg).append(" .").append(pagePathName).append("\n");
	}

}
