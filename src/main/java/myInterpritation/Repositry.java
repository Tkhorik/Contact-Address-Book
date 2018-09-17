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

    public List<T> findAll();

    public T save(T t);

    public T findById(int id);

    public void delete(T t);

}