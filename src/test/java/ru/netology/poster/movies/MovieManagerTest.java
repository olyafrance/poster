package ru.netology.poster.movies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void testNullPoster() {
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findAllMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testAddOneMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovies("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAllMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testAddFourMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovies("Бладшот");
        manager.addMovies("Вперед");
        manager.addMovies("Отель Белград");
        manager.addMovies("Джентельмены");

        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены"};
        String[] actual = manager.findAllMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testAddMovieMoreLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovies("Бладшот");
        manager.addMovies("Вперед");
        manager.addMovies("Отель Белград");
        manager.addMovies("Джентельмены");
        manager.addMovies("Человек неведимка");
        manager.addMovies("Тролли. Мировой тур");

        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены", "Человек неведимка", "Тролли. Мировой тур"};
        String[] actual = manager.findAllMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testShowReverseMovieLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovies("Бладшот");
        manager.addMovies("Вперед");
        manager.addMovies("Отель Белград");
        manager.addMovies("Джентельмены");
        manager.addMovies("Человек неведимка");

        String[] expected = {"Человек неведимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShowReverseMovieLessLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovies("Бладшот");
        manager.addMovies("Вперед");
        manager.addMovies("Отель Белград");

        String[] expected = {"Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShowReverseMovieOverLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovies("Бладшот");
        manager.addMovies("Вперед");
        manager.addMovies("Отель Белград");
        manager.addMovies("Джентельмены");
        manager.addMovies("Человек неведимка");
        manager.addMovies("Тролли. Мировой тур");

        String[] expected = {"Тролли. Мировой тур", "Человек неведимка", "Джентельмены", "Отель Белград", "Вперед"};
        String[] actual = manager.findLastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShowReverseMovieNewLimit() {
        MovieManager manager = new MovieManager(6);

        manager.addMovies("Бладшот");
        manager.addMovies("Вперед");
        manager.addMovies("Отель Белград");
        manager.addMovies("Джентельмены");
        manager.addMovies("Человек неведимка");
        manager.addMovies("Тролли. Мировой тур");

        String[] expected = {"Тролли. Мировой тур", "Человек неведимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShowReverseMovieLessNewLimit() {
        MovieManager manager = new MovieManager(6);

        manager.addMovies("Бладшот");
        manager.addMovies("Вперед");
        manager.addMovies("Отель Белград");
        manager.addMovies("Джентельмены");
        manager.addMovies("Человек неведимка");

        String[] expected = {"Человек неведимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShowReverseMovieOverNewLimit() {
        MovieManager manager = new MovieManager(6);

        manager.addMovies("Бладшот");
        manager.addMovies("Вперед");
        manager.addMovies("Отель Белград");
        manager.addMovies("Джентельмены");
        manager.addMovies("Человек неведимка");
        manager.addMovies("Тролли. Мировой тур");
        manager.addMovies("Номер Один");

        String[] expected = {"Номер Один", "Тролли. Мировой тур", "Человек неведимка", "Джентельмены", "Отель Белград", "Вперед"};
        String[] actual = manager.findLastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

}
