package week3.day2.homeactivity;

public class JavaConnection implements DatabaseConnection{

	@Override
	public void connect() {
	System.out.println("Connection is secured");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect the server");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Update has been executed");
		
	}
	public static void main(String[] args) {
		JavaConnection JC=new JavaConnection();
		JC.connect();
		JC.disconnect();
		JC.executeUpdate();
		
	}
	
	

}
