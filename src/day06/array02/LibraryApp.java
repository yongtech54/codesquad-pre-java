package day06.array02;

class Books {
    String name;
    String author;

    Books() {}
    Books(String name, String author) {
        this.name = name;
        this.author = author;
    }
}

public class LibraryApp {
    static void print(Books[] library) {
        System.out.println("================책 목록================");

        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i].name + " | " + library[i].author);
        }
    }

    static void deepCopy(Books[] library, Books[] copyLibrary) {
        for (int i = 0; i < library.length; i++) {
            copyLibrary[i].name = library[i].name;
            copyLibrary[i].author = library[i].author;
        }
    }

    public static void main(String[] args) {
        Books[] libraryA = new Books[5];
        libraryA[0] = new Books("태백산맥", "조정래");
        libraryA[1] = new Books("이기적 유전자", "리처드 도킨즈");
        libraryA[2] = new Books("자전거 도둑", "박완서");
        libraryA[3] = new Books("토지", "박경리");
        libraryA[4] = new Books("대변동", "제러드 다이아몬드");

        Books[] libraryA1 = libraryA;
        Books[] libraryB = new Books[6];

        libraryB[0] = new Books();
        libraryB[1] = new Books();
        libraryB[2] = new Books();
        libraryB[3] = new Books();
        libraryB[4] = new Books();

        deepCopy(libraryA, libraryB);
        libraryB[5] = new Books("사피엔스", "유발 하라리");
        libraryA[2].name = "그 많던 싱아는 누가 다 먹었을까";

        print(libraryA);
        print(libraryA1);
        print(libraryB);
    }
}
