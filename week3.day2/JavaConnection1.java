package week3.day2.homeactivity;

public class JavaConnection1 extends MySqlConnection{

	@Override
	public void connect() {
		System.out.println("Connect to the server");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect from the server");
	}

	@Override
	public void executeUpdate() {
		System.out.println("Update has been executed");
	}
	public void executeQuery() {
		System.out.println("Students Queries has been clered by team");
	}
	public static void main(String[] args) {
		JavaConnection1 JVC1=new JavaConnection1();
		JVC1.connect();
		JVC1.disconnect();
		JVC1.executeUpdate();
		JVC1.executeQuery();
		
	}

}
