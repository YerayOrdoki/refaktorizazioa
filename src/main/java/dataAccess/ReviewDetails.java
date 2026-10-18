package dataAccess;

public class ReviewDetails {
    private String comment;
    private int stars;

    public ReviewDetails(String comment, int stars) {
        this.comment = comment;
        this.stars = stars;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}