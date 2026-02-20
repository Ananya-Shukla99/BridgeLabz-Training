package com.smartLog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class LogAnalyzer {

	private List<UserLog> logList;

	public LogAnalyzer() {
		this.logList = new ArrayList<>();
	}

	public List<UserLog> getList() {
		return logList;
	}

	public void addLog(UserLog log) throws InvalidLogException {

		boolean flag = false;
		String regex = "^LOG-[1-9][0-9]{3}$";
		Pattern p = Pattern.compile(regex);
		Matcher match = p.matcher(log.userId);
		if (match.matches()) {
			System.out.println("Valid userId");
		} else {
			flag = true;
			throw new InvalidLogException("Invalid User Id ");
		}
		String regex2 = "^[A-Za-z]{4,}$";
		Pattern p2 = Pattern.compile(regex2);
		Matcher m = p2.matcher(log.userName);

		if (m.matches()) {
			System.out.println("Valid name");
		} else {
			flag = true;
			throw new InvalidLogException("Invalid User name ");

		}
		String regex3 = "^\\D{10,}$";
		Pattern p3 = Pattern.compile(regex3);
		Matcher m3 = p3.matcher(log.activity);
		if (m3.matches()) {
			System.out.println("Valid activity");
		} else {
			flag = true;
			throw new InvalidLogException("Invalid activity details ");
		}

		if (!flag) {
			logList.add(log);
		}

	}
	
	public String transformActivity(String act) {
		
		if(act.length()>15) {
			act= act.toLowerCase();
			StringBuilder ab= new StringBuilder(act);
			ab.reverse();
			for(int i=0;i<ab.length();i++) {
			    char c=ab.charAt(i);
			    if(c=='a'|| c=='e'|| c=='i'|| c=='o'||c=='u') {
			    	ab.setCharAt(i, '*');
			    }
			}
			return ab.toString();
		}
		else {
			return act.toUpperCase();
		}
	}
	
	public Map<String , Integer> countLetters (String activity){
		
		Map<String , Integer>map= new HashMap<>();
		
		int vowels=0;
		int consonants=0;
		for( char c:  activity.toCharArray()) {
			
			if(Character.isAlphabetic(c)) {
				c = Character.toLowerCase(c);
				if(c=='a'|| c=='e'|| c=='i' || c=='o' || c=='u') {
					vowels++;
				}else {
					consonants++;
				}
			}
		}
		
		map.put("Vowels", vowels);
		map.put("Consonants", consonants);
		
		return map;
	}
	
	public List<String>  getTopActivityUser(int vowelLimit){
		List<String> list=new ArrayList<>();
		
		for( UserLog u: logList) {
			
			Map<String , Integer> map= countLetters(u.activity);
			
			if(map.get("Vowels")>=vowelLimit) {
				
				list.add(u.userName);
			}
		}
		return list;
	}
}
