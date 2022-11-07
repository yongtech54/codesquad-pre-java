package day06.array03;

import java.util.ArrayList;

class Books {
    String title;
    String author;

    Books() {}

    Books(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Printer {
    static void printArray(ArrayList<Books> books) {
        for (int i = 0; i < books.size(); i++) {
            System.out.println("[Title] " + books.get(i).title + "\t[Author] "+ books.get(i).author);
        }
    }
}

class Copy {

    static void swallowCopy(ArrayList<Books> origin, ArrayList<Books> copy) {
        for (int i = 0; i < origin.size(); i++) {
            copy.add(origin.get(i));
        }
    }

    static void deepCopy(ArrayList<Books> origin, ArrayList<Books> copy) {
        for (int i = 0; i < origin.size(); i++) {
            copy.get(i).author = origin.get(i).author;
            copy.get(i).title = origin.get(i).title;
        }
    }
}

public class LibraryApp2 {

    public static void main(String[] args) {
        ArrayList<Books> libraryA = new ArrayList<Books>();
        ArrayList<Books> libraryA1 = new ArrayList<Books>();
        ArrayList<Books> libraryB = new ArrayList<Books>();

        libraryA.add(new Books("태백산맥", "조정래"));
        libraryA.add(new Books("이기적 유전자", "리처드 도킨즈"));
        libraryA.add(new Books("자전거 도둑", "박완서"));
        libraryA.add(new Books("토지", "박경리"));
        libraryA.add(new Books("대변동", "제레드 다이아몬드"));

        libraryB.add(new Books());
        libraryB.add(new Books());
        libraryB.add(new Books());
        libraryB.add(new Books());
        libraryB.add(new Books());

        Copy.swallowCopy(libraryA, libraryA1);
        Copy.deepCopy(libraryA, libraryB);

        libraryB.add(new Books("사피엔스", "유발 하라리"));
        libraryA.get(2).title = "그 많던 싱아는 누가 다 먹었을까";

        System.out.println("============[A 도서관]============");
        Printer.printArray(libraryA);

        System.out.println("============[A1 도서관]============");
        Printer.printArray(libraryA1);

        System.out.println("============[B 도서관]============");
        Printer.printArray(libraryB);

    }
}
