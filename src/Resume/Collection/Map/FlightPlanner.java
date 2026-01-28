package Resume.Collection.Map;

import java.util.*;
import java.io.*;

public class FlightPlanner {
    public static Map<String, List<String>> dataCities = new HashMap<>();
    public static Set<String> allCities = new LinkedHashSet<>();

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to Flight Planner!");
        System.out.print("Input file name? ");

        readData(console.nextLine());
        System.out.println();
        System.out.println("Here's a list of all the cities in our database:");
        for (String city : allCities){
            System.out.println(" "+ city);
        }
        System.out.println("Let's plan a round-trip route!");
        System.out.print("Enter the starting city: ");
        String startCity = console.nextLine();

        while (!dataCities.containsKey(startCity)) {
            System.out.print("Invalid city. Please enter again: ");
            startCity = console.nextLine();
        }
        startFlight(console, startCity);

    }

    public static Map<String, List<String>> readData(String fileName) throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));

        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (line.trim().isEmpty()) continue;

            String[] parts = line.split(" -> ");
            if (parts.length < 2) continue;

            String from = parts[0].trim();
            String to = parts[1].trim();

            allCities.add(from);
            allCities.add(to);

            if (!dataCities.containsKey(from)) {
                dataCities.put(from, new ArrayList<>());
            }

            dataCities.get(from).add(to);
        }
        input.close();
        return dataCities;
    }

    public static void startFlight(Scanner console, String startCity) {
        String currentCity = startCity;
        List<String> visitedCities = new ArrayList<>();
        visitedCities.add(startCity);

        while (true) {
            System.out.printf("From %s you can fly directly to:%n", currentCity);
            List<String> destinations = dataCities.get(currentCity);

            for (String city : destinations) {
                System.out.println(" "+ city);
            }

            System.out.printf("Where do you want to go from %s? ", currentCity);
            String nextCity = console.nextLine();

            if (destinations.contains(nextCity)) {
                currentCity = nextCity;
                visitedCities.add(nextCity);

                if (currentCity.equals(startCity)) {
                    break;
                }
            } else {
                System.out.println("You can't get to that city by a direct flight.");
            }
        }
        System.out.println("The route you've chosen is:");
        System.out.print(String.join(" -> ", visitedCities));

    }
}
