class Director{
	public static void directorOf(Movies movie){
		System.out.println("running directorOf in Director");
		if(movie==Movies.INTERSTELLAR){
			System.out.println(movie+" is directed by Christopher Nolan");
		}
		else if(movie==Movies.AVENGERS){
			System.out.println(movie+" is directed by Joss Whedon");
		}
		else if(movie==Movies.DON){
			System.out.println(movie+" is directed by Farhan Akhtar");
		}
		else if(movie==Movies.SWADES){
			System.out.println(movie+" is directed by Ashutosh Gowariker");
		}
		else if(movie==Movies.RAAZI){
			System.out.println(movie+" is directed by Meghna Gulzar");
		}
		else{
			System.err.println(movie+" not found!!");
		}
	}
}