package com.fabianisai.ventas.Services;

import java.util.List;

public interface CRUD<T> {

    T registrar(T t);
    T modificar(T t);
    T leer(Long id);
    List<T> listar();
    void eliminar(Long id);

}
