/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.Scanner;

/**
 *
 * @author user
 */
class App {
    private User []users = new User[100];
    private Book []books = new Book[100];
    public void run(){
        while(true){
            
        System.out.println("0.Выйти из программы");
        System.out.println("1.Добавить пользователя");
        System.out.println("2.Добавить книгу");
        System.out.println("3.Вывести список пользователей");
        System.out.println("4.Вывести список книг");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch(a){
            case 0:{
                System.exit(0);
            }
            case 1:{
                for(int i = 0; i < users.length;i++){
                    if(users[i]== null){
                        System.out.println("Введите имя: ");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        System.out.println("Введите Телефон: ");
                        String number = scanner.nextLine();
                        users[i]=new User(name, number);
                        break;
                    }
                    
                }
                break;
            }
            case 2:{
                for(int i = 0; i < books.length;i++){
                    if(books[i]== null){
                        System.out.println("Введите название книги: ");
                        scanner.nextLine();
                        String booksname = scanner.nextLine();
                        System.out.println("Введите автора: ");
                        String authorsname = scanner.nextLine();
                        System.out.println("Введите год издания: ");
                        String date = scanner.nextLine();
                        books[i]=new Book(booksname, authorsname, date);
                        break;
                    }
                }
                break;
            }
            case 3:{
                for(int i = 0; i < users.length;i++){
                    if(users[i]!= null){
                        System.out.println("Пользователь: ");
                        System.out.println(users[i].getName());
                    }
                }
                break;
            }   
            case 4:{
                for(int i = 0; i < books.length;i++){
                    if(books[i]!= null){
                        System.out.println("Книга: ");
                        System.out.println(books[i].getName());
                        System.out.println("Автор: ");
                        System.out.println(books[i].getAuthor());
                    }
                }
                break;
            }
        }
        }
    }   
}
