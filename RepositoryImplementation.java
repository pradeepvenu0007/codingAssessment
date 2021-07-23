class InvalidCodeException extends RuntimeException
{
	InvalidCodeException()
	{
		super("No country with given code found");
			
		
	}
}


class Repository{
	static String getCountryName(String countryCode) throws InvalidCodeException{ 

//70 to 99  -India
//908 = US

//011      -Dial somewhere outside of USA 

// No country with given code found
		String country = null;
		if(Integer.parseInt(countryCode)>=70&&Integer.parseInt(countryCode)<=99)
			country="India";
		else
			if(countryCode=="908")
			{
				country="US";
			}
			else
				if(countryCode=="011")
				{
					
					country="Dial somewhere outside of USA";
				}
				else
					throw new InvalidCodeException();
		return country;
	
 }
	
}

public  class RepositoryImplementation {
	
	public static void main(String[] args)throws Exception {
		Repository r=new Repository();
		System.out.println(r.getCountryName("987"));
		
	}
}


