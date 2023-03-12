package org.example;

public class MovieAfisha {
    private String[] movies = new String[0];
    private int limit;

    public MovieAfisha() {
        this.limit = 10;
    }

  /*  public MovieAfisha(int limit) {
        this.limit = limit;
    }*/

    public void addNew(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] showAll() {
        return movies;
    }

    public String[] showLast() {
        int result;
        if (movies.length < limit) {
            result = movies.length;
        } else {
            result = limit;
        }
        String[] tmp = new String[result];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}