package io.choerodon.kb.domain.kb.repository;

import java.util.List;

import io.choerodon.kb.domain.kb.entity.PageAttachmentE;

/**
 * Created by Zenger on 2019/4/29.
 */
public interface PageAttachmentRepository {

    PageAttachmentE insert(PageAttachmentE pageAttachmentE);

    PageAttachmentE selectById(Long id);

    List<PageAttachmentE> selectByPageId(Long pageId);

    void delete(Long id);
}
