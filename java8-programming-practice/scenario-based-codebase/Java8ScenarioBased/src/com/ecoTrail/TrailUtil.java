package com.ecoTrail;

import java.util.*;

public class TrailUtil {

    private List<Trail> trailList;

    public TrailUtil() {
        this.trailList = new ArrayList<>();
    }

    public List<Trail> getList() {
        return trailList;
    }

    public void setList(List<Trail> trailList) {
        this.trailList = trailList;
    }

    // Requirement 1: Add Trail
    public void addTrailRecord(Trail trail) {
        trailList.add(trail);
    }

    // Requirement 2: Get Trail by ID
    public Trail getTrailById(String trailId) {

        for (Trail t : trailList) {
            if (t.getTrailId().equals(trailId)) {
                return t;
            }
        }
        return null;
    }

    // Requirement 3: Most Hiked Trails
    public Set<Trail> getMostHikedTrails() {

        Set<Trail> result = new HashSet<>();

        if (trailList.isEmpty()) {
            return result;
        }

        int max = trailList.get(0).getHikeCount();

        for (Trail t : trailList) {
            if (t.getHikeCount() > max) {
                max = t.getHikeCount();
            }
        }

        for (Trail t : trailList) {
            if (t.getHikeCount() == max) {
                result.add(t);
            }
        }

        return result;
    }

    // Requirement 4: Region-wise Hike Count
    public Map<String, Integer> getHikeCountByRegion() {

        Map<String, Integer> map = new HashMap<>();

        for (Trail t : trailList) {

            String region = t.getRegion();
            int hikes = t.getHikeCount();

            map.put(region, map.getOrDefault(region, 0) + hikes);
        }

        return map;
    }

    // Requirement 5: Group by Difficulty
    public Map<String, List<Trail>> groupTrailsByDifficulty() {

        Map<String, List<Trail>> map = new HashMap<>();

        for (Trail t : trailList) {

            String diff = t.getDifficulty();

            map.putIfAbsent(diff, new ArrayList<>());
            map.get(diff).add(t);
        }

        return map;
    }

    // Requirement 6: Update Hike Count
    public boolean updateHikeCount(String trailId, int additionalHikes) {

        for (Trail t : trailList) {

            if (t.getTrailId().equals(trailId)) {

                t.setHikeCount(t.getHikeCount() + additionalHikes);
                return true;
            }
        }

        return false;
    }

    // Requirement 7: Filter Trails
    public List<Trail> filterTrails(String region, String difficulty) {

        List<Trail> list = new ArrayList<>();

        for (Trail t : trailList) {

            if (t.getRegion().equals(region)
                    && t.getDifficulty().equals(difficulty)) {

                list.add(t);
            }
        }

        return list;
    }

    // Requirement 8: Top-N Trails per Region
    public Map<String, List<Trail>> getTopTrailsByRegion(int n) {

        Map<String, List<Trail>> map = new HashMap<>();

        // Group by region
        for (Trail t : trailList) {

            String region = t.getRegion();

            map.putIfAbsent(region, new ArrayList<>());
            map.get(region).add(t);
        }

        // Sort and limit
        for (String region : map.keySet()) {

            List<Trail> list = map.get(region);

            list.sort((a, b) ->
                    b.getHikeCount() - a.getHikeCount());

            if (list.size() > n) {

                map.put(region, new ArrayList<>(list.subList(0, n)));
            }
        }

        return map;
    }

    // Requirement 9: Difficulty Statistics
    public Map<String, String> getDifficultyStats() {

        Map<String, Integer> countMap = new HashMap<>();
        Map<String, Integer> totalMap = new HashMap<>();

        for (Trail t : trailList) {

            String diff = t.getDifficulty();

            countMap.put(diff,
                    countMap.getOrDefault(diff, 0) + 1);

            totalMap.put(diff,
                    totalMap.getOrDefault(diff, 0)
                            + t.getHikeCount());
        }

        Map<String, String> result = new HashMap<>();

        for (String diff : countMap.keySet()) {

            int count = countMap.get(diff);
            int total = totalMap.get(diff);
            int avg = total / count;

            String value =
                    "count=" + count +
                    ", totalHikes=" + total +
                    ", averageHikes=" + avg;

            result.put(diff, value);
        }

        return result;
    }
}



