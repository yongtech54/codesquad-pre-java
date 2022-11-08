package day07.copytest;

import java.util.ArrayList;

class Books {
    private String title;
    private String author;

    Books() {}

    Books(String title, String author) {
        this.title = title;
        this.author = author;
    }

    String getTitle() {
        return this.title;
    }

    String getAuthor() {
        return this.author;
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setAuthor(String author) {
        this.author = author;
    }
}

// 수정 / 복사 / 조회의 역할 담당
class Library {

    static void showInfo(ArrayList<Books> books) {
        for (Books book : books) {
            System.out.println(book.getTitle() + " | " + book.getAuthor());
        }
    }

    static void editTitle(ArrayList<Books> books, int n, String title) {
        books.get(n).setTitle(title);
    }

    static void deepCopy(ArrayList<Books> origin, ArrayList<Books> copy) {
        for (int i = 0; i < origin.size(); i++) {
            copy.get(i).setTitle(origin.get(i).getTitle());
            copy.get(i).setAuthor(origin.get(i).getAuthor());
        }
    }
}

public class CopyTest {
    public static void main(String[] args) {
        ArrayList<Books> origin = new ArrayList<Books>();

        origin.add(new Books("제목1", "저자1"));
        origin.add(new Books("제목2", "저자2"));
        origin.add(new Books("제목3", "저자3"));
        origin.add(new Books("제목4", "저자4"));
        origin.add(new Books("제목5", "저자5"));

        // 얕은 복사
        ArrayList<Books> copy1 = origin;

        // 깊은 복사
        ArrayList<Books> copy2 = new ArrayList<Books>();
        for (int i = 0; i < 5; i++) {
            copy2.add(new Books());
        }

        Library.deepCopy(origin, copy2);

        // 수정 내용
        Library.editTitle(origin, 2, "변경1");
        copy2.add(new Books("추가1", "추가1"));

        // library A (원본) 출력
        System.out.println("==============A 도서관==============");
        Library.showInfo(origin);

        // library A1 (얕은 복사) 출력
        System.out.println("==============A1 도서관==============");
        Library.showInfo(copy1);

        // library B (깊은 복사) 출력
        System.out.println("==============B 도서관==============");
        Library.showInfo(copy2);
    }
}
