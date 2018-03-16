public class List implements Comparable
{
	private String fName;
	private String lName;
	private String phone;
	private String picFile;

	public String Contact(String fName, String lName, String phone, String picFile)
	{
		return "";	
	}

	public String toString()
	{
		return fName + " " + lName + " " + phone + " " + picFile;
	}

	public int compareTo(Object other)
	{
		List o = (List)other;
		return this.toString().compareTo(o.toString());
	}
}
