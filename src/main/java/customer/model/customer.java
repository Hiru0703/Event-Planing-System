package customer.model;

public class customer {
	
	private int id;
	private String name;
	private String email;
	private String eventname;
	private String eparticipant;
	
	
	public customer(int id, String name, String email, String eventname, String eparticipant) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.eventname = eventname;
		this.eparticipant = eparticipant;
	}


	public customer(String name, String email, String eventname, String eparticipant) {
		super();
		this.name = name;
		this.email = email;
		this.eventname = eventname;
		this.eparticipant = eparticipant;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEventname() {
		return eventname;
	}


	public void setEventname(String eventname) {
		this.eventname = eventname;
	}


	public String getEparticipant() {
		return eparticipant;
	}


	public void setEparticipant(String eparticipant) {
		this.eparticipant = eparticipant;
	}
	

}
