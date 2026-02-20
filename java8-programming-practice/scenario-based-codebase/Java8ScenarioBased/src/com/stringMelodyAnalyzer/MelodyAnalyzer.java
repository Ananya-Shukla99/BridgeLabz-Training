package com.stringMelodyAnalyzer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelodyAnalyzer {

	public static List<SongLyric> SongBoard = new ArrayList<>();

	public void registerSong(SongLyric song) {

		SongBoard.add(song);
		System.out.println("Song registered successfully");
	}

	public String transformLyric(String lyric) {

		if (lyric.length() >= 10) {

			lyric = lyric.toLowerCase();
			StringBuffer sb = new StringBuffer(lyric);
			sb = sb.reverse();

			for (int i = 0; i < sb.length(); i++) {
				char c = sb.charAt(i);
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					sb.setCharAt(i, '*');
				}
			}
			String s = new String(sb);
			return s;
		} else {
			return lyric.toUpperCase();
		}
	}

	public Map<String, Integer> countLetterTypes(String lyric) {

		Map<String, Integer> map = new HashMap<>();
		char[] arr = lyric.toCharArray();
		int vowels = 0;
		int consonants = 0;
		for (char c : arr) {
			if (Character.isLetter(c)) {

				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}

		}
		map.put("Vowels", vowels);
		map.put("Consonants", consonants);

		return map;
	}

	public List<String> getTopVowelSongs(int vowelThreshold) {

		List<String> list = new ArrayList<>();

		for (SongLyric s : SongBoard) {

			String lyric = s.getLyricLine();

			Map<String, Integer> map = countLetterTypes(lyric);

			if (map.get("Vowels") >= vowelThreshold) {
				list.add(s.getTitle());
			}
		}

		return list;
	}

}
