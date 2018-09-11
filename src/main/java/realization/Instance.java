package realization;

/* E – Element (used extensively by the Java Collections Framework, for example ArrayList, Set etc.)
K – Key (Used in Map)
N – Number
T – Type
V – Value (Used in Map)
S,U,V etc. – 2nd, 3rd, 4th types
*/
public interface Instance<T> {
    public void getAll(T t);

    public void addNewContact(T t);

    public void removeUserContact(T t);

    public void removeAll(T t);

}