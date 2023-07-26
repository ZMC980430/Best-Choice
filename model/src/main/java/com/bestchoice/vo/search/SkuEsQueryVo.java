package com.bestchoice.vo.search;

// 封装查询条件
public class SkuEsQueryVo {

    private Long categoryId;
    ;//三级分类id

    private String keyword;//检索的关键字

    private Long wareId;

    public SkuEsQueryVo() {
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public Long getWareId() {
        return this.wareId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SkuEsQueryVo)) return false;
        final SkuEsQueryVo other = (SkuEsQueryVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$categoryId = this.getCategoryId();
        final Object other$categoryId = other.getCategoryId();
        if (this$categoryId == null ? other$categoryId != null : !this$categoryId.equals(other$categoryId))
            return false;
        final Object this$keyword = this.getKeyword();
        final Object other$keyword = other.getKeyword();
        if (this$keyword == null ? other$keyword != null : !this$keyword.equals(other$keyword)) return false;
        final Object this$wareId = this.getWareId();
        final Object other$wareId = other.getWareId();
        if (this$wareId == null ? other$wareId != null : !this$wareId.equals(other$wareId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SkuEsQueryVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $categoryId = this.getCategoryId();
        result = result * PRIME + ($categoryId == null ? 43 : $categoryId.hashCode());
        final Object $keyword = this.getKeyword();
        result = result * PRIME + ($keyword == null ? 43 : $keyword.hashCode());
        final Object $wareId = this.getWareId();
        result = result * PRIME + ($wareId == null ? 43 : $wareId.hashCode());
        return result;
    }

    public String toString() {
        return "SkuEsQueryVo(categoryId=" + this.getCategoryId() + ", keyword=" + this.getKeyword() + ", wareId=" + this.getWareId() + ")";
    }
}
