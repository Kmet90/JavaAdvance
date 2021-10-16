package ExercisesDefiningClasses.PokemonTrainer06;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int badges;
    private List<Pokemon> pokemonCollection;

    public Trainer(String name) {
        this.name = name;
        this.badges = 0;
        this.pokemonCollection = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public List<Pokemon> getPokemonCollection() {
        return pokemonCollection;
    }

    public void setPokemonCollection(List<Pokemon> pokemonCollection) {
        this.pokemonCollection = pokemonCollection;
    }

    public void addPokemon(Pokemon pokemon){
        this.pokemonCollection.add(pokemon);
    }

    public void pokemonHealthLose() {
        List<Pokemon> collection = new ArrayList<>(this.pokemonCollection);
        ArrayDeque<Integer> removePokemonIndexes = new ArrayDeque<>();

        for (Pokemon pokemon : collection) {

            pokemon.setHealth(pokemon.getHealth() - 10);
            if (pokemon.getHealth() <= 0) {
                removePokemonIndexes.push(collection.indexOf(pokemon));
            }
        }
        while (!removePokemonIndexes.isEmpty()) {
            int index = removePokemonIndexes.pop();
            collection.remove(index);
        }
        this.pokemonCollection = new ArrayList<>(collection);
    }

    public void awardBadge() {
        this.badges++;
    }
    public String printTrainer() {
        return String.format("%s %d %d"
                , this.name, this.badges, pokemonCollection.size());
    }
}
