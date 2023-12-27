package com.example.nuoiemproject.tre_em.service;

import com.example.nuoiemproject.tre_em.model.TreEm;
import com.example.nuoiemproject.tre_em.model.TreEmDto;

import java.util.List;

public interface ITreEmService {
    List<TreEm> hienThiDanhSach();

    void them(TreEm treEm);

    void sua(int id, TreEm treEm);

    void xoa(int id);

    TreEm timId(int id);

    List<TreEmDto> hienThiDto();
}
