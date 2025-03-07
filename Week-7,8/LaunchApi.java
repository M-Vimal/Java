interface APIClient {
    String get(String url);
    String post(String url, String data);
}

class HttpClient implements APIClient {
    public String get(String url) {
        return "HttpClient: GET request to " + url;
    }

    public String post(String url, String data) {
        return "HttpClient: POST request to " + url + " with data: " + data;
    }
}

class MockClient implements APIClient {
    public String get(String url) {
        return "MockClient: Simulated GET response from " + url;
    }

    public String post(String url, String data) {
        return "MockClient: Simulated POST response to " + url + " with data: " + data;
    }
}

public class LaunchApi {    
    public static void main(String[] args) {
        APIClient httpClient = new HttpClient();
        APIClient mockClient = new MockClient();

        System.out.println(httpClient.get("https://example.com/api"));
        System.out.println(httpClient.post("https://example.com/api", "vimal"));

        System.out.println(mockClient.get("https://example.com/api"));
        System.out.println(mockClient.post("https://example.com/api", "vimal"));
    }
    
}
