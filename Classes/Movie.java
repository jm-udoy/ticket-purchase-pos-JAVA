package Classes;
class Movie{
	
	private String name;
	private int year;
	private double rating;
	private String genre;
	private double duration;

	Movie(String name, int year, double rating, String genre, double duration){
		this.name=name;
		this.year=year;
		this.rating=rating;
		this.genre=genre;
		this.duration=duration;
	}

	public void setName(String n){
		name = n;
	}

	public String getName(){
		return name;
	}

	public void setYear(int y){
		year = y;
	}

	public int getYear(){
		return year;
	}

	public void setRating(double r){
		rating = r;
	}

	public double getRating(){
		return rating;
	}

	public void setGenre(String g){
		genre = g;
	}

	public String getGenre(){
		return genre;
	}

	public void setDuration(double d){
		duration = d;
	}

	public double getDuration(){
		return duration;
	}

	public void showMovieDetails(){
		System.out.println("MOVIE NAME: "+name);
		System.out.println("MOVIE YEAR: "+year);
		System.out.println("IMDb RATING: "+rating+"*");
		System.out.println("GENRE: "+genre);
		System.out.println("RUN TIME: "+duration+" min");
	}


}