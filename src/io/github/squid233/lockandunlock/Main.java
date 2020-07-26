package io.github.squid233.lockandunlock;

import java.util.Scanner;


/**
 * @author squid233
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("欢迎使用LockAndUnlock 1.0.0！");

        boolean exited = false;
        StringBuilder string;
        int mode;
        char[] chars;

        Maps maps = new Maps();

        while (!exited) {
            System.out.println("请选择模式：");
            System.out.println(
                    "┌--------------------------┐\n" +
                    "|1.Lock | 2.Unlock | 3.Exit|\n" +
                    "└--------------------------┘");

            mode = scanner.nextInt();

            if (mode == 1) {
                System.out.println("请输入要加密的字符：");
                scanner.nextLine();
                string = new StringBuilder(scanner.nextLine());

                chars = string.toString().toCharArray();
                string = new StringBuilder();

                for (int i = 0; i < chars.length; i++) {
                    if (maps.MAPS.get(chars[i]) != null) {
                        chars[i] = maps.MAPS.get(chars[i]);
                    }
                    string.append(chars[i]);
                }

                System.out.print("已成功加密！结果为：");
                System.out.println(string);
            } else if (mode == 2) {
                System.out.println("请输入要解密的字符：");
                scanner.nextLine();
                string = new StringBuilder(scanner.nextLine());

                chars = string.toString().toCharArray();
                string = new StringBuilder();

                for (int i = 0; i < chars.length; i++) {
                    if (maps.MAPS.get(chars[i]) != null) {
                        chars[i] = maps.MAPS.get(chars[i]);
                    }
                    string.append(chars[i]);
                }

                System.out.print("已成功解密！结果为：");
                System.out.println(string);
            } else if (mode == 3) {
                System.out.println("感谢使用！");
                exited = true;
            } else {
                System.out.println("未找到模式！请重新输入。");
            }
        }
    }
}
