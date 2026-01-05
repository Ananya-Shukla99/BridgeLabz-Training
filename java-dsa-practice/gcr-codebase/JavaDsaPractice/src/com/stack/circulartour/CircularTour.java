package com.stack.circulartour;

class CircularTour {

    static int findStartingPump(int[] petrol, int[] distance) {

        int totalPetrol = 0;
        int totalDistance = 0;
        int surplus = 0;
        int start = 0;

        for (int i = 0; i < petrol.length; i++) {
            totalPetrol += petrol[i];
            totalDistance += distance[i];

            surplus += petrol[i] - distance[i];

            //if surplus becomes negative, reset start
            if (surplus < 0) {
                start = i + 1;
                surplus = 0;
            }
        }

        //check if tour is possible
        if (totalPetrol < totalDistance)
            return -1;

        return start;
    }
}
