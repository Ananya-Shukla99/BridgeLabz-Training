package com.stringMelodyAnalyzer;

public class SongLyric {

	private String title;
	private String lyricLine;

	public SongLyric(String title, String LyricLine) {

		this.title = title;
		this.lyricLine = LyricLine;
	}

	public String getLyricLine() {
		return lyricLine;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "SongLyric [title=" + title + ", lyricLine=" + lyricLine + "]";
	}

}
