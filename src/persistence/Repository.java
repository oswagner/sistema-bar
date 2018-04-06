package persistence;

import java.util.List;

public interface Repository<T> {
    void salvar(List<T> item);

    void atulizar(T item);

    void remover(T item);

    List<T> buscar(String specification);
}
