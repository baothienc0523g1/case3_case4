package com.example.nuoiemproject.nguoi_nuoi.service;

import com.example.nuoiemproject.nguoi_nuoi.model.NguoiNuoi;
import com.example.nuoiemproject.nguoi_nuoi.model.NguoiNuoiDto;

import java.util.List;

public interface INguoiNuoiService {
    List<NguoiNuoi> hienThiDanhSach();
    NguoiNuoi xemChiTiet(int maNguoiNuoi);
    void them(NguoiNuoi nguoiNuoi);
    void sua(NguoiNuoi nguoiNuoi);
    void xoa(int maNguoiNuoi);
    List<NguoiNuoiDto> xemTreEmNhan(int maNguoiNuoi);
}
