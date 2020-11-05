package org.aplas.soccermatch.model;

public class Player {
    private String homeTeam;
    private String awayTeam;
    private int homeImage;
    private int awayImage;

    public String getHomeTeam() {
        return homeTeam;
    }

    public Player(String homeTeam, String awayTeam, int homeImage, int awayImage) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeImage = homeImage;
        this.awayImage = awayImage;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getHomeImage() {
        return homeImage;
    }

    public void setHomeImage(int homeImage) {
        this.homeImage = homeImage;
    }

    public int getAwayImage() {
        return awayImage;
    }

    public void setAwayImage(int awayImage) {
        this.awayImage = awayImage;
    }
}
