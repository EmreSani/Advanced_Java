package generics.interfaces.example;
//uygulamadaki tüm repolar için standart
public interface Repo<T> {

    void save(T obj);

    T find();


}
