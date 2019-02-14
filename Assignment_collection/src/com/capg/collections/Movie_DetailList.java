package com.capg.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Movie_DetailList  {

  

	ArrayList<Movie_Detail> movies;

	public Movie_DetailList() {
		super();
		if(movies==null)
			movies=new ArrayList<Movie_Detail>();
	}
	
	public boolean addMovie(Movie_Detail movie){
		
		return movies.add(movie);
		
	}
	
	public boolean removeMovie(Movie_Detail movie){
		return movies.remove(movie);
	}
	
	public void removeAllMovies(){
		movies.clear();
		
	}
	
	public void sort(String type) {
	
		Collections.sort(movies, new Comparator<Movie_Detail>() {

			@Override
			public int compare(Movie_Detail arg0, Movie_Detail arg1) {
				
				if(type.equals("genre"))
					return arg0.getGenre().compareTo(arg1.getGenre());
				else if(type.equals("leadActor"))
					return arg0.getLead_actor().compareTo(arg1.getLead_actor());
				else if(type.equals("leadActories"))
					return arg0.getLead_actories().compareTo(arg1.getLead_actories());
				else
					return arg0.getMov_name().compareTo(arg1.getMov_name());
					
			}

			
		});
	}
	
	
	public String findMovieByMovieName(String movieName){
		
		Iterator<Movie_Detail> iterator= movies.iterator();
		
		while(iterator.hasNext()){
			
			Movie_Detail movieDetail=iterator.next();
			if(movieName.equals(movieDetail.getMov_name()))
				return movieDetail.toString();
		}
		return null;
	}
	
public String findMovieByGenre(String genre){
		
		Iterator<Movie_Detail> iterator= movies.iterator();
		String allMovies="";
		while(iterator.hasNext()){
			Movie_Detail movieDetail=iterator.next();
			if(genre.equals(movieDetail.getGenre()))
				allMovies+="\n"+ movieDetail.toString()+"\n";
		}
		return allMovies;
	}
	
	public void display() {

		Iterator<Movie_Detail> iterator= movies.iterator();
	
		while(iterator.hasNext()){
			Movie_Detail movieDetail=iterator.next();
			System.out.println(movieDetail.toString()+"\n");
		}
	}
}
