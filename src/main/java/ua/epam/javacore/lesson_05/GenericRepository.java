package ua.epam.javacore.lesson_05;

public interface GenericRepository<T, ID> {
    T create(T t);

    T update(T t);

    void delete(ID id);

    T getById(ID id);
}
