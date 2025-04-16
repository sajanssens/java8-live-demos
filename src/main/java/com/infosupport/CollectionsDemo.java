package com.infosupport;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsDemo {

    // JCF: Java Collections Framework
    // - List:  geordend (op index),   mag duplicaten bevatten
    // - Set: ongeordend (geen index), mag GEEN duplicaten, zoals bijv. wiskundige verzamelingen, bijv. natuurlijke getallen
    // - Map: tabel met key/value pairs (a.k.a. Dictionary, maar heet in Java een Map)
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();   // [1, 2, 3, 4, ...]
        List<Integer> linkedList = new LinkedList<>(); // start -> 1 -> 2 -> 3 -> 4 -> ... -> end

        Set<PersonToo> hashSet = new HashSet<>(); // elementen in een hashtable: key is de hashcode, value is een list van objecten met die hashcode
        Set<PersonToo> treeSet = new TreeSet<>(); // elementen in een gesorteerde binary tree
    }
}

class PersonToo implements Comparable<PersonToo> {
    private String name;
    private int bsn;
    private int shoesize;

    public PersonToo(String name, int bsn, int shoesize) {
        this.name = name;
        this.bsn = bsn;
        this.shoesize = shoesize;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PersonToo personToo = (PersonToo) o;
        return bsn == personToo.bsn && Objects.equals(name, personToo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, bsn);
    }

    @Override
    public int compareTo(PersonToo o) {
        return shoesize - o.shoesize;
    }
}
