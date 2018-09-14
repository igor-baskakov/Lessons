package SE.SE01.t06;

import java.util.Scanner;

public class Note {

    private static int end = 5; // maximum number of entries

    private static void createEntry() {
        System.out.println("enter entry");
        Scanner sc = new Scanner(System.in);
        String entry = sc.nextLine();
        for (int i = 0; i <= end; i++) {
            if (i == end) {
                System.out.println("number of entry exceeded");
                return;
            }
            if (note[i] == null) {
                note[i] = new Entry(entry);
                return;
            }
        }
    }

    private static void deleteEntry() {
        System.out.println("enter the entry number");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        for (int i = j - 1; i < end; i++) {
            if (i + 1 == end) {
                note[i] = null;
                return;
            }
            if (note[i + 1] != null) note[i] = note[i + 1];
            else {
                note[i] = null;
                return;
            }
        }
    }

    private static void editEntry() {
        System.out.println("enter the entry number");
        Scanner si = new Scanner(System.in);
        int i = si.nextInt();
        System.out.println("enter entry");
        Scanner ss = new Scanner(System.in);
        note[i-1].entry = ss.nextLine();
    }

    private static void printAllEntrys() {
        for (int i = 0; i < end; i++) {
            if (note[i] != null)
                System.out.println(i + 1 + " " + note[i].entry);
        }
    }

    private static Entry[] note = new Entry[end];

    public static void main(String[] args) {
        int a = 1;
        System.out.println("set the maximum number of records");
        while (a != 0) {
            System.out.println("Choose an action\n" +
                    "1 - create entry\n" +
                    "2 - delete entry\n" +
                    "3 - edit entry\n" +
                    "4 - print all entrys\n" +
                    "0 - exit programm\n"
            );
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                a = sc.nextInt();
            }

            if (a == 1) {
                Note.createEntry();
            }
            if (a == 2) {
                Note.deleteEntry();
            }
            if (a == 3) {
                Note.editEntry();
            }
            if (a == 4) {
                Note.printAllEntrys();
            }
        }

    }
}


