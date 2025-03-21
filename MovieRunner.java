class MovieRunner{
	public static void main(String[] args){
		Movies movie1=Movies.INTERSTELLAR;
		Movies movie2=Movies.AVENGERS;
		Movies movie3=Movies.DON;
		Movies movie4=Movies.SWADES;
		Movies movie5=Movies.RAAZI;
		
		Director.directorOf(movie1);
		Director.directorOf(movie2);
		Director.directorOf(movie3);
		Director.directorOf(movie4);
		Director.directorOf(movie5);
	}
}