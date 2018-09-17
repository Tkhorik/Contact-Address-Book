package myInterpritation;

import java.util.List;

/* E – Element (used extensively by the Java Collections Framework, for example ArrayList, Set etc.)
K – Key (Used in Map)
N – Number
T – Type
V – Value (Used in Map)
S,U,V etc. – 2nd, 3rd, 4th types
*/
public interface Repositry<T> {

    List<T> findAll();

    T save(T t);

    T findById(String id);

    void delete(T t);

}