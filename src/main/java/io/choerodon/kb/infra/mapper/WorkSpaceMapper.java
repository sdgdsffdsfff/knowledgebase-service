package io.choerodon.kb.infra.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import io.choerodon.kb.infra.dataobject.PageDetailDO;
import io.choerodon.kb.infra.dataobject.WorkSpaceDO;
import io.choerodon.mybatis.common.BaseMapper;

/**
 * Created by Zenger on 2019/4/30.
 */
public interface WorkSpaceMapper extends BaseMapper<WorkSpaceDO> {

    Boolean hasChildWorkSpace(@Param("type") String type,
                              @Param("resourceId") Long resourceId,
                              @Param("parentId") Long parentId);

    String queryMaxRank(@Param("type") String type,
                        @Param("resourceId") Long resourceId,
                        @Param("parentId") Long parentId);

    PageDetailDO queryDetail(@Param("id") Long id);

    PageDetailDO queryReferenceDetail(@Param("id") Long id);

    void deleteByRoute(@Param("route") String route);

    List<WorkSpaceDO> workSpaceListByParentIds(@Param("resourceId") Long resourceId,
                                               @Param("parentIds") List<Long> parentIds,
                                               @Param("type") String type
    );

    List<WorkSpaceDO> workSpaceListByParentId(@Param("resourceId") Long resourceId,
                                              @Param("parentId") Long parentId,
                                              @Param("type") String type
    );
}
