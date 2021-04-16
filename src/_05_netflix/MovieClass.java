package _05_netflix;

public class MovieClass {
	public static void main(String[] args) {
		Movie movie1 = new Movie("Kong vs. Godzilla", 5);
		Movie movie2 = new Movie("Justice League: Snyder Cut", 4);
		Movie movie3 = new Movie("Artemis Fowl", 1);
		Movie movie4 = new Movie("Raya and The Last Dragon", 5);
		Movie movie5 = new Movie("Nobody", 4);
		System.out.println(movie1.getTicketPrice());
		NetflixQueue queue = new NetflixQueue();
		queue.addMovie(movie1);
		queue.addMovie(movie2);
		queue.addMovie(movie3);
		queue.addMovie(movie4);
		queue.addMovie(movie5);
		queue.printMovies();
		System.out.println("the best movie is ");
		queue.sortMoviesByRating();
	}
}
