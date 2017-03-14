package pacquiao;

import java.util.Scanner;

public class pacmanmain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        paclass play = new paclass();
        paclass p1 = new paclass();
        p1.setGerak(26);
        String objek[][] = {
            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
            {"#", "☻", " ", " ", " ", " ", " ", " ", " ", "#"},
            {"#", " ", " ", " ", " ", " ", " ", " ", " ", "#"},
            {"#", " ", "#", "#", "#", "#", "#", "#", "#", "#"},
            {"#", " ", "O", " ", " ", " ", "O", " ", " ", "#"},
            {"#", "#", "#", "#", "#", "#", "#", "#", " ", "#"},
            {"#", " ", " ", " ", " ", "O", " ", " ", " ", "#"},
            {"#", " ", "#", "#", "#", "#", "#", "#", "#", "#"},
            {"#", " ", " ", " ", " ", " ", "O", " ", " ", "#"},
            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"}};
        do {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(objek[i][j]);
                }
                System.out.println("");
            }
            System.out.println("\nPACQUIAO");
            System.out.println("--------------------------------");
            System.out.print("W, A, S, D dan Q (untuk keluar) = ");
            String player = null;
            player = in.nextLine();
            System.out.println("Move : "+ p1.getGerak());

            if (player.equalsIgnoreCase("w")) {
                if (objek[p1.getY() - 1][p1.getX()].equals(" ")) {
                    objek[p1.getY()][p1.getX()] = " ";
                    objek[p1.getY() - 1][p1.getX()] = "☻";
                    p1.atas();
                } else if (objek[p1.getY() - 1][p1.getX()].equals("O")) {
                    objek[p1.getY()][p1.getX()] = " ";
                    objek[p1.getY() - 1][p1.getX()] = "☻";
                    p1.atas();
                    p1.skor();
                } else if (objek[p1.getY() - 1][p1.getX()].equals("#")) {
                    continue;
                }
            }
            if (player.equalsIgnoreCase("a")) {
                if (objek[p1.getY()][p1.getX() - 1].equals(" ")) {
                    objek[p1.getY()][p1.getX()] = " ";
                    objek[p1.getY()][p1.getX() - 1] = "☻";
                    p1.kiri();
                } else if (objek[p1.getY()][p1.getX() - 1].equals("O")) {
                    objek[p1.getY()][p1.getX()] = " ";
                    objek[p1.getY()][p1.getX() - 1] = "☻";
                    p1.kiri();
                    p1.skor();
                } else if (objek[p1.getY()][p1.getX() - 1].equals("#")) {
                    continue;
                }
            }
            if (player.equalsIgnoreCase("d")) {
                if (objek[p1.getY()][p1.getX() + 1].equals(" ")) {
                    objek[p1.getY()][p1.getX()] = " ";
                    objek[p1.getY()][p1.getX() + 1] = "☻";
                    p1.kanan();
                } else if (objek[p1.getY()][p1.getX() + 1].equals("O")) {
                    objek[p1.getY()][p1.getX()] = " ";
                    objek[p1.getY()][p1.getX() + 1] = "☻";
                    p1.kanan();
                    p1.skor();
                } else if (objek[p1.getY()][p1.getX() + 1].equals("#")) {
                    continue;
                }
            }
            if (player.equalsIgnoreCase("s")) {
                if (objek[p1.getY() + 1][p1.getX()].equals(" ")) {
                    objek[p1.getY()][p1.getX()] = " ";
                    objek[p1.getY() + 1][p1.getX()] = "☻";
                    p1.bawah();
                } else if (objek[p1.getY() + 1][p1.getX()].equals("O")) {
                    objek[p1.getY()][p1.getX()] = " ";
                    objek[p1.getY() + 1][p1.getX()] = "☻";
                    p1.bawah();
                    p1.skor();
                } else if (objek[p1.getY() + 1][p1.getX()].equals("#")) {
                    continue;
                }
            }

        } while (p1.getGerak() > 0);
        if (p1.getSkor()==4) {
            System.out.println("\n--EZ--");
        }
        else{
            System.out.println("\n--NOOB--");
        }
    }
}
