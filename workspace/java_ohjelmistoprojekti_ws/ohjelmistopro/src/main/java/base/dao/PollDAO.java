package base.dao;

import java.util.List;

import base.bean.Poll;


public interface PollDAO {
	public List<Poll> haeKaikki();// kaikkien kyselyiden haku
	public Poll hae(int Id); //yhden kyselyn haku
	public void talleta(Poll poll); // uuden kyselyn talletus tietokantaan
}