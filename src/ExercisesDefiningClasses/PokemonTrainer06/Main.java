package ExercisesDefiningClasses.PokemonTrainer06;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Trainer> trainers = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Tournament")) {
            String[] tokens = input.split("\\s");
            String trainerName = tokens[0];

            Trainer trainer;
            if (trainers.containsKey(trainerName)) {
                trainer = trainers.get(trainerName);
            } else {
                trainer = new Trainer(trainerName);
            }

            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            trainer.addPokemon(pokemon);
            trainers.put(trainerName, trainer);

            input = scanner.nextLine();

        }
        input = scanner.nextLine();

        while (!input.equals("End")) {

            for (Trainer trainer : trainers.values()) {
                boolean pokemonNotFound = true;
                for (Pokemon pokemon : trainer.getPokemonCollection()) {
                    if (input.equals(pokemon.getElement())) {
                        pokemonNotFound = false;
                        break;
                    }
                }
                if (pokemonNotFound) {
                    trainer.pokemonHealthLose();
                }else {
                    trainer.awardBadge();
                }
            }
            input = scanner.nextLine();
        }
        trainers.values()
                .stream()
                .sorted((t1, t2) -> Integer.compare(t2.getBadges(), t1.getBadges()))
                .forEach(trainer -> System.out.println(trainer.printTrainer()));
    }
}
