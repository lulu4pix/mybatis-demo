package com.shishi.Mapper;

import com.shishi.beans.Walle;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WalleMapper {
    public List<Walle> findAll();
}
