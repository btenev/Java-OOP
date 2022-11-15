package P5_Football_Team_Generator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Team> league = new LinkedHashMap<>();

        while (!input.equals("END")) {
            String[] tokens = input.split(";");
            String command = tokens[0];
            String teamName = tokens[1];

            try {
                switch (command) {
                    case "Team":
                            Team teamCurrent = new Team(teamName);
                            league.putIfAbsent(teamName, teamCurrent);
                        break;
                    case "Add":
                        if (league.containsKey(teamName)) {
                            String playerName = tokens[2];
                            int endurance = Integer.parseInt(tokens[3]);
                            int sprint = Integer.parseInt(tokens[4]);
                            int dribble = Integer.parseInt(tokens[5]);
                            int passing = Integer.parseInt(tokens[6]);
                            int shooting = Integer.parseInt(tokens[7]);

                                Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                                Team team = league.get(teamName);
                                team.addPlayer(player);

                        } else {
                            System.out.printf("Team %s does not exist.%n", teamName);
                        }
                        break;
                    case "Remove":
                        String playerName = tokens[2];
                        Team team = league.get(teamName);
                        team.removePlayer(playerName);
                        break;
                    case "Rating":
                        if (league.containsKey(teamName)) {
                            Team teamRating = league.get(teamName);
                            System.out.println(teamRating.getName() + " - " + Math.round(teamRating.getRating()));
                        } else {
                            System.out.printf("Team %s does not exist.%n", teamName);
                        }
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            input = scanner.nextLine();
        }
    }
}
