package org.zephyrieal;

import org.json.*;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // read JSON from file
        // get file input stream
        InputStream is = new FileInputStream("src/main/resources/books.json");

        // A JSONTokener takes a source string and extracts characters and tokens from it.
        // It is used by the JSONObject and JSONArray constructors to parse JSON source strings.
        JSONTokener tokener = new JSONTokener(is);
        // process array token [
        JSONArray array = new JSONArray(tokener);

        // iterate over all books
        for (int i = 0; i < array.length(); i++) {
            // process all objects in array {
            JSONObject object = array.getJSONObject(i);

            // get values
            String title = object.getString("title");
            String author = object.getString("author");
            int year = object.getInt("year");
            String publisher = object.getString("publisher");
            String genre = object.getString("genre");

            // create new book
            // You don't have to do this, but I do have a toString() method in Book.java
            Book book = new Book(title, author, year, publisher, genre);

            // using the toString() method
            System.out.println(book);
        }

        // Write to JSON file
        // create new book
        Book book = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954, "Allen & Unwin", "High Fantasy");

        // create new JSON object
        JSONObject obj = new JSONObject();

        // add values to object
        obj.put("title", book.getTitle());
        obj.put("author", book.getAuthor());
        obj.put("year", book.getYear());
        obj.put("publisher", book.getPublisher());
        obj.put("genre", book.getCategory());

        // append object to array
        array.put(obj);

        // write to file
        // why not simply add it to the existing array? Because there is no way to append to a JSON file with JSON-java.
        FileWriter writer = new FileWriter("src/main/resources/books.json");
        writer.write(array.toString());
        writer.close();




    }
}