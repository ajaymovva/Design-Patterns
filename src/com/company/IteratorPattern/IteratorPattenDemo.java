package com.company.IteratorPattern;

public class IteratorPattenDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
