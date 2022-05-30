package com.shoptruongcr.common;

import java.util.List;

public interface EntityMapper<D,E> {

    E toEntity(D dto);

    D toDto(E Entity);

    List<E> toEntity(List<D> dList);

    List<D> toDto(List<E> eList);

}
