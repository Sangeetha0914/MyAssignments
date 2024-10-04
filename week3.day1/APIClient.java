package week3.day1.homeactivity;

public class APIClient {


public void sendRequest(String endpoint) {
	System.out.println(endpoint);
}
public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
	System.out.println(endpoint);
	System.out.println(requestBody);
	System.out.println(requestStatus);
}
public static void main(String[] args) {
	APIClient obj=new APIClient();
	obj.sendRequest("Twitter API");
	obj.sendRequest("Youtube API, Post, true");
}

}
