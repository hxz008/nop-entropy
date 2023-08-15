package io.nop.file.core.chunk;

import io.nop.api.core.annotations.data.DataBean;

import java.util.List;

@DataBean
public class FinishChunkRequestBean {
    /**
     * 文件名
     */
    private String filename;

    /**
     * startChunkApi 返回的
     */
    private String key;

    /**
     * startChunkApi返回的
     */
    private String uploadId;

    private List<PartInfo> partList;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUploadId() {
        return uploadId;
    }

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    public List<PartInfo> getPartList() {
        return partList;
    }

    public void setPartList(List<PartInfo> partList) {
        this.partList = partList;
    }
}
