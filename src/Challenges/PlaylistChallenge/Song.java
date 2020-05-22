package Challenges.PlaylistChallenge;

public class Song {
  private String title;
  private double songDuration;

  public Song (String songName, double songDuration) {
    this.title = songName;
    this.songDuration = songDuration;
  }

  public String getTitle() {
    return title;
  }

  @Override
  public String toString() {
    return "Song: " + this.title + " with duration of " + songDuration;
  }
}

