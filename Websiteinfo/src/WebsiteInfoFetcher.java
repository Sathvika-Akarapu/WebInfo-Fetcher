import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class WebsiteInfoFetcher {
    public static void fetchWebsiteDetails(String url) {
        try {
            Document doc = Jsoup.connect(url).get();

            String title = doc.title();
            String metaDescription = getMetaTag(doc, "description");
            String keywords = getMetaTag(doc, "keywords");

            System.out.println("Website: " + url);
            System.out.println("Title: " + title);
            System.out.println("Meta Description: " + (metaDescription.isEmpty() ? "N/A" : metaDescription));
            System.out.println("Keywords: " + (keywords.isEmpty() ? "N/A" : keywords));

        } catch (Exception e) {
            System.out.println("⚠ Error fetching website details: " + e.getMessage());
        }
    }

    private static String getMetaTag(Document doc, String attrName) {
        Elements metaTag = doc.select("meta[name=" + attrName + "]");
        return metaTag.isEmpty() ? "" : metaTag.attr("content");
    }
}
