package com.hibernate.xml.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity   //this tells to  the hybernet framework  this is a special class 
//it tells inside data base we have a table 'Song'
public class Song {  //table name
	
@Id	//it specifies it is primary key
private  int id;
private String songName;
private String artist;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSongName() {
	return songName;
}
public void setSongName(String songName) {
	this.songName = songName;
}
public String getArtist() {
	return artist;
}
public void setArtist(String artist) {
	this.artist = artist;
}
}
