package com.company.IteratorPattern;

public class NameIterator implements Iterator{
    public Object [] List;
    int index;

    public NameIterator(Object []List){
        this.List = List;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return this.index < List.length;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return this.List[this.index++];
        }
        else{
            return null;
        }
    }
}
