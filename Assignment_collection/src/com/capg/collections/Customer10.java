package com.capg.collections;

public class Customer10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movie_DetailList movieDetailsList=new Movie_DetailList();
		movieDetailsList.addMovie(new Movie_Detail("Geetha-Govindam","Vijay Devarakonda","Rasmika Mandana","Family-entertainer"));
		movieDetailsList.addMovie(new Movie_Detail("Bharath-Ane-Nenu","Mahesh Babu","Kiara Advani","Political"));
		movieDetailsList.addMovie(new Movie_Detail("Pokiri","Mahesh","illeana","Action"));
		movieDetailsList.addMovie(new Movie_Detail("Rangasthalam","Ram-Charan","Samantha","Action"));
		
		
		System.out.println(movieDetailsList.findMovieByMovieName("Geetha-Govindam"));
		System.out.println(movieDetailsList.findMovieByGenre("Action"));
		System.out.println(movieDetailsList.removeMovie(new Movie_Detail("Pokiri","Mahesh","illeana","Action")));
		movieDetailsList.display();
		movieDetailsList.sort("leadActories");
		movieDetailsList.display();
	}
}
