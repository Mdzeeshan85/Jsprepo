package com.movieapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieDetails {
public  List<String> showMovies(String language){
	// List<String> movies=null;
	// if(language.equals("english")) movies=Arrays.asList("a","b","c","d");
	if(language.equals("english")) return(Arrays.asList("harry","potter"));
	else if(language.equals("hindi")) return(Arrays.asList("jawan","pathaan","tiger","bull"));
	else if(language.equals("tamil")) return(Arrays.asList("kotha ravi","ramseeta","master"));
	else if(language.equals("telegue")) return(Arrays.asList("rrr","bahubali","maheshbabu"));
	return null;
	//return movies;
}

}
