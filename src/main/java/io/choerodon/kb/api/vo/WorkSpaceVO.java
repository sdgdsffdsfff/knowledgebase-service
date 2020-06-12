package io.choerodon.kb.api.vo;

import java.util.List;

import io.choerodon.kb.infra.constants.EncryptConstants;
import org.hzero.starter.keyencrypt.core.Encrypt;

public class WorkSpaceVO {

    public WorkSpaceVO() {}

    public WorkSpaceVO(Long id, String name, String route) {
        this.id = id;
        this.name = name;
        this.route = route;
    }


    @Encrypt(EncryptConstants.TN_KB_WORK_SPACE)
    private Long id;

    private String name;

    private String route;

    private List<WorkSpaceVO> children;

    private Long baseId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setChildren(List<WorkSpaceVO> children) {
        this.children = children;
    }

    public List<WorkSpaceVO> getChildren() {
        return children;
    }

    public Long getBaseId() {
        return baseId;
    }

    public void setBaseId(Long baseId) {
        this.baseId = baseId;
    }
}
