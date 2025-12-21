//A program to find the shortest, tallest, and mean height of players
 
public class FootballTeamHeights {

    // method to generate random heights
    public static int[] generateHeights(int size) {
	
        int[] heights = new int[size];
		
        for (int i = 0; i < size; i++) {
            heights[i] = (int) (Math.random() * 101) + 200; 
        }
		
        return heights;
    }

    // method to find sum of all heights
    public static int findSum(int[] heights) {
	
        int sum = 0;
		
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // method to find mean height
    public static double findMean(int[] heights) {
	
        int sum = findSum(heights);
		
        double mean= (double) sum / heights.length;
		
		return mean;
    }

    //method to find shortest height
    public static int findShortest(int[] heights) {
	
        int min = heights[0];
		
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
		
        return min;
    }

    // Find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        // Create heights array of size 11
        int[] heights = generateHeights(11);

        // display player heights
        System.out.println("Player Heights :");
		
        for (int height : heights) {
		
            System.out.print(height + " ");
        }

        // Calling the methods
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double mean = findMean(heights);

        // Display results
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
        System.out.println("Mean Height: " + mean + " cm");
		
    }
}
