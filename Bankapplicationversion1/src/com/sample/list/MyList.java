package com.sample.list;

public interface MyList {
                boolean add(int number);
                int get(int Index);
                String getAll();
                boolean update(int Index,int number);
                int remove(int Index);
}
