public class ProxySetup{
	public static void proxySetup(){
		System.setProperty("http.proxyHost", "192.168.1.15");
		System.setProperty("http.proxyPort", "8080");
		System.setProperty("https.proxyHost", "192.168.1.15");
		System.setProperty("https.proxyPort", "8080");
		System.setProperty("socksProxyHost", "192.168.1.15");
		System.setProperty("socksProxyPort", "8080");
	}
}