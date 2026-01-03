package main.java;

import java.util.*;

class Box<T> {
    private T content;
    public void addBoxContent(T content) { this.content = content; }
    public T get() { return content; }
}

class Book implements Comparable<Book> {
    String title;
    int id;

    Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() { return "Book[ID=" + id + ", Title=" + title + "]"; }

    @Override
    public int compareTo(Book other) {
        if(this.title.length() < other.title.length()) return -1;
        if(this.title.length() > other.title.length()) return 1;
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        Book book = (Book) o;
        return id == book.id;
    }
}

public class CollectionsGenerics {
    public static void main(String[] args) {
        int[] array = new int[5];
        Integer[] integerArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Java", "Generics", "Collections"};

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(5);

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(103, "Java Basics"));
        bookList.add(new Book(101, "Advanced Generics"));
        bookList.add(new Book(102, "Spring Boot"));
        bookList.add(new Book(101, "Advanced Generics")); // Duplicate

        System.out.println("Original List: " + bookList.toString());

        Collections.sort(bookList); // Uses compareTo
        System.out.println("Sorted List (by ID): " + bookList);


        Book book1 = new Book(101, "Advanced Generics");
        Book book2 = new Book(102, "Spring Boot");
        book1.compareTo(book2);

        Set<Book> uniqueBooks = new HashSet<>();
        uniqueBooks.add(new Book(101, "Advanced Generics")); //8978
        uniqueBooks.add(new Book(102, "Spring Boot"));
        uniqueBooks.add(new Book(103, "Java Basics"));
        uniqueBooks.add(new Book(101, "Advanced Generics")); //98675
        System.out.println("Unique Set (Duplicates removed): " + uniqueBooks);

        Map<Integer, Book> libraryMap = new HashMap<>();
        libraryMap.put(101, new Book(101, "Advanced Generics"));
        libraryMap.put(102, new Book(102, "Spring Boot"));
        libraryMap.put(103, new Book(103, "Java Basics"));
        libraryMap.put(101, new Book(101, "Advanced Generics 2"));

        for(Map.Entry<Integer, Book> entry : libraryMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Map Search (ID 102): " + libraryMap.get(102));

        Box<String> statusBox = new Box<>();
        statusBox.addBoxContent("Library");
        System.out.println("Generic Box Content: " + statusBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.addBoxContent(101);
        System.out.println("Generic Box Content: " + intBox.get());

        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray2 = {"Java", "Generics", "Collections"};

        System.out.println("Printing Integer Array via Generic Method:");
        printArray(intArray);

        System.out.println("Printing String Array via Generic Method:");
        printArray(stringArray);
    }

    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}