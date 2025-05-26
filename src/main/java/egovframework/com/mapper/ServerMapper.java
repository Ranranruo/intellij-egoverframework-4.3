package egovframework.com.mapper;

import egovframework.let.server.service.ServerVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ServerMapper {
    void save(ServerVO serverVO);
}
