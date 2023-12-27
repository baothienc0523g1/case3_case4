package com.example.nuoiemproject.giao_dich.service;

import com.example.nuoiemproject.giao_dich.model.GiaoDich;
import com.example.nuoiemproject.giao_dich.model.GiaoDichChi;

import java.util.List;

public interface IGiaoDichService {
    List<GiaoDich> danhSachGiaoDich(int thang, int nam);
    void them(GiaoDich giaoDich);
    void themChi(GiaoDichChi giaoDichChi);
}
