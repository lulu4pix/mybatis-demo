package com.shishi.Mapper;

import com.shishi.beans.Walle;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WalleMapper {
    public List<Walle> findAll();

    public List<Walle> findCidRange(int cid);

    public Walle findByCid(int cid);

    public void deleteOne(int cid);

    public void insertOne(Walle walle);

    public void updateOne(Walle walle);

}
