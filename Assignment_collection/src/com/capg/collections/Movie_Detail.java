package com.capg.collections;

public class Movie_Detail {
   String mov_name;
   String lead_actor;
   String lead_actories;
   String genre;
public Movie_Detail(String mov_name, String lead_actor, String lead_actories,
		String genre) {
	super();
	this.mov_name = mov_name;
	this.lead_actor = lead_actor;
	this.lead_actories = lead_actories;
	this.genre = genre;
}
public String getMov_name() {
	return mov_name;
}
public void setMov_name(String mov_name) {
	this.mov_name = mov_name;
}
public String getLead_actor() {
	return lead_actor;
}
public void setLead_actor(String lead_actor) {
	this.lead_actor = lead_actor;
}
public String getLead_actories() {
	return lead_actories;
}
public void setLead_actories(String lead_actories) {
	this.lead_actories = lead_actories;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public int compare(Movie_Detail arg0, Movie_Detail arg1) {
	
	return arg0.mov_name.compareTo(arg1.mov_name);
	
}

@Override
public boolean equals(Object arg0) {
	
	Movie_Detail movie=(Movie_Detail)arg0;
	return mov_name.equals(movie.getMov_name())&&
			lead_actor.equals(movie.getLead_actor())&&
			lead_actories.equals(movie.getLead_actories())&&
			genre.equals(movie.getGenre());
}



@Override
public String toString() {
	return "Movie_Detail [mov_name=" + mov_name + ", lead_actor=" + lead_actor
			+ ", lead_actories=" + lead_actories + ", genre=" + genre + "]";
}
   
   
}
