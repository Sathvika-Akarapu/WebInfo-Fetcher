# Website Information Fetcher

A simple Java tool that fetches website details like **Title, Meta Description, and Keywords** without using APIs.

## Features
✅ Displays a large **WELCOME** banner  
✅ Fetches website title, meta description, and keywords  
✅ No API required, uses JSoup for web scraping  

## How to Run
1. Clone the repository:
git clone https://github.com/yourusername/WebsiteInfoFetcher.git
2. Add **JSoup** dependency (if using Maven):
```xml
<dependency>
    <groupId>org.jsoup</groupId>
    <artifactId>jsoup</artifactId>
    <version>1.15.3</version>
</dependency>

javac -cp .;jsoup-1.15.3.jar src/*.java
java -cp .;jsoup-1.15.3.jar src.Main

---

### **Why is this Useful?**
- **Developers** can use this tool to quickly check SEO-related meta information.  
- **Testers** can verify if a website has correct metadata without manually inspecting the source.  
- **Students** can learn **JSoup and web scraping** in Java.  

Would you like any additional features, such as **fetching headers, response time, or links from the page**? 🚀
