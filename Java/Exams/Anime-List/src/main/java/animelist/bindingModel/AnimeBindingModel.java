package animelist.bindingModel;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AnimeBindingModel {
    //TODO: Implement me ...

    @NotNull
    @Size(min=1)
    private String name;

    @NotNull
    @Size(min=1)
    private String watched;

    @NotNull
    @Size(min=1)
    private String description;

    private int rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWatched() {
        return watched;
    }

    public void setWatched(String watched) {
        this.watched = watched;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
