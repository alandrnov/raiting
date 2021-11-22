public class Result {
    String name;
    double place;
    double finishers;
    double rating;

    public Result(String name, double place, double finishers) {
        this.name = name;
        this.place = place;
        this.finishers = finishers;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPlace() {
        return place;
    }

    public void setPlace(double place) {
        this.place = place;
    }

    public double getFinishers() {
        return finishers;
    }

    public void setFinishers(double finishers) {
        this.finishers = finishers;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Result{" +
                "name='" + name + '\'' +
                ", place=" + Math.round(place) +
                ", finishers=" + Math.round(finishers) +
                ", rating=" + Math.round(rating) +
                '}';
    }
}
