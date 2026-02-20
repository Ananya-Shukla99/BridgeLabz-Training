package com.stringMelodyAnalyzer;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = 0;
		MelodyAnalyzer ma = new MelodyAnalyzer();

		do {
			System.out.println(
					"Display menu options:  \n1. Register Song \n2. Transform Lyric \n3. Show Top Vowel Songs \n4. Exit \n5. show song"
					+ "");

			input = sc.nextInt();

			switch (input) {

			case (1): {
				System.out.println("Enter song title :");
				String title = sc.next();
				 sc.nextLine();
				System.out.println("Enter song lyrics :");
				String lyric = sc.nextLine();
				SongLyric song = new SongLyric(title, lyric);

				ma.registerSong(song);
				break;
			}
			case (2): {
				System.out.println("Enter the lyric you want to transform");
				sc.nextLine();
				String lyric = sc.nextLine();
				String transform = ma.transformLyric(lyric);
				System.out.println("Previous lyrics :" + lyric);
				System.out.println("Transformed lyric :" + transform);
				System.out.println("Transformed lyric sucessfully");
				break;
			}

			case (3): {
				
				System.out.println("Enter vowelThreshold : ");
				int threshold = sc.nextInt();
				List<String> list = ma.getTopVowelSongs(threshold);
				if (!list.isEmpty()) {
					System.out.println(list);
				} else {
					System.out.println("No songs meet the vowel threshold");
				}
				break;
			}
			case (4): {
				System.out.println("Logging off — Keep Creating with MelodyVerse!");
				break;
			}
			case (5):{
				
				for( SongLyric s: MelodyAnalyzer.SongBoard) {
					System.out.println(s);
				}
				break;
			}
			default:{
				System.out.println("Something went wrong");
				break;
			}
			}

		} while (input != 4);

		sc.close();
	}
}
